package com.example.yurina.calculator_yur2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivityCalcul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.activity_main_calcul);

        Button calculbtn = (Button) findViewById(R.id.calculbtn);

        calculbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent = new Intent(MainActivityCalcul.this, SubActivityCalcul.class);
               startActivity(intent);
            }
        });



    }
}
