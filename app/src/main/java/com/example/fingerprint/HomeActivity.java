package com.example.fingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button, submitButton;
    private TextView textView;
    private DatePickerDialog datePickerDialog;

    private TextInputEditText editText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        textView= (TextView) findViewById(R.id.dateShow);
        //button= (Button) findViewById(R.id.button);
        submitButton= (Button) findViewById(R.id.button2);
        editText =(TextInputEditText)findViewById(R.id.editTextDOB);
        editText.setOnClickListener(this);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username
                //String username = editTextUsername.getText().toString();
                //String password = editTextPassword.getText().toString();

                // Check if the username matches the expected value
                if (true) {
                    // Username matches, navigate to the home activity
                    Intent intent = new Intent(HomeActivity.this, UserDetailsActivity.class);
                    startActivity(intent);
                } else {
                    // Username doesn't match, show an error or message
                    // You can display a Toast or TextView with an error message
                }
            }
        });



    }

    @Override
    public void onClick(View v) {


        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(android.widget.DatePicker view, int selectedYear, int selectedMonth, int selectedDay) {
                // Handle the selected date here
                String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" +selectedYear ;
                //textView.setText(selectedDate);
                editText.setText(selectedDate);
                // You can use the selectedDate as needed in your application
            }
        }, year, month, day);
        datePickerDialog.show();

//        DatePicker datePicker=new DatePicker(this);
//        int currentDay= datePicker.getDayOfMonth();
//        int currentMonth=(datePicker.getMonth())+1;
//        int currentYear=datePicker.getYear();
//
//        datePickerDialog= new DatePickerDialog(this,
//                new DatePickerDialog.OnDateSetListener(){
//                    @Override
//                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                        textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);
//                    }
//                },currentDay,currentMonth,currentYear
//
//                );
//        datePickerDialog.show();
    }
}