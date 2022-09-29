package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String palavraChave = "ceu";
    String palavraChave1 = palavraChave.charAt(0) + "";
    String PalavraChave2 = palavraChave.charAt(1) + "";
    String PalavraChave3 = palavraChave.charAt(2) + "";
    Button btnMostrar;
    TextView txtCima;
    Text editPt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCima.findViewById(R.id.txtCima);
        btnMostrar.findViewById(R.id.btnMostrar);


        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                }



        });


    }



    }


}