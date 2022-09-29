package com.example.prj_compartilha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {
    Compartilha cp = new Compartilha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        String x = cp.getNome();
        Toast.makeText(getBaseContext(),x,Toast.LENGTH_LONG).show();
    }
}