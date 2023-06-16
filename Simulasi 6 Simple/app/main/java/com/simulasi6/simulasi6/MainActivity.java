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

    int kopi = 2;

    public void decrement(View view) {
        kopi = kopi - 1;

        TextView a = (TextView) findViewById(R.id.quantity_text_view);
        a.setText("" +kopi);
    }

    public void increment(View view) {
        kopi = kopi + 1;

        TextView b = (TextView) findViewById(R.id.quantity_text_view);
        b.setText("" +kopi);
    }

    public void submitOrder(View view) {
        TextView harga = (TextView) findViewById(R.id.price_text_view);
        harga.setText(NumberFormat.getCurrencyInstance(new Locale("ID", "id")).format(kopi*50000));
    }

}
