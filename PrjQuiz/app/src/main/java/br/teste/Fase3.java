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

public class Fase3 extends AppCompatActivity {

    Compartilhe cp = new Compartilhe();
    TextView txtPerg3;
    RadioGroup rdgResp;
    RadioButton opc1b,opc2b,opc3b;
    Button btnPro3;
    int resultado;

    String []sort = new String[] { "111+111", "222+222", "333+333" };

    String[] resp1 = new String[] { "222", "21", "22" };
    String[] resp2 = new String[] { "444", "41", "44" };
    String[] resp3 = new String[] { "666", "61", "66" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase3);
        txtPerg3 = findViewById(R.id.txtPerg3);
        rdgResp = findViewById(R.id.rdgResp);
        opc1b = findViewById(R.id.opcResp1);
        opc2b = findViewById(R.id.opcResp2);
        opc3b = findViewById(R.id.opcResp3);
        btnPro3 = findViewById(R.id.btnPro3);

        Random rdf2 = new Random();
        int ss = rdf2.nextInt(3  );
        txtPerg3.setText(sort[ss] + "");


        if(ss == 0){
            opc1b.setText(resp1[0] );
            opc2b.setText(resp1[1]);
            opc3b.setText(resp1[2]);
        }
        if(ss == 1){
            opc1b.setText(resp2[0]);
            opc2b.setText(resp2[1]);
            opc3b.setText(resp2[2]);
        }
        if(ss == 2){
            opc1b.setText(resp3[0]);
            opc2b.setText(resp3[1]);
            opc3b.setText(resp3[2]);
        }

       btnPro3.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {

                if(opc1b.isChecked())
                    resultado = 1;
                if(opc2b.isChecked())
                    resultado = 0;
                if(opc3b.isChecked())
                    resultado = 0;



                cp.setPerg3(resultado);
                Intent it = new Intent(getBaseContext(),Fase4.class);
                startActivity(it);
            }
        });


    }
}