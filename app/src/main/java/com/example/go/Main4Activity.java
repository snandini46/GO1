package com.example.go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        int a=5600,b=400,c=340;
        final TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("COCONUT : "+Integer.toString(a));
        final TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("WATERMELON : "+Integer.toString(b));
        final TextView textView6 = findViewById(R.id.textView6);
        textView6.setText("ORANGE : "+Integer.toString(c)+"DOZEN");
    }
}
