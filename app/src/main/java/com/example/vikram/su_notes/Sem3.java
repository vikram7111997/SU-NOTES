package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
        Button bc=(Button)findViewById(R.id.btncprog);
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem3.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/c-lab-manual-2016_17.pdf");
                startActivity(i);
            }
        });
        Button bm=(Button)findViewById(R.id.btnmp);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem3.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/microprocessorlabmanual-ee0310.pdf");
                startActivity(i);
            }
        });
        Button ba=(Button)findViewById(R.id.btnapm);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem3.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/maths-notes.pdf");
                startActivity(i);
            }
        });
    }
}
