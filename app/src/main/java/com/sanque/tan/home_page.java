package com.sanque.tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_page extends AppCompatActivity {
    public Button cough;
    public Button fever;
    public Button asthma;
    public Button ulcer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        cough = (Button) findViewById(R.id.button2);
        cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCough();
            }
        });

        fever = (Button) findViewById(R.id.button3);
        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFever();
            }
        });

        asthma = (Button) findViewById(R.id.button4);
        asthma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAsthma();
            }
        });

        ulcer = (Button) findViewById(R.id.button5);
        ulcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUlcer();
            }
        });
    }

    public void openCough() {
        Intent intent = new Intent (this, cough.class);
        startActivity(intent);
    }

    public void openFever() {
        Intent intent = new Intent (this, fever.class);
        startActivity(intent);
    }

    public void openAsthma() {
        Intent intent = new Intent (this, asthma.class);
        startActivity(intent);
    }

    public void openUlcer() {
        Intent intent = new Intent (this, ulcer.class);
        startActivity(intent);
    }
}
