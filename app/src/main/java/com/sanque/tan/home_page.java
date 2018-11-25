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
    public Button nav;
    public Button cold;
    public Button measles;
    public Button arthritis;
    public Button chickenPox;
    public Button dehydration;
    public Button diabetes;
    public Button diarrhoea;
    public Button dysmenorrhea;
    public Button legCramps;
    public Button migraine;
    public Button mumps;
    public Button nosebleed;
    public Button soreThroat;
    public Button tummyAche;
    public Button stroke;
    public Button uti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        cough = (Button) findViewById(R.id.button15);
        cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCough();
            }
        });

        fever = (Button) findViewById(R.id.button16);
        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFever();
            }
        });

        asthma = (Button) findViewById(R.id.button18);
        asthma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAsthma();
            }
        });

        ulcer = (Button) findViewById(R.id.button19);
        ulcer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUlcer();
            }
        });

        nav = (Button) findViewById(R.id.button10);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNav();
            }
        });

        cold = (Button) findViewById(R.id.button20);
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCold();
            }
        });

        measles = (Button) findViewById(R.id.button21);
        measles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeasles();
            }
        });

        arthritis = (Button) findViewById(R.id.button2);
        arthritis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArthritis();
            }
        });

        chickenPox = (Button) findViewById(R.id.button3);
        chickenPox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChickenPox();
            }
        });

        dehydration = (Button) findViewById(R.id.button12);
        dehydration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openDehydration();
            }
        });

        diabetes = (Button) findViewById(R.id.button11);
        diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiabetes();
            }
        });

        diarrhoea = (Button) findViewById(R.id.button14);
        diarrhoea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiarrhoea();
            }
        });

        dysmenorrhea = (Button) findViewById(R.id.button13);
        dysmenorrhea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDysmenorrhea();
            }
        });

        legCramps = (Button) findViewById(R.id.button22);
        legCramps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLegCramps();
            }
        });

        migraine = (Button) findViewById(R.id.button17);
        migraine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMigraine();
            }
        });

        mumps = (Button) findViewById(R.id.button24);
        mumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMumps();
            }
        });

        nosebleed = (Button) findViewById(R.id.button23);
        nosebleed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNosebleed();
            }
        });

        soreThroat = (Button) findViewById(R.id.button26);
        soreThroat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSoreThroat();
            }
        });

        tummyAche = (Button) findViewById(R.id.button25);
        tummyAche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTummyAche();
            }
        });

        stroke = (Button) findViewById(R.id.button28);
        stroke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStroke();
            }
        });

        uti = (Button) findViewById(R.id.button27);
        uti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUTI();
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

    public void openNav() {
        Intent intent = new Intent (this, navbar.class);
        startActivity(intent);
    }

    public void openCold() {
        Intent intent = new Intent (this, cold.class);
        startActivity(intent);
    }

    public void openMeasles() {
        Intent intent = new Intent (this, measles.class);
        startActivity(intent);
    }

    public void openArthritis() {
        Intent intent = new Intent (this, arthritis.class);
        startActivity(intent);
    }

    public void openChickenPox() {
        Intent intent = new Intent (this, chickenpox.class);
        startActivity(intent);
    }

    public void openDehydration() {
        Intent intent = new Intent (this, dehydration.class);
        startActivity(intent);
    }

    public void openDiabetes() {
        Intent intent = new Intent (this, diabetes.class);
        startActivity(intent);
    }

    public void openDiarrhoea() {
        Intent intent = new Intent (this, diarrhoea.class);
        startActivity(intent);
    }

    public void openDysmenorrhea() {
        Intent intent = new Intent (this, dysmenorrhea.class);
        startActivity(intent);
    }

    public void openLegCramps() {
        Intent intent = new Intent (this, legcramps.class);
        startActivity(intent);
    }

    public void openMigraine() {
        Intent intent = new Intent (this, migraine.class);
        startActivity(intent);
    }

    public void openMumps() {
        Intent intent = new Intent (this, mumps.class);
        startActivity(intent);
    }

    public void openNosebleed() {
        Intent intent = new Intent (this, nosebleed.class);
        startActivity(intent);
    }

    public void openSoreThroat() {
        Intent intent = new Intent (this, sorethroat.class);
        startActivity(intent);
    }

    public void openTummyAche() {
        Intent intent = new Intent (this, tummyache.class);
        startActivity(intent);
    }

    public void openStroke() {
        Intent intent = new Intent (this, stroke.class);
        startActivity(intent);
    }

    public void openUTI() {
        Intent intent = new Intent (this, uti.class);
        startActivity(intent);
    }
}
