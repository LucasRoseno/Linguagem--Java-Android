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

public class Fase4 extends AppCompatActivity {
    Compartilhe cp = new Compartilhe();
    TextView txtPerg4;
    RadioGroup rdgResp;
    RadioButton opc1c,opc2c,opc3c;
    Button btnPro4;
    int resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase4);
        txtPerg4 = findViewById(R.id.txtPerg4);
        rdgResp = findViewById(R.id.rdgResp);
        opc1c = findViewById(R.id.opcResp1);
        opc2c = findViewById(R.id.opcResp2);
        opc3c = findViewById(R.id.opcResp3);
        btnPro4 = findViewById(R.id.btnPro4);

        String []sort = new String[] { "Que dia Lucas Nasceu?", "Que mês Lucas Nasceu?",
                "Qual o NUMERO DA SORTE do Lucas" };

        String[] resp1 = new String[] { "23", "17", "15" };
        String[] resp2 = new String[] { "Agosto", "Junho", "Julho" };
        String[] resp3 = new String[] { "5", "4", "7" };

        Random rdf2 = new Random();
        int ss = rdf2.nextInt(3  );
        txtPerg4.setText(sort[ss] + "");


        if(ss == 0){
            opc1c.setText(resp1[0] );
            opc2c.setText(resp1[1]);
            opc3c.setText(resp1[2]);
        }
        if(ss == 1){
            opc1c.setText(resp2[0]);
            opc2c.setText(resp2[1]);
            opc3c.setText(resp2[2]);
        }
        if(ss == 2){
            opc1c.setText(resp3[0]);
            opc2c.setText(resp3[1]);
            opc3c.setText(resp3[2]);
        }

        btnPro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(opc1c.isChecked())
                    resultado = 0;
                if(opc2c.isChecked())
                    resultado = 2;
                if(opc3c.isChecked())
                    resultado = 0;


                cp.setPerg4(resultado);
                Intent it = new Intent(getBaseContext(),FimResult.class);
                startActivity(it);
            }
        });
    }
}