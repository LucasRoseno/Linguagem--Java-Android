package teste.br.prj_dado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r;
    ImageView imageView;

    Button button;
Integer[] images = {
        R.drawable.dado1,
        R.drawable.dado2,
        R.drawable.dado3,
        R.drawable.dado4,
        R.drawable.dado5,
        R.drawable.dado6,
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.setImageResource(images[r.nextInt(images.length)]);
            }
        });
    }
}
