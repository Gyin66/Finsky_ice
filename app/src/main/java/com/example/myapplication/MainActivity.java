package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    static int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Дроп Finsky ice");
        
        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                button.setText(count+"");
                if (count > 10 && count < 25){
                    textView.setText("Между первой и второй,перерыв не большой");
                }
                if (count > 50 && count > 75){
                 textView.setText("Может хватит?");
             }
                if (count == 100){
                    textView.setText("");
                }
                if (count == 100){
                    Toast.makeText(getApplicationContext(),"Поздравляю,ты ужрался,несу тазик",Toast.LENGTH_LONG).show();
                }
        }

    });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
}
}