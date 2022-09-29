package com.example.abretela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    Button btnTres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        btnTres = findViewById(R.id.btnTres);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(getBaseContext(),MainActivity.class);
                startActivity(it);
            }
        });
    }
}