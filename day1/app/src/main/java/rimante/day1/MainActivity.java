package rimante.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private TextView text1;
    private Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.tv1);
        int num = 1 + (int) (Math.random() * ((1000 - 1) + 1));
        String num1 = (num + "");
        intent2 = new Intent(MainActivity.this, Main2Activity.class);
        intent2.putExtra("num",num1);
        text1.setText(num1);

        btn1 = (Button) findViewById(R.id.b1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.startActivity(intent2);
            }
        });

    }

}
