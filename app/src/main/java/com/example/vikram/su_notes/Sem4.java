package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);
        Button bauto=(Button)findViewById(R.id.btnauto);
        bauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem4.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/03/automata_theory_tutorial.pdf");
                startActivity(i);
            }
        });
        Button bcn=(Button)findViewById(R.id.btncn);
        bcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem4.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/03/data_communication_computer_network_tutorial.pdf");
                startActivity(i);
            }
        });
        Button bco=(Button)findViewById(R.id.btnco);
        bco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem4.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/computer-organization-and-arcitecture.pdf");
                startActivity(i);
            }
        });

    }
}
