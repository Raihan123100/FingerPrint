package com.example.fingerprint;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;
import android.view.View;
import android.widget.Toast;

import Interfaces.MyApi;
import models.Post;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetailsActivity extends AppCompatActivity  {

    private MyApi myApi;
    private  Button button;
    TextView textView;


    private Button showMoreButton;
    private LinearLayout extraFieldsLayout;
    private Button openPopupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        showMoreButton = findViewById(R.id.showMoreButton);
        extraFieldsLayout = findViewById(R.id.extraFieldsLayout);
        openPopupButton = findViewById(R.id.btnNext);

        openPopupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });
        showMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle visibility of the second set of 6 input fields
                if (extraFieldsLayout.getVisibility() == View.GONE) {
                    extraFieldsLayout.setVisibility(View.VISIBLE);
                    showMoreButton.setText("Show Less");
                } else {
                    extraFieldsLayout.setVisibility(View.GONE);
                    showMoreButton.setText("Show More");
                }
            }
        });



       // button= (Button)findViewById(R.id.loginButton1);

//        Spinner spinner = findViewById(R.id.spinner);
//        textView= findViewById(R.id.textView5);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.programming_languages, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(getApplicationContext(),"Saved to DB",Toast.LENGTH_SHORT).show();
//
//                // Get the entered username
//                //String username = editTextUsername.getText().toString();
//                //String password = editTextPassword.getText().toString();
//
//                // Check if the username matches the expected value
////                if (true) {
////                    // Username matches, navigate to the home activity
////                    Intent intent = new Intent(UserDetailsActivity.this, ApiTestingActivity.class);
////                    startActivity(intent);
////                } else {
////                    // Username doesn't match, show an error or message
////                    // You can display a Toast or TextView with an error message
////                }
//            }
//        });

//        myApi = ((MyApplication) getApplication()).getMyApi();
//
//        Call<List<Post>> call = myApi.getPosts();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if (!response.isSuccessful()) {
//                    // Handle the error
//                    return;
//                }
//
//                List<Post> posts = response.body();
//                textView.setText((CharSequence) posts);
//                // Do something with the posts data
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                // Handle the failure
//            }
//        });
    }


//    public  void apiTest(){
//
//        myApi = ((MyApplication) getApplication()).getMyApi();
//
//        Call<List<Post>> call = myApi.getPosts();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if (!response.isSuccessful()) {
//                    // Handle the error
//                    return;
//                }
//
//                List<Post> posts = response.body();
//                textView.setText((CharSequence) posts);
//                // Do something with the posts data
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                // Handle the failure
//            }
//        });
//
//
//    }


    private void showInputDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_input, null);
        dialogBuilder.setView(dialogView);

        final EditText editText1 = dialogView.findViewById(R.id.editText1);
        final EditText editText2 = dialogView.findViewById(R.id.editText2);

        dialogBuilder.setTitle("Enter Application ID and A/C No");
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String input1 = editText1.getText().toString().trim();
                String input2 = editText2.getText().toString().trim();
                Toast.makeText(getApplicationContext(),"Saved to DB",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UserDetailsActivity.this, HomeActivity.class);
                startActivity(intent);
                // Do something with input1 and input2, e.g., display them or process further
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // Cancelled, do nothing
            }
        });

        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();
    }




}