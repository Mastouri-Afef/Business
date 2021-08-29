package com.example.salaryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText1, editText2, editText3;
    TextView textView1, textView2, textView3, textView4;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        textView4 = (TextView) findViewById(R.id.textView4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, editText1.getText().toString(), Toast.LENGTH_LONG);
                toast.show();
                String st = editText1.getText().toString();
                int exp = Integer.parseInt(editText2.getText().toString());
                int age = Integer.parseInt(editText3.getText().toString());
                if(st.equalsIgnoreCase("married")){
                    if(exp < 3){
                        result = 1500+(exp*50)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else if(exp >= 3 && exp < 6){
                        result = 1800+(exp*50)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else if(exp >= 6){
                        result = 1800+(exp*150)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else {
                        Toast.makeText(MainActivity.this, "PLease Enter a valid Number", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(st.equalsIgnoreCase("single")){
                    if(age < 30){
                        result = 1500+(exp*50)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else if(age >= 30 && exp < 40){
                        result = 1800+(exp*50)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else if(age >= 40){
                        result = 1800+(exp*150)+(age*150);
                        textView4.setText("Your Salary is "+result);

                    }
                    else {
                        Toast.makeText(MainActivity.this, "PLease Enter a valid Number", Toast.LENGTH_SHORT).show();

                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Enter a valid state", Toast.LENGTH_SHORT).show();
                    textView4.setText("Error Result");

                }

            }

        });
    }
}