package com.example.svetofor;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svetofor);

        Button redButton = findViewById(R.id.redButton);
        Button yellowButton = findViewById(R.id.yellowButton);
        Button greenButton = findViewById(R.id.greenButton);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Устанавливаем желтый цвет фона
                getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Устанавливаем зеленый цвет фона
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        });
    }
}
