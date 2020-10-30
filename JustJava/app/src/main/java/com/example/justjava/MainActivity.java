package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int noOfCoffees=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox hasWhippedCream = (CheckBox) findViewById(R.id.checkBoxWhippedCream);
        CheckBox hasChocolate = (CheckBox) findViewById(R.id.checkbox_chocolate);
        boolean addChocolate = hasChocolate.isChecked();
        boolean addWhippedCream = hasWhippedCream.isChecked();
        EditText name = (EditText) findViewById(R.id.edit_text_name);
        String input = name.getText().toString();
        TextView quantity = (TextView) findViewById(R.id.quantity_text_view);
        noOfCoffees = Integer.parseInt(quantity.getText().toString());
        int totalPrice = calculatePrice(noOfCoffees,addWhippedCream,addChocolate);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"Order "+input);
        intent.putExtra(Intent.EXTRA_TEXT,createOrderSummary(input, totalPrice, addWhippedCream, addChocolate));
        if (intent.resolveActivity(getPackageManager())!= null ){
            startActivity(intent);
        }

        displayPrice(totalPrice);
//        displayMessage(createOrderSummary(input, totalPrice, addWhippedCream, addChocolate));
    }

    /**
     * This method increment no of coffees
     */
    public void incrementNoOfCoffees(View view) {
        if(noOfCoffees>=100){
            Toast toast= Toast.makeText(this,"You can't order coffee cups more than 100!",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }else{
            ++noOfCoffees;
        }
        displayQuantity(noOfCoffees);
    }

    /**
     * This method decrement no of coffees
     */
    public void decrementNoOfCoffees(View view) {
        if(noOfCoffees<=1){
            Toast toast= Toast.makeText(this,"You can't order coffee cups less than 1!",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        else {
            --noOfCoffees;
        }
        displayQuantity(noOfCoffees);
    }

    /**
     * This method display no of coffee and display on screen
     *
     * @param numberOfCoffees
     */

    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method displays price of coffees
     */
    private void displayPrice(int updatePrice) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(updatePrice));
    }

    /*
     * This method displayQuantity the text*/
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * This method calculate price
     *
     * @param quantity
     */
    public int calculatePrice(int quantity,boolean addWhippedCream,boolean addChocolate) {
        int basePrice=5;
        if (addWhippedCream == true) {
            basePrice = basePrice + 1;
        }
        if (addChocolate == true) {
            basePrice = basePrice + 2;
        }
    return basePrice*quantity;
    }

    /**
     * Create summary of the order.
     *
     * @param addWhippedCream    is whether or not the user wants whipped cream topping
     * @param addChocolate       is whether or not the user wants chocolate topping
     * @param totalPriceOfCoffee of the order
     * @return text summary
     */
    private String createOrderSummary(String name, int totalPriceOfCoffee, boolean addWhippedCream, boolean addChocolate) {
        String priceMessage = "Name: " + name + "\n";
        priceMessage += "Add Whipped Cream? " + addWhippedCream + "\n";
        priceMessage += "Add Chocolate? " + addChocolate + "\n";
        priceMessage += "Quantity: " + noOfCoffees + "\n";
        priceMessage += "Total: $" + totalPriceOfCoffee + "\n";
        priceMessage += "Thank you!";

        return priceMessage;
    }

}


