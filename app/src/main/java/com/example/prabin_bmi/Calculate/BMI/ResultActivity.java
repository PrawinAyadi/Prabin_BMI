package com.example.prabin_bmi.Calculate.BMI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prabin_bmi.Calculate.Calculation;
import com.example.prabin_bmi.R;

import java.util.Timer;
import java.util.TimerTask;

public class ResultActivity extends AppCompatActivity {
    TextView tvFeedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvFeedback=findViewById(R.id.tvFeedback);

        Intent intent = getIntent();
        String feedback = intent.getStringExtra(Intent.EXTRA_TEXT);
        tvFeedback.setText("Your Body is "+feedback);




    }
}
