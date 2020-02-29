package com.example.go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        int a=2000,b=3000;
        final TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("COTTON : "+Integer.toString(a)+"KG");
        final TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("RUBBER : "+Integer.toString(b)+"L");
    }
}
