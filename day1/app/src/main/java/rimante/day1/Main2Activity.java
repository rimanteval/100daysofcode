package rimante.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button btn2;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text2 = (TextView) findViewById(R.id.tv2);
        int num = 1 + (int) (Math.random() * ((1000 - 1) + 1));
        text2.setText(num + "");

        btn2 = (Button) findViewById(R.id.b2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main2Activity.this, MainActivity.class);
                Main2Activity.this.startActivity(intent1);
            }
        });

    }
}
