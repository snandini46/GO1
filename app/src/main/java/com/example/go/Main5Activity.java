package com.example.go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        int a=3000,b=1500,c=3400,D=1200;
        final TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("MANURE : "+Integer.toString(a)+"KG");
        final TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("DDT : "+Integer.toString(b)+"PKTS");
        final TextView textView6 = findViewById(R.id.textView6);
        textView6.setText("PESTICIDE : "+Integer.toString(c)+"L");
        final TextView textView7 = findViewById(R.id.textView7);
        textView7.setText("INSECTICIDE : "+Integer.toString(D)+"L");
    }
}
