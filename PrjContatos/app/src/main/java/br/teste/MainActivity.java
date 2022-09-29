package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtNome,txtFone;
    Button btnCadastrar, btnMostrar;
    List<String> lstNomes, lstFone;
    TextView lblDados;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtFone = findViewById(R.id.txtFone);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnMostrar = findViewById(R.id.btnMostrar);
        lblDados = findViewById(R.id.lblDados);

        lstNomes = new ArrayList<>();
        lstFone = new ArrayList<>();

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = txtNome.getText().toString();
                lstNomes.add(n);
                txtNome.setText("");

                String f = txtFone.getText().toString();
                lstFone.add(f);
                txtFone.setText("");
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s = "";
                String m = "";
               // int med =( (lstFone.size()-1) - (lstNomes.size()-1))/2;


                for (int x = 0; x <=lstFone.size()-1; x++) {
                    String n = lstNomes.get(x);
                    String f = lstFone.get(x);

                 //   s = lstNomes.get(x) + lstFone.get(x) + "\n";
                    s +=   "Nome: "+String.valueOf(n)+" Fone: "+String.valueOf(f) +"\n";
                }
                lblDados.setMovementMethod(new ScrollingMovementMethod());
                lblDados.setText(s);



              /*  for(int w=0; w<lstNomes.size()-1;w++){

                    String n = lstNomes.get(w);

                    if(w > lstNomes.size()-1)
                        w=lstNomes.size()-1;

                        lblDados.setText(n);
*/

            }






/*
                   String n = lstNomes.get(contar);
                   contar++;
                   if(contar > lstNomes.size()-1){
                       contar=lstNomes.size()-1;


                   lblDados.setText(String.valueOf(lstNomes));


               }

*/

            // Toast.makeText(getBaseContext(),n,Toast.LENGTH_LONG).show();




        });


    }
}