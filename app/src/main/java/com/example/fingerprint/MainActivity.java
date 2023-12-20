package com.example.fingerprint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FirebaseInstallations.getInstance().getId()
//                .addOnCompleteListener(new OnCompleteListener<String>() {
//                    @Override
//                    public void onComplete(@NonNull Task<String> task) {
//                        if (task.isSuccessful()) {
//                            Log.d("Installations", "Installation ID: " + task.getResult());
//                        } else {
//                            Log.e("Installations", "Unable to get Installation ID");
//                        }
//                    }
//                });

        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.loginButton);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the entered username




                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Check if the username matches the expected value
                if (username.equals("r")&& password.equals("1")) {
                    // Username matches, navigate to the home activity
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {

                    Toast.makeText(getApplicationContext(),"User login failed",Toast.LENGTH_SHORT).show();
                    // Username doesn't match, show an error or message
                    // You can display a Toast or TextView with an error message
                }
            }
        });
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        editTextUsername.setText("");
        editTextPassword.setText("");
    }
}