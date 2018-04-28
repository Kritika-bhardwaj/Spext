package com.example.hp.spext;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {
    public Button btts1,bstt1;
    public void init()
    {

        btts1=(Button)findViewById(R.id.btts);
        bstt1=(Button)findViewById(R.id.bstt);
        btts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy=new Intent(First.this,Atts.class);
                startActivity(toy);
            }
        });
        bstt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy1=new Intent(First.this,Astt.class);
                startActivity(toy1);
            }
        });
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        init();
    }

}
