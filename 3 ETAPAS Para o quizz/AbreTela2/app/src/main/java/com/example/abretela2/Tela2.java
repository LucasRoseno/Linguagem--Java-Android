package com.example.abretela2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {
    Button btnDois;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
      btnDois =  findViewById(R.id.btnDois);
      btnDois.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent it = new Intent(getBaseContext(),Tela3.class);
              startActivity(it);
          }
      });

    }
}