package com.example.ex0603;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txtMessage);
        btn = findViewById(R.id.btnClick);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count++;
                if(count%7==0)
                {
                    txt.setText("BOOM!");
                }
                else {
                 txt.setText("This is a click number: " + count);
                }
            }
        });
    }


}
