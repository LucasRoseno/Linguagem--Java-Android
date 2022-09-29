package com.example.prj_compartilha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Compartilha cp = new Compartilha();
    Button btnAbreTela1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbreTela1 = findViewById(R.id.btnAbreTela1);
        btnAbreTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.setNome("ETESP");
            }
        });

    }
}