package com.mac.training.buttonclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // handle click
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
            }
        };
        Button tres = (Button) findViewById(R.id.tres);
        tres.setOnClickListener(listener);


        Button cuatro = (Button) findViewById(R.id.cuatro);
        cuatro.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
    }
}
