package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sem8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem8);
        Button bana=(Button)findViewById(R.id.btnanalytic);
        bana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sem8.this,Webview.class);
                i.putExtra("XYZ","https://techieviki.files.wordpress.com/2018/04/big_data_analytics_tutorial.pdf");
                startActivity(i);
            }
        });
    }
}
