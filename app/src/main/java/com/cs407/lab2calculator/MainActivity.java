package com.cs407.lab2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickPlus(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            goToActivity(num1 + num2);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMinus(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            goToActivity(num1 - num2);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickMultiply(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            goToActivity(num1 * num2);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickDivide(View view) {
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        try {
            int num1 = Integer.parseInt(number1.getText().toString());
            int num2 = Integer.parseInt(number2.getText().toString());
            if (num2 == 0) {
                throw new IllegalArgumentException();
            }
            goToActivity(num1 / num2);
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_LONG).show();
        } catch (IllegalArgumentException e) {
            Toast.makeText(MainActivity.this, "Divide by zero error", Toast.LENGTH_LONG).show();
        }
    }

    public void goToActivity(int result) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}