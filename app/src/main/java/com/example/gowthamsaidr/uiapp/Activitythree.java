package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Activitythree extends AppCompatActivity {
   CardView c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythree);
        c5= (CardView) findViewById(R.id.threeone);
        c6= (CardView) findViewById(R.id.threetwo);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activitythree.this,Activitythreeone.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activitythree.this,Activitythreetwo.class);
                startActivity(i);
            }
        });
    }
}
