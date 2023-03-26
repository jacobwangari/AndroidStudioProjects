package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edittext);
        Button button = findViewById(R.id.button);
        TextView textView1 = findViewById(R.id.textView1);
        //TextView textView2 = findViewById(R.id.textView2);



        button.setOnClickListener(view -> {
            String kilograms = editText.getText().toString();

            float kilos = Float.parseFloat(kilograms);
            float pounds  = (float) (kilos * 2.20462);

            textView1.setText(""+pounds);

        });



    }
}