package br.teste;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mostraData;
    CalendarView calendar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = findViewById(R.id.calendar);
        mostraData = findViewById(R.id.mostraData);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
            String date = i2 +"/"+(i1+1)+"/"+i;

            mostraData.setText(date);
            }
        });


    }
}