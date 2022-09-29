package com.example.bingo_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btnSortear, btnMostrar;
    TextView txtSorteados, txtUmPorUm, txtJaForam;
    final int MAX = 7;
    final int[] sorteados = new int [MAX];
    private static int uni = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJaForam = findViewById(R.id.txtJaForam);
        txtUmPorUm = findViewById(R.id.txtUmPorUm);

        txtSorteados = findViewById(R.id.txtSorteados);
        btnSortear = findViewById(R.id.btnSortear);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnSortear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rd = new Random();
                int count = 0;
                while(count < MAX)
                {
                    int n = rd.nextInt(MAX+1);
                    boolean achou = false;
                    for(int i=0; i<sorteados.length; i++)
                        if (n == sorteados[i])
                            achou = true;
                    if(!achou)
                    {
                        sorteados[count] = n;
                        count++;
                    }
                }
                for (int i = 0; i < sorteados.length; i++) {
                    txtSorteados.setText(sorteados[i] + "");
                }


            }
        });

         btnMostrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (uni != MAX)
                    {
                        txtUmPorUm.setText(sorteados[uni] + "");
                        txtJaForam.setText(txtJaForam.getText() +""+ sorteados[uni]+ ",");
                        uni++;
                    }
                    else{
                        txtUmPorUm.setText("bla bla bla");
                        }

                }
            });



    }
}