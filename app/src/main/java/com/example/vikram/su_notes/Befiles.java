package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Befiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_befiles);
        Button besyllabus=(Button)findViewById(R.id.btnbesyllabus);
        besyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Befiles.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/be_cse__final_syllabus_2016-17-final.pdf");
                startActivity(i);
            }
        });
        Button bsem7=(Button)findViewById(R.id.btnsem7be);
        bsem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Befiles.this,Sem7.class);
                startActivity(i);
            }
        });
        Button bsem8=(Button)findViewById(R.id.btnsem8be);
        bsem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Befiles.this,Sem8.class);
                startActivity(i);
            }
        });
    }
}
