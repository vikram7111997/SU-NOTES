package com.example.vikram.su_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Branch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        Button bcse=(Button)findViewById(R.id.btncse);
        bcse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Branch.this,Year.class);
                startActivity(i);
            }
        });
        Button betc=(Button)findViewById(R.id.btnentc);
        betc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"UNDER DEVELOPMENT,COMING SOON",Toast.LENGTH_SHORT).show();
            }
        });
        Button bmech=(Button)findViewById(R.id.btnmech);
        bmech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"UNDER DEVELOPMENT,COMING SOON",Toast.LENGTH_SHORT).show();
            }
        });
        Button bcivil=(Button)findViewById(R.id.btncivil);
        bcivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"UNDER DEVELOPMENT,COMING SOON",Toast.LENGTH_SHORT).show();
            }
        });
        Button belec=(Button)findViewById(R.id.btnelectrical);
        belec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"UNDER DEVELOPMENT,COMING SOON",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
