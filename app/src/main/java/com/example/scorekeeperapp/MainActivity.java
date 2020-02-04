package com.example.scorekeeperapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView scoure_A;
    TextView scoure_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoure_A = findViewById(R.id.scoure_A);
        scoure_B = findViewById(R.id.scoure_B);

        Button bn_plus_one_point_A = findViewById(R.id.bn_plus_one_point_A);
        Button bn_plus_two_point_A = findViewById(R.id.bn_plus_two_point_A);
        Button bn_plus_three_point_A = findViewById(R.id.bn_plus_three_point_A);
        Button bn_plus_one_point_B = findViewById(R.id.bn_plus_one_point_B);
        Button bn_plus_two_point_B = findViewById(R.id.bn_plus_two_point_B);
        Button bn_plus_three_point_B = findViewById(R.id.bn_plus_three_point_B);
        Button bn_reset = findViewById(R.id.bn_reset);

        bn_plus_one_point_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_A, 1);
            }
        });
        bn_plus_two_point_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_A, 2);
            }
        });
        bn_plus_three_point_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_A, 3);
            }
        });
        bn_plus_one_point_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_B, 1);
            }
        });
        bn_plus_two_point_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_B, 2);
            }
        });
        bn_plus_three_point_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus(scoure_B, 3);
            }
        });
        bn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });


    }

    public void plus(TextView scoure, int point) {
        int current_points = Integer.valueOf(scoure.getText().toString());
        String new_points = String.valueOf(current_points + point);
        scoure.setText(new_points);
    }

    public void reset() {
        scoure_A.setText(String.valueOf(0));
        scoure_B.setText(String.valueOf(0));
    }
}
