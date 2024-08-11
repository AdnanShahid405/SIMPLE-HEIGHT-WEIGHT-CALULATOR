package com.example.heightweightcalc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText heightEditText;
    private EditText weightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        heightEditText = findViewById(R.id.heightEditText);
        weightEditText = findViewById(R.id.weightEditText);
    }

    private double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public void onClickCalculate(View view) {
        String heightStr = heightEditText.getText().toString();
        String weightStr = weightEditText.getText().toString();

        if (!heightStr.isEmpty() && !weightStr.isEmpty()) {
            double height = Double.parseDouble(heightStr);
            double weight = Double.parseDouble(weightStr);

            // Calculate BMI
            double bmi = calculateBMI(height, weight);

            // Start the next activity with the BMI value passed as textToShow
            Intent intent = new Intent(this, MainActivity3.class);
            intent.putExtra("textToShow", "Your BMI is: " + bmi);
            startActivity(intent);
        }
    }

    public void onClickReset(View view) {
        heightEditText.setText("");
        weightEditText.setText("");
    }
}
