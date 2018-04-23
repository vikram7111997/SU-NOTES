package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
        Button boomd=(Button)findViewById(R.id.btnoomd);
        boomd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem5.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/oomd.pdf");
                startActivity(i);
            }
        });
        Button bcg=(Button)findViewById(R.id.btncg);
        bcg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem5.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/computer_graphics_tutorial.pdf");
                startActivity(i);
            }
        });
    }
}
