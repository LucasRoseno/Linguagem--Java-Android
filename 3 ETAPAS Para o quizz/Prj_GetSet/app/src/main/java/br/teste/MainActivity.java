package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Compartilha cp = new Compartilha(5);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  cp.setTexto("5");
        Intent it = new Intent(getBaseContext(),Tela1.class);
        startActivity(it);
    }
}