package com.example.meet_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class helped extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helped);
    }

    public void back(View view) {
        Intent intent = new Intent(helped.this, Signed_in.class);
        startActivity(intent);
    }
}