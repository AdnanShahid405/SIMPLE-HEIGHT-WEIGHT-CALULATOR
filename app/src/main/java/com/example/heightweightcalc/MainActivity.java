package com.example.heightweightcalc;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(10000);

                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(intent);

                    finish();
                } catch (InterruptedException e) {
                    // Thread was interrupted, log the exception
                    e.printStackTrace();
                } catch (Exception e) {
                    // Catch any other exceptions
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
