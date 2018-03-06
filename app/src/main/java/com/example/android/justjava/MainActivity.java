package com.example.android.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int totalPrice = calculatePrice();
        String priceMessage = createOrderSummary(totalPrice, "Jasveer Singh");
        displayMessage(priceMessage);

    }

    /**
     * this method display order summary
     *
     * @price for total price of order
     * @name for person name
     * @orderSummary return String of order
     */
    private String createOrderSummary(int price, String name) {
        String orderSummary = "Name: " + name;
        orderSummary += "\nQuantity: " + quantity;
        orderSummary += "\nTotal: $" + price + "\nThanks You!";
        return orderSummary;
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }





    public void increment(View view) {

        quantity = quantity + 2;
        displayQuantity(quantity);
    }

    public void decrement(View view) {

        quantity = quantity - 2;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * Calculates the price of the order.
     *
     * @return total price
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }
}