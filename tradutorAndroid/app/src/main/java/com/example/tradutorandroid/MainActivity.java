package com.example.tradutorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView,txtTrad, textView2, editPalavra;
        Button btnTraduzir;
        String getPalavra, dig;


        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        editPalavra = findViewById(R.id.editPalavra);
        txtTrad = findViewById(R.id.txtTrad);
        btnTraduzir = findViewById(R.id.btnTraduzir);
        btnTraduzir.setOnClickListener(new View.OnClickListener() {
            @Override




            public void onClick(View view) {
                String[] port = {"casa", "rua", "dia"};
                String[] ing = {"house", "street", "day"};
                    int eu = 0;
                    String dig = editPalavra.getText().toString();



                for(int i = 0; i < 3; i++)
                {
                    if (dig.equals(port[i]) )
                    {

                        eu = i;

                        break;
                    }


                    }
                txtTrad.setText(ing[eu]);


                    }




        });

    }
}