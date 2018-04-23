package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sefiles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sefiles);
        Button sesyllabus=(Button)findViewById(R.id.btnsesyllabus);
        sesyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sefiles.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/14-se-comp-sci.pdf");
                startActivity(i);

            }
        });
        Button bsem3=(Button)findViewById(R.id.btnsem3se);
        bsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sefiles.this,Sem3.class);
                startActivity(i);
            }
        });
        Button bsem4=(Button)findViewById(R.id.btnsem4se);
        bsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Sefiles.this,Sem4.class);
                startActivity(i);
            }
        });
    }
}
