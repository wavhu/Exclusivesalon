package com.example.codetribe.exclusivesalon;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EMAIL;
    EditText PASSWORD;
    Button LOGIN;
    ProgressDialog pDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EMAIL = (EditText) findViewById(R.id.editemail);
        PASSWORD = (EditText) findViewById(R.id.editpassword);
        LOGIN = (Button) findViewById(R.id.btnlog);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EMAIL.length() == 0) {
                    Toast.makeText(MainActivity.this, "Error Fill In Empty Fields", Toast.LENGTH_SHORT).show();
                   EMAIL.requestFocus();
                } else if (PASSWORD.length() == 0) {
                    Toast.makeText(MainActivity.this, "Error Fill In Empty Fields", Toast.LENGTH_SHORT).show();
                    PASSWORD.requestFocus();

                } else {

                    Intent intent1= new Intent(MainActivity.this, brazilian.class);
                      startActivity(intent1);


            }
        }});
    }
}