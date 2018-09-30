package com.example.etri_hsyun.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view){

        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();

        //Convert value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        //Display the new value in the text view.
        showCountTextView.setText(count.toString());


    }

    public void randomMe(View view){
        //Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView showCountTextView = (TextView) findViewById(R.id.textView);

        String countString = showCountTextView.getText().toString();

        int count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);
        //Start the new activity
        startActivity(randomIntent);
    }

}
