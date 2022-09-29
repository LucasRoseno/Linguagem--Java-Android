package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class Fase2 extends AppCompatActivity {
    Compartilhe cp = new Compartilhe();
    TextView txtPerg2;
    RadioGroup rdgResp;
    RadioButton opc1a,opc2a,opc3a;


    Button btnPro2;
    int resultado;

    String []sort = new String[] { "11+11", "22+22", "33+33" };

    String[] resp1 = new String[] { "12", "21", "22" };
    String[] resp2 = new String[] { "22", "41", "44" };
    String[] resp3 = new String[] { "33", "61", "66" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase2);
        txtPerg2 = findViewById(R.id.txtPerg2);
        rdgResp = findViewById(R.id.rdgResp);
        opc1a = findViewById(R.id.opcResp1);
        opc2a = findViewById(R.id.opcResp2);
        opc3a = findViewById(R.id.opcResp3);
        btnPro2 = findViewById(R.id.btnPro2);

        Random rdf2 = new Random();
        int ss = rdf2.nextInt(3  );
        txtPerg2.setText(sort[ss] + "");


        if(ss == 0){
            opc1a.setText(resp1[0] );
            opc2a.setText(resp1[1]);
            opc3a.setText(resp1[2]);
        }
        if(ss == 1){
            opc1a.setText(resp2[0]);
            opc2a.setText(resp2[1]);
            opc3a.setText(resp2[2]);
        }
        if(ss == 2){
            opc1a.setText(resp3[0]);
            opc2a.setText(resp3[1]);
            opc3a.setText(resp3[2]);
        }



        btnPro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opc1a.isChecked())
                    resultado = 0;
                if(opc2a.isChecked())
                    resultado = 0;
                if(opc3a.isChecked())
                    resultado = 1;



                cp.setPerg2(resultado);
                Intent it = new Intent(getBaseContext(),Fase3.class);
                startActivity(it);
            }
        });

    }
}