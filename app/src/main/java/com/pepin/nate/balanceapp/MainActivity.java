package com.pepin.nate.balanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {

    public void addTotal(View view) {

        EditText a100 = (EditText) findViewById(R.id.a100);
        EditText a50 = (EditText) findViewById(R.id.a50);
        EditText a20 = (EditText) findViewById(R.id.a20);
        EditText a10 = (EditText) findViewById(R.id.a10);
        EditText a5 = (EditText) findViewById(R.id.a5);
        EditText a2 = (EditText) findViewById(R.id.a2);
        EditText a1 = (EditText) findViewById(R.id.a1);

            //Add Cents
        EditText c100 = (EditText) findViewById(R.id.c100);
        EditText c50 = (EditText) findViewById(R.id.c50);
        EditText c25 = (EditText) findViewById(R.id.c25);
        EditText c10 = (EditText) findViewById(R.id.c10);
        EditText c5 = (EditText) findViewById(R.id.c5);
        EditText c1 = (EditText) findViewById(R.id.c1);

        Double grandTotal = 0.00;

        if (a100.getText().length() != 0) grandTotal += Double.parseDouble(a100.getText().toString());
        if (a50.getText().length() != 0) grandTotal += Double.parseDouble(a50.getText().toString());
        if (a20.getText().length() != 0) grandTotal += Double.parseDouble(a20.getText().toString());
        if (a10.getText().length() != 0) grandTotal += Double.parseDouble(a10.getText().toString());
        if (a5.getText().length() != 0) grandTotal += Double.parseDouble(a5.getText().toString());
        if (a2.getText().length() != 0) grandTotal += Double.parseDouble(a2.getText().toString());
        if (a1.getText().length() != 0) grandTotal += Double.parseDouble(a1.getText().toString());

        if (c100.getText().length() != 0) grandTotal += Double.parseDouble(c100.getText().toString());
        if (c50.getText().length() != 0) grandTotal += Double.parseDouble(c50.getText().toString());
        if (c25.getText().length() != 0) grandTotal += Double.parseDouble(c25.getText().toString());
        if (c10.getText().length() != 0) grandTotal += Double.parseDouble(c10.getText().toString());
        if (c5.getText().length() != 0) grandTotal += Double.parseDouble(c5.getText().toString());
        if (c1.getText().length() != 0) grandTotal += Double.parseDouble(c1.getText().toString());

        DecimalFormat setOutPut = new DecimalFormat("#.00");


        TextView total = (TextView) findViewById(R.id.total);
        total.setText("$" + setOutPut.format(grandTotal));


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
