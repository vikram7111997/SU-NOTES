package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tefiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tefiles);
        Button tesyllabus=(Button)findViewById(R.id.btntesyllabus);
        tesyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Tefiles.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/10-te-comp-sci.pdf");
                startActivity(i);

            }
        });
        Button bsem5=(Button)findViewById(R.id.btnsem5te);
        bsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Tefiles.this,Sem5.class);
                startActivity(i);
            }
        });
        Button bsem6=(Button)findViewById(R.id.btnsem6te);
        bsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Tefiles.this,Sem6.class);
                startActivity(i);
            }
        });
    }
}
