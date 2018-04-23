package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem6);
        Button bdata=(Button)findViewById(R.id.btndata);
        bdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem6.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/dbms_tutorial.pdf");
                startActivity(i);
            }
        });
        Button bis=(Button)findViewById(R.id.btnis);
        bis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem6.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/cryptography_and_network_security.pdf");
                startActivity(i);
            }
        });
    }
}
