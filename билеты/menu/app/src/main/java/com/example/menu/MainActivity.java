package com.example.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isMenuOpen = false;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        textView = findViewById(R.id.textView);
    }

    public void toggleMenu(View view) {
        View menuLayout = findViewById(R.id.menuLayout);
        if (isMenuOpen) {
            menuLayout.setVisibility(View.GONE);
        } else {
            menuLayout.setVisibility(View.VISIBLE);
        }
        isMenuOpen = !isMenuOpen;
    }

    public void selectMenuItem(View view) {
        TextView selectedMenuItem = (TextView) view;
        String selectedText = selectedMenuItem.getText().toString();
        textView.setText(selectedText);
        // Здесь вы можете добавить логику для обработки выбранного пункта меню
    }
}
