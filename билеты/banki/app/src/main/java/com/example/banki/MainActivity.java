package com.example.banki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvInterestRate_VTB;
    private TextView tvInterestRate_Sberbank;
    private TextView tvInterestRate_AlfaBank;
    private TextView tvConfirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banki);

        tvInterestRate_VTB = findViewById(R.id.tvInterestRate_VTB);
        tvInterestRate_Sberbank = findViewById(R.id.tvInterestRate_Sberbank);
        tvInterestRate_AlfaBank = findViewById(R.id.tvInterestRate_AlfaBank);
        tvConfirmation = findViewById(R.id.tvConfirmation);
    }

    public void onClickVTB(View view) {
        // Скрыть предыдущие надписи
        tvInterestRate_Sberbank.setText("");
        tvInterestRate_AlfaBank.setText("");

        // Установить новый текст
        tvInterestRate_VTB.setText("Процентная ставка: 6%");

        // Установить новое местоположение и сделать видимым
        tvConfirmation.setText("Спасибо за ваш выбор!");
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) tvConfirmation.getLayoutParams();
        params.addRule(RelativeLayout.BELOW, R.id.tvInterestRate_VTB);
        tvConfirmation.setLayoutParams(params);
        tvConfirmation.setVisibility(View.VISIBLE);
    }

    public void onClickSberbank(View view) {
        // Скрыть предыдущие надписи
        tvInterestRate_VTB.setText("");
        tvInterestRate_AlfaBank.setText("");

        // Установить новый текст
        tvInterestRate_Sberbank.setText("Процентная ставка: 7%");

        // Установить новое местоположение и сделать видимым
        tvConfirmation.setText("Спасибо за ваш выбор!");
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) tvConfirmation.getLayoutParams();
        params.addRule(RelativeLayout.BELOW, R.id.tvInterestRate_Sberbank);
        tvConfirmation.setLayoutParams(params);
        tvConfirmation.setVisibility(View.VISIBLE);
    }

    public void onClickAlfaBank(View view) {
        // Скрыть предыдущие надписи
        tvInterestRate_VTB.setText("");
        tvInterestRate_Sberbank.setText("");

        // Установить новый текст
        tvInterestRate_AlfaBank.setText("Процентная ставка: 7.2%");

        // Установить новое местоположение и сделать видимым
        tvConfirmation.setText("Спасибо за ваш выбор!");
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) tvConfirmation.getLayoutParams();
        params.addRule(RelativeLayout.BELOW, R.id.tvInterestRate_AlfaBank);
        tvConfirmation.setLayoutParams(params);
        tvConfirmation.setVisibility(View.VISIBLE);
    }
}