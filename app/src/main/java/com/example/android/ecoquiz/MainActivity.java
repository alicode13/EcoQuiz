package com.example.android.ecoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void displayMessage(String message) {
        TextView resultTextView = (TextView) findViewById(R.id.results_textview);
        resultTextView.setText(message);

        /**
         * private void displayMessage(String message) {
         TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
         orderSummaryTextView.setText(message);
         }
         */
    }

    /**
     * CheckBox whippedCreamCheckBox = findViewById(R.id.notify_me_checkbox);
     * boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
     * CheckBox chocolateCheckBox = findViewById(R.id.notify_me_chococheckbox);
     * boolean hasChocolate = chocolateCheckBox.isChecked();
     */

    public void finishQuiz(View view) {

        CheckBox carUsageCheckbox = (CheckBox) findViewById(R.id.car_usage_checkbox);
        boolean wrongCarUsageCheckbox = carUsageCheckbox.isChecked();
    }

        void tallyPoints(boolean wrongCarUsageCheckbox) {
        int points = 0;
        if (wrongCarUsageCheckbox) {
            points = points + 1;
        }

    }

    private String results(String message, boolean wrongCarUsageCheckbox) {
        String resultMessage = "Wrong Answer";
        resultMessage += "Answer" + wrongCarUsageCheckbox;
        return resultMessage;
    }

    private void displayPoints(int number) {
        TextView pointsTextView = (TextView) findViewById(R.id.points_textview);
        pointsTextView.setText("" + number);
    }
}

