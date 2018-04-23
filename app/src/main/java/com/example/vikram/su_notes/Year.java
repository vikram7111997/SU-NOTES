package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        Button bse=(Button)findViewById(R.id.btnse);
        bse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Year.this,Sefiles.class);
                startActivity(i);
            }
        });
        Button bte=(Button)findViewById(R.id.btnte);
        bte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Year.this,Tefiles.class);
                startActivity(i);
            }
        });
        Button bbe=(Button)findViewById(R.id.btnbe);
        bbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Year.this,Befiles.class);
                startActivity(i);
            }
        });
    }
}
