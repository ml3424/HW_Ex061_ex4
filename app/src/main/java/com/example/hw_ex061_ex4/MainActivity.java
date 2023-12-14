package com.example.hw_ex061_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int counter = 0;
    int m = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
    }

    public void seven_boom(View view) {
        counter ++;
        if(counter < 7*m)
        {
            btn.setText("This is a click number: " + counter);
        }
        else
        {
            btn.setText("BOOM!");
            m++;
        }
    }
}