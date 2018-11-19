package com.sanque.tan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class navbar extends AppCompatActivity {
    public Button homePage;
    public Button illnessesPage;
    public Button aboutUs;
    public Button contactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        homePage = (Button) findViewById(R.id.button6);
        homePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
            }
        });

        illnessesPage = (Button) findViewById(R.id.button7);
        illnessesPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIllnessesPage();
            }
        });

        aboutUs = (Button) findViewById(R.id.button8);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });

        contactUs = (Button) findViewById(R.id.button9);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContactUs();
            }
        });


    }

    public void openHomePage() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void openIllnessesPage() {
        Intent intent = new Intent (this, home_page.class);
        startActivity(intent);
    }

    public void openAboutUs() {
        Intent intent = new Intent (this, aboutus.class);
        startActivity(intent);
    }

    public void openContactUs() {
        Intent intent = new Intent (this, contactus.class);
        startActivity(intent);
    }
}
