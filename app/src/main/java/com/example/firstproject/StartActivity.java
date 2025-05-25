package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    private EditText txtuser, txtpass;
    private Button btnlogin;

    private final String username = "admin";
    private final String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        txtuser = findViewById(R.id.txtusername);
        txtpass = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.button); // Pastikan id tombolnya benar

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUser = txtuser.getText().toString();
                String inputPass = txtpass.getText().toString();

                if (inputUser.equals(username) && inputPass.equals(password)) {
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(StartActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
