package com.example.myapplication8888;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class average extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);
        AppCompatTextView mresult=(AppCompatTextView) findViewById(R.id.result);
        AppCompatButton mbackButton=(AppCompatButton) findViewById(R.id.backB);

        double[] classScores = {18, 20, 15, 12, 17, 10};
        double sum = 0;
        for (int i = 0; i < classScores.length; i++) {
            sum += classScores[i] ;
            System.out.println(sum);

            double average = sum / classScores.length;
            String stringSum = Double.toString(average);
            mresult.setText(stringSum);

        }
        mbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(average.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}