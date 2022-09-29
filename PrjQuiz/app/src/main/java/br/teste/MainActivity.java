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

public class MainActivity extends AppCompatActivity {
    Compartilhe cp = new Compartilhe();
    TextView txtPerg;
    RadioGroup rdgResp;
    RadioButton opc1,opc2,opc3;
    Button btnProx;
    int resultado;

     int MAX = 2;
    String []sort = new String[] { "1+1", "2+2", "3+3" };

    String[] resp1 = new String[] { "1", "2", "3" };
    String[] resp2 = new String[] { "2", "4", "6" };
    String[] resp3 = new String[] { "3", "6", "9" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       txtPerg = findViewById(R.id.txtPerg);
        rdgResp = findViewById(R.id.rdgResp);
        opc1 = findViewById(R.id.opcResp1);
        opc2 = findViewById(R.id.opcResp2);
        opc3 = findViewById(R.id.opcResp3);

        btnProx = findViewById(R.id.btnProx);
        Random rd = new Random();
        int ss = rd.nextInt(3  );
        String ww = sort[ss] + "";
        txtPerg.setText(ww);

       if(ss == 0){
            opc1.setText(resp1[0] );
            opc2.setText(resp1[1]);
            opc3.setText(resp1[2]);
        }
        if(ss == 1){
            opc1.setText(resp2[0]);
            opc2.setText(resp2[1]);
            opc3.setText(resp2[2]);
        }
        if(ss == 2){
            opc1.setText(resp3[0]);
            opc2.setText(resp3[1]);
            opc3.setText(resp3[2]);
        }


        btnProx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if(opc1.isChecked())
                    resultado = 0;
                if(opc2.isChecked())
                    resultado = 1;
                if(opc3.isChecked())
                    resultado = 0;



                cp.setPerg1(resultado);
               Intent it = new Intent(getBaseContext(),Fase2.class);
                startActivity(it);
            }
        });

    }


}