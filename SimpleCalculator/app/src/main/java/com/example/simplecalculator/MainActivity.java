package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAdd, btnSub, btnDiv,btnMul;
    EditText editText1, editText2;
    TextView textView;
    int num1, num2;
    float answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnDiv = findViewById(R.id.btn_div);
        btnMul = findViewById(R.id.btn_mul);
        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);


    }
    public int getIntFromEdittext(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT ).show();
            return 0;
        }
        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {

        num1 = getIntFromEdittext(editText1);
        num2 = getIntFromEdittext(editText2);

        switch (view.getId()){
            case R.id.btn_add:
                textView.setText("answer = " + (num1 + num2));
                break;
            case R.id.btn_sub:
                textView.setText("answer = " + (num1 - num2));
                break;
            case R.id.btn_div:
                textView.setText("answer = " + ((float)num1/ (float)num2));
                break;
            case R.id.btn_mul:
                textView.setText("answer = " + (num1 * num2));
                break;
        }

    }
}