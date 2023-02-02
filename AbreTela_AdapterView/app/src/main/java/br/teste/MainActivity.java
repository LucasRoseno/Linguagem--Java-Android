package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

    Button btnPassar;
    EditText txtTela;
    ListView lstTelas;
    List<String> lstBdTelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPassar = findViewById(R.id.btnPassar);
        txtTela = findViewById(R.id.txtTela);
        lstTelas = findViewById(R.id.lstTelas);

        lstBdTelas = new ArrayList<>();

        btnPassar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = txtTela.getText().toString();
                lstBdTelas.add(n);
                txtTela.setText("");

                ArrayAdapter<String>adpN = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1,lstBdTelas);

                lstTelas.setAdapter(adpN);
            }
        });

        lstTelas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Object o = lstTelas.getItemAtPosition(i);
                String te = o.toString();

                Toast.makeText(getBaseContext(), te,Toast.LENGTH_LONG).show();

                if(i == 0){
                    Intent it = new Intent(getBaseContext(),Tela1.class);
                    startActivity(it);
                }
                if(i == 1){
                    Intent it = new Intent(getBaseContext(),Tela2.class);
                    startActivity(it);
                }
            }
        });



    }
}