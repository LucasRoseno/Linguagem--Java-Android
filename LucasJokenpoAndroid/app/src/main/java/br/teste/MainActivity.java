package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnApagar;
    Button btnPedra;
    Button btnPapel;
    Button btnTesoura;
    ImageView centro;
    ImageView centro2;
    TextView txtMac = null;
    TextView txtJog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnApagar = findViewById(R.id.btnApagar);
        btnPedra = findViewById(R.id.btnPedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnTesoura);
        centro = findViewById(R.id.centro);
        centro2 = findViewById(R.id.centro2);
        txtJog = findViewById(R.id.txtJog);
        txtMac = findViewById(R.id.txtMac);
        //jog.setText("0")

        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtJog.setText("0");
                txtMac.setText("0");
            }
        });


        btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                centro.setImageResource(R.drawable.rock);
                int aNumber = (int) (3 * Math.random()) + 1;
                switch (aNumber){
                    case 1:
                        centro2.setImageResource(R.drawable.rock);
                        break;
                    case 2:
                        int placarpc = Integer.valueOf(txtMac.getText().toString());
                        int somapc = placarpc + 1;
                        txtMac.setText(String.valueOf(somapc));
                        //eu perdi
                        centro2.setImageResource(R.drawable.paper);
                        break;
                    case 3:
                        int placarjog = Integer.valueOf(txtJog.getText().toString());
                      int  somajog = placarjog + 1;
                        txtJog.setText(String.valueOf(somajog));
                        //EU GANHEI
                        centro2.setImageResource(R.drawable.scissors);
                        break;
                }
            }
        });

        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                centro.setImageResource(R.drawable.paper);
                int aNumber = (int) (3 * Math.random()) + 1;
                switch (aNumber){
                    case 1:
                        //eu ganhei
                        int placarjog = Integer.valueOf(txtJog.getText().toString());
                        int somajog = placarjog + 1;
                        txtJog.setText(String.valueOf(somajog));
                        centro2.setImageResource(R.drawable.rock);
                        break;
                    case 2:
                        centro2.setImageResource(R.drawable.paper);
                        break;
                    case 3:
                       int placarpc = Integer.valueOf(txtMac.getText().toString());
                        int somapc = placarpc + 1;
                        txtMac.setText(String.valueOf(somapc));
                        //Eu perdi
                        centro2.setImageResource(R.drawable.scissors);
                        break;
                }

            }
        });

        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                centro.setImageResource(R.drawable.scissors);
                int aNumber = (int) (3 * Math.random()) + 1;
                switch (aNumber){
                    case 1:
                       int placarpc = Integer.valueOf(txtMac.getText().toString());
                        int somapc = placarpc + 1;
                        txtMac.setText(String.valueOf(somapc));
                        //eu perdi
                        centro2.setImageResource(R.drawable.rock);
                        break;
                    case 2:

                        //eu ganhei
                        int placarjog = Integer.valueOf(txtJog.getText().toString());
                        int somajog = placarjog + 1;
                        txtJog.setText(String.valueOf(somajog));

                        centro2.setImageResource(R.drawable.paper);
                        break;
                    case 3:
                        centro2.setImageResource(R.drawable.scissors);
                        break;
                }

            }
        });






  }



}



