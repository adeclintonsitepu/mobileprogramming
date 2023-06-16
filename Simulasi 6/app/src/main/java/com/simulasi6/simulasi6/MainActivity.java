package com.simulasi6.simulasi6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This app displays an order form to order coffee.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int banyakKopi = 3;
        display(banyakKopi);
        displayPrice(banyakKopi*50000);
    }

    /**
     * This method displays the given quantity value on the screen..
     */
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);;
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private void displayPrice(int number) {
        String COUNTRY = "ID";
        String LANGUAGE = "in";
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale(LANGUAGE, COUNTRY)).format(number));
    }
}
