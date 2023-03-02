package com.example.myapplication8888;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication8888.databinding.ActivityMainBinding;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        String[] classStudents = {"mahdiyar : 18 \uD83D\uDC68\u200D\uD83C\uDF93", "parsa : 20 \uD83D\uDC68\u200D\uD83C\uDF93", "behrad : 15 \uD83D\uDE47\u200D♂", "reza : 12 \uD83D\uDE47\u200D♂", "mobin :17 \uD83D\uDC68\u200D\uD83C\uDF93", "taimaz : 10 \uD83D\uDE47\u200D♂"};
        binding.student1.setText(classStudents[0]);
        binding.student2.setText(classStudents[1]);
        binding.student3.setText(classStudents[2]);
        binding.student4.setText(classStudents[3]);
        binding.student5.setText(classStudents[4]);
        binding.student6.setText(classStudents[5]);
        binding.sortButton.setOnClickListener(view1 -> {
            Arrays.sort(classStudents);
            binding.student1.setText(classStudents[0]);
            binding.student2.setText(classStudents[1]);
            binding.student3.setText(classStudents[2]);
            binding.student4.setText(classStudents[3]);
            binding.student5.setText(classStudents[4]);
            binding.student6.setText(classStudents[5]);
        });
        binding.firstButton.setOnClickListener(view1 -> {
            Intent intent=new Intent(MainActivity.this,average.class);
            startActivity(intent);
        });
    }
}