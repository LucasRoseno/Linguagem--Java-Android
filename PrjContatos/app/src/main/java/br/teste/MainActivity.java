package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtNome,txtFone;
    Button btnCadastrar, btnMostrar;
    List<String> lstNomes, lstFone;
    ListView lstDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtFone = findViewById(R.id.txtFone);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnMostrar = findViewById(R.id.btnMostrar);
        lstDados = findViewById(R.id.lstDados);


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

                ArrayAdapter<String>adpN = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1,lstNomes);

                lstDados.setAdapter(adpN);

                }


        });
        lstDados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object o = lstDados.getItemAtPosition(i);
                String te = o.toString();

                Toast.makeText(getBaseContext(), te,Toast.LENGTH_LONG).show();


            }
        });


    }
}