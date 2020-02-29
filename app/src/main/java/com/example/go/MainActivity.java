package com.example.go;
//package com.example.programmingknowledge.sqliteapp;
//
import android.content.Intent;
import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm2();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm3();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm4();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm5();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openm6();
            }
        });


    } public void openm2() {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void openm3() {
        Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void openm4() {
        Intent intent=new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void openm5() {
        Intent intent=new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void openm6() {
        Intent intent=new Intent(this,Main6Activity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {

    }
}
