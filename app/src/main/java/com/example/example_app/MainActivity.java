package com.example.example_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCorrect;
    private Button btnIncorrect;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCorrect = (Button) findViewById(R.id.btn_correct);

        btnCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, R.string.correct_banner, Toast.LENGTH_SHORT).show();
            }
        });

        btnIncorrect = (Button) findViewById(R.id.btn_incorrect);

        btnIncorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.incorrect_banner, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}

