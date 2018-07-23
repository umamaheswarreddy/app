package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activitytwo extends AppCompatActivity {
    CardView c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        c3= (CardView) findViewById(R.id.twoone);
        c4= (CardView) findViewById(R.id.twotwo);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activitytwo.this,Activitytwoone.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activitytwo.this,Activitytwotwo.class);
                startActivity(i);
            }
        });
    }
}
