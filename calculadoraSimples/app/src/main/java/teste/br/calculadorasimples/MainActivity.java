package teste.br.calculadorasimples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText txtval1;
    EditText txtval2;
    Button btnSoma;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    TextView txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValor = findViewById(R.id.txtValor);
        txtval1 = findViewById(R.id.txtval1);
        txtval2 = findViewById(R.id.txtval2);
        btnSoma = findViewById(R.id.btnSoma);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
        btnSub = findViewById(R.id.btnSub);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = txtval1.getText().toString();
                Double val1 = Double.parseDouble(v1);
                String v2 = txtval2.getText().toString();
                Double val2 = Double.parseDouble(v2);
                        Double soma = val1 + val2;
                txtValor.setText(Double.toString(soma));

            }
        });

        }

    }



