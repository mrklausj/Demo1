package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtMessage;
    private Button btnA, btnB, btnNyKnap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage = findViewById(R.id.txtMessage);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnNyKnap =findViewById(R.id.btnNyKnap);

        btnNyKnap.setOnClickListener(v -> {
            txtMessage.setText("Du klikkede på Den nye knap");
        });


        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);

    }

    public void KlikHandler(View view) {
        txtMessage.setText("Du klikkede på Start");

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnA) {
            txtMessage.setText("Du klikkede på Knap A");
        }
        else{
            txtMessage.setText("Du klikkede på Knap B");
        }
    }


}