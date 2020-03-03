package com.example.ex008;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn,btn0;
    TextView tv;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn);
        btn0=(Button) findViewById(R.id.btn0);
        tv=(TextView) findViewById(R.id.tv);
        tv.setText("number not found");

    }
public static Random rnd =new Random();
    public void press_for_clear(View view) {
        tv.setText("number not found");
    }

    public void press_for_numbers(View view) {
        x=rnd.nextInt(100)+1;
        tv.setText("number="+x);

    }
}
