package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    EditText input;
    RadioButton r1, r2, r3, r4, r5, r6, r7, r8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editText);
        r1 = findViewById(R.id.rd1);
        r2 = findViewById(R.id.rd2);
        r3 = findViewById(R.id.rd3);
        r4 = findViewById(R.id.rd4);
        r5 = findViewById(R.id.rd5);
        r6 = findViewById(R.id.rd6);
        r7 = findViewById(R.id.rd7);
        r8 = findViewById(R.id.rd8);




    }

    public void con(View v){

        Double value = new Double(input.getText().toString());

        try {
            if (r1.isChecked()) {

                Double result = convert.usdtobdt(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" ৳");



            } else if (r2.isChecked()) {
                Double result = convert.bdttousd(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" $");
            } else if (r3.isChecked()) {
                Double result = convert.inrtobdt(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" ৳");
            } else if (r4.isChecked()) {
                Double result = convert.bdttoinr(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" ₹");
            } else if (r5.isChecked()) {
                Double result = convert.eurtobdt(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" ৳");
            } else if (r6.isChecked()) {
                Double result = convert.bdttoeur(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" €");
            } else if (r7.isChecked()) {
                Double result = convert.kwdtobdt(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+" ৳");
            } else {
                Double result = convert.bdttokwd(value);
                input.setText(new Double(new DecimalFormat("0.00").format(result)).toString()+"د.ك ");
            }
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Empty Input", Toast.LENGTH_LONG).show();
        }
    }

    public void about(View v){

        Intent in = new Intent(MainActivity.this,about.class);
        startActivity(in);
    }

    public void clear(View view) {
        input.setText(null);
    }
}