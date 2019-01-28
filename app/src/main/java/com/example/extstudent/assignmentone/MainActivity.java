/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #1
 * Tan, Jue
 */

package com.example.extstudent.assignmentone;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String firstName;
    private String lastName;

    private TextView firstNameTextView = null;
    private TextView lastNameTextView = null;
    private Button submitButton = null;
    private TextView resultTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.firstNameTextView= (TextView)findViewById(R.id.editTextFirstName);
        this.lastNameTextView = (TextView)findViewById(R.id.editTextLastName);
        this.resultTextView= (TextView)findViewById(R.id.textViewResult);
        this.submitButton = (Button)findViewById(R.id.submitButton);


        if (this.submitButton != null){
            this.submitButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    // hide keyboard
                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    //display
                    setUserInfo();
                    showResult();
                }
            });
        }
    }

    private void setUserInfo(){
        if (this.firstNameTextView != null){
            this.firstName= this.firstNameTextView.getText().toString();
            Log.i("First Name:", firstName);
        }

        if (this.lastNameTextView != null){
            this.lastName= this.lastNameTextView.getText().toString();
            Log.i("Last Name", lastName);
        }
    }

    private void showResult(){
        if (this.resultTextView != null){
            String sResult = firstName + " " + lastName + ".\n Nice to meet you!";

            this.resultTextView.setText(sResult);
            this.resultTextView.setGravity(Gravity.CENTER);
            this.resultTextView.setTextSize(24f);
            this.resultTextView.setTextColor(Color.DKGRAY);

        }
    }

}
