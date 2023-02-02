package br.teste;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.type.DateTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText txtNome,txtDtAniver, edtData;
    Button btnCadastrar, btnMostrar;
    List<String> lstNomes, lstDatas;
    CalendarView cldView;
    TextView txtMostrarS;
    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    Date hj = new Date();
    private GregorianCalendar dt1; //primeira data
    private GregorianCalendar dt2; //segunda data
    long nextBirthdayLong;
    long diff;
    CalculoDatas calc = new CalculoDatas();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        cldView = findViewById(R.id.cldView);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnMostrar = findViewById(R.id.btnMostrar);
        txtMostrarS = findViewById(R.id.txtMostrarS);
        edtData = findViewById(R.id.edtData);
        lstNomes = new ArrayList<>();
        lstDatas = new ArrayList<>();

        cldView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i2 +"/"+(i1+1)+"/"+i;

                edtData.setText(date);
            }
        });


       btnCadastrar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String n = txtNome.getText().toString();
               lstNomes.add(n);
               txtNome.setText("");

               String f = edtData.getText().toString();
               lstDatas.add(f);
               edtData.setText("");
           }
       });

       btnMostrar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



               for(int t=0; t<lstDatas.size();t++){
                   GregorianCalendar d1 = calc.getDataCelular();
                   String d2 = lstDatas.get(t).toString();
                   String spltx[] = d2.split("/");
                   calc.addDatasCalendario(d1,spltx);
                   int dias = calc.diffDias();


                   String n = lstNomes.get(t).toString();
                   String d11 = lstDatas.get(t).toString();
                   String d22 = calc.getDataCelString();
                   int x = calc.diffAnosDeVida(d11,d22);
                   String pox2 = (n + " "+ d11+ " idade de" + (x + " anos e faltam "+ dias) )+ "\n";
                   txtMostrarS.setText(pox2);
               }




              // Toast.makeText(getBaseContext(),opc,Toast.LENGTH_LONG).show();
               //Toast.makeText(getBaseContext(),x+"",Toast.LENGTH_LONG).show();


               /*
               Date hoje = Calendar.getInstance().getTime();
               String dtFor = formataData.format(hj);
                String nd = "";



                   String d1[] = d.split("/"); //ex: 01/01/2001
                   String d2[] = dtFor.split("/"); //ex: 01/01/2022

                   //nextBirthdayLong = d.getTimeInMillis();
                   //diff = Math.abs(Calendar.getInstance().getTimeInMillis() - nextBirthdayLong);



                   int cont = (anoAtual - anoNasc);
                   dt1.set(anoAtual, mesAtual, diaAtual, 0, 0, 0);
                   dt2 = new GregorianCalendar(); // Mês -1 é porque é de 0 a 11
                   dt2.set(anoNasc, mesNasc - 1, diaNasc, 0, 0, 0);

                   int MILISEG_PARA_DIA = 86400000;
                   int mos= (int) ((dt1.getTimeInMillis() - dt2.getTimeInMillis()) / MILISEG_PARA_DIA);

                 int anoNasc = Integer.parseInt(d1[2]);
                   int mesNasc = Integer.parseInt(d1[1]);
                   int diaNasc = Integer.parseInt(d1[0]);
                   int anoAtual = Integer.parseInt(d2[2]);
                   int mesAtual = Integer.parseInt(d2[1]);
                   int diaAtual = Integer.parseInt(d2[0]);
                   Date hjp = new Date(anoAtual, mesAtual, diaAtual, 0, 0);
                   LocalDate fd = LocalDate.of(anoAtual,mesAtual,diaAtual);
                   Date hsj = new Date(anoNasc, mesNasc, diaNasc, 0, 0);
                  int dias = days.daysBetween(hjp, hsj).getDays();


                   nd = nd + "Nome: "+ n +" Dia: "+ d + " com " + cont +" anos, faltam  "+mos+" dias"+"\n";
                                //contagem da idade da pessoa está correto
                                    //Contagem de dias

                   Toast.makeText(getBaseContext(),nd,Toast.LENGTH_LONG).show();


               }
               txtMostrarS.setText(nd);
                */
           }
       });



    }
}