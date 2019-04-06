package com.aalem.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    // Declare UI-elements variables
    EditText usdEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI-elements references
        usdEditText = findViewById(R.id.usdEditText);
        resultTextView = findViewById(R.id.resultTextView);
    }

    // function to get the value, calculate, and display it in resultTextView
    public void convertUSD(View v) {

        /* Check if the user has at least entered one digit in the editTextField.
            If so, then calculate and display the value in resultTextView,
            otherwise show user a toast notification.
         */

        if (usdEditText.getText().toString().length() > 0) {

            // Get the USD value from the usdEditText, calculate and store the result in result variable
            int result = Integer.parseInt(usdEditText.getText().toString()) * 75;

            // Number the number like 123,456
            DecimalFormat df = new DecimalFormat("#,###");

            // Format and set value to the resultTextView
            resultTextView.setText(df.format(result) + " Afn");

        } else {

            // Tell user that they need to enter a value before tapping the "Convert" button
            Toast.makeText(this,
                    "Please enter a USD value first.",
                    Toast.LENGTH_LONG
            ).show();
        }

    }

}
