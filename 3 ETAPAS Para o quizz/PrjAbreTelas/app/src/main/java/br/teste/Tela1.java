package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {
        Button btnAbrirTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        btnAbrirTela2 = findViewById(R.id.btnAbrirTela2);
        btnAbrirTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(),Tela2.class);
                startActivity(it);
            }
        });



    }
}