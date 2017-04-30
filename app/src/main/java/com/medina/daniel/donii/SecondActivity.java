package com.medina.daniel.donii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent in = new Intent(v.getContext(),ThirdActivity.class);
                startActivity(in);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2_id);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                // Perform action on click
                Intent in2 = new Intent(v2.getContext(),ThirdActivity.class);
                startActivity(in2);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3_id);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v3) {
                // Perform action on click
                Intent in3 = new Intent(v3.getContext(),ThirdActivity.class);
                startActivity(in3);
            }
        });

    }
}
