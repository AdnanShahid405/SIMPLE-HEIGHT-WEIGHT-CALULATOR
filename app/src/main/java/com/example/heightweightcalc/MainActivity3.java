package com.example.heightweightcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

      @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String textToShow = intent.getStringExtra("textToShow");

        TextView textView = findViewById(R.id.textView1); // Corrected the ID here
        textView.setText(textToShow);
    }

    public void onClickAgain(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
