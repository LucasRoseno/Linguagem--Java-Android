package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    Compartilha cp = new Compartilha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        String y = cp.getTexto();
        Toast.makeText( getBaseContext(), y, Toast.LENGTH_LONG).show();
    }
}