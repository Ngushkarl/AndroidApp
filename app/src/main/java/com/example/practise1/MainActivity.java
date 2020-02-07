package com.example.practise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greetings;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetings= (TextView)findViewById(R.id.txtv);
        click = (Button)findViewById(R.id.btnClick);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            greetings.setVisibility(View.VISIBLE);
            }
        });

    }
}
