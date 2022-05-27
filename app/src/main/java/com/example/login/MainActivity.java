package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Contacts;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Username;
    private TextView Password;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.edtusername);
        Password =findViewById(R.id.edtpassword);
        btn = findViewById(R.id.edtbtn);
        btn.setOnClickListener(new btnListener());

    }

    class btnListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Username.setText("kalyani");
            Password.setText("kalyani#12345");

        }
    }
}