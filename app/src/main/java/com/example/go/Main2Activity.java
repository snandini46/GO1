package com.example.go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int a=5055,b=3200,c=980;
        final TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("ONION : "+Integer.toString(a)+"KG");
        final TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("POTATO : "+Integer.toString(b)+"KG");
        final TextView textView6 = findViewById(R.id.textView6);
        textView6.setText("TOMATO : "+Integer.toString(c)+"KG");
    }
}
