package rimante.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private TextView text1;
    private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.tv1);
        text1.setText(1 + (int)(Math.random() * ((1000 - 1) + 1)));

        text2 = (TextView) findViewById(R.id.tv2);
        text2.setText(1 + (int)(Math.random() * ((1000 - 1) + 1)));

        btn1 = (Button) findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityB();
            }
        });

        btn2 = (Button) findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityA();
            }
        });
    }

    public void openActivityA(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void openActivityB(){
        Intent intent2 = new Intent(this,Main2Activity.class);
        startActivity(intent2);
    }
}
