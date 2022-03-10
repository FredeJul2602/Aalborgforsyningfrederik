package com.example.aalborgtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GlasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glas);

        TextView textView = (TextView) findViewById(R.id.glastextview);
        textView.setText("Her skal glas smides i såsom alt muligt med glas:");
    }
}