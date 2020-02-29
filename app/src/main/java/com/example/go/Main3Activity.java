package com.example.go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int a=13000,b=4500,c=340;
        final TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("RICE : "+Integer.toString(a)+"KG");
        final TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("WHEAT : "+Integer.toString(b)+"KG");
        final TextView textView6 = findViewById(R.id.textView6);
        textView6.setText("MOONGDAL : "+Integer.toString(c)+"KG");
    }
}
