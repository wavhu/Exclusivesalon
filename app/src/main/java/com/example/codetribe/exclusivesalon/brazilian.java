package com.example.codetribe.exclusivesalon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class brazilian extends AppCompatActivity {

    TextView a, b, c, d, e, f, g, h, i, j;
    private Button btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazilian);


        a = (TextView) findViewById(R.id.txt3);
        b = (TextView) findViewById(R.id.txt4);
        c = (TextView) findViewById(R.id.txt5);
        d = (TextView) findViewById(R.id.txt6);
        e = (TextView) findViewById(R.id.txt7);
        f = (TextView) findViewById(R.id.txt8);
        g = (TextView) findViewById(R.id.txt9);
        h = (TextView) findViewById(R.id.txt10);
        i = (TextView) findViewById(R.id.txt11);
        j = (TextView) findViewById(R.id.txt12);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);




        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);


            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);


//        Intent i = new Intent(brazilian.this,prices.class);
//        startActivity(i);

            }

        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }

        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(brazilian.this, Types.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(brazilian.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(brazilian.this,Types.class);
                startActivity(intent);
            }
        });
    }
}