package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activityfour extends AppCompatActivity {
    CardView c7,c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfour);
        c7= (CardView) findViewById(R.id.fourone);
        c8= (CardView) findViewById(R.id.fourtwo);
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activityfour.this,Activityfourone.class);
                startActivity(i);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activityfour.this,Activityfourtwo.class);
                startActivity(i);
            }
        });
    }
}
