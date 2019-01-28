/*
 * CSE41246 - Android Java Fundamentals
 * Fall 2019
 * Assignment #1
 * Tan, Jue
 */

package com.example.extstudent.assignmentone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        this.submitButton.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View v){

            }
        }

    }

    private void setUserInfo(){

    }

    private void showResult(){

    }

}
