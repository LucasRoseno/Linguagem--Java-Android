package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    EditText txtData1, txtData2;
    Button btnCalcular;
    CalculoDatas calcdt = new CalculoDatas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData1 = findViewById(R.id.txtData1);
        txtData2 = findViewById(R.id.txtData2);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d1 = txtData1.getText().toString();
                String d2 = txtData2.getText().toString();
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    GregorianCalendar cal = new GregorianCalendar();
                    cal.setTime(sdf.parse(d1));
                    String []d = d2.split("/");
                    calcdt.addDatasCalendario(cal,d);
                    int dias = calcdt.diffDias();
                    Toast.makeText(getBaseContext(),dias+"",Toast.LENGTH_LONG).show();
                    int anos = calcdt.diffAnosDeVida(d1,d2);
                    Toast.makeText(getBaseContext(),anos+"",Toast.LENGTH_LONG).show();
                } catch (Exception e) { }

            }
        });
    }
}