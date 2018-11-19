package com.sanque.tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ulcer extends AppCompatActivity {
    public Button nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulcer);
        nav = (Button) findViewById(R.id.button10);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNav();
            }
        });
    }

    public void openNav() {
        Intent intent = new Intent(this, navbar.class);
        startActivity(intent);
    }
}
