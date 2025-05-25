package com.example.firstproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class loginactivity extends AppCompatActivity {
    private EditText txtuser, txtpass;
    private Button btnlogin;
    private final String username = "admin";
    private final String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginactivity);

        txtuser = findViewById(R.id.txtusername);
        txtpass = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUser = txtuser.getText().toString();
                String inputPass = txtpass.getText().toString();

                if (inputUser.equalsIgnoreCase(username) && inputPass.equalsIgnoreCase(password)) {
                    // Login berhasil -> pindah ke homeactivity
                    Intent intent = new Intent(loginactivity.this, homeactivity.class);
                    startActivity(intent);
                    finish(); // agar tidak bisa kembali ke login
                } else {
                    Toast.makeText(loginactivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
