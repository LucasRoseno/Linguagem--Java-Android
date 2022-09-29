package br.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FimResult extends AppCompatActivity {
    Compartilhe cp = new Compartilhe();
    TextView txtResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_result);


      txtResp = findViewById(R.id.txtResp);

      Integer x = cp.getPerg1();
      Integer y = cp.getPerg2();
      Integer z = cp.getPerg3();
      Integer a = cp.getPerg4();
      Integer tot = x+y+z+a;
      String porc = tot*25 + "%";

       txtResp.setText("VOCÊ ACERTOU:" + porc);


    }
}