package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout maingrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maingrid= (GridLayout) findViewById(R.id.maingrid);
       setSingleEvent(maingrid);
       // setToggleEvent(maingrid);
    }

    private void setToggleEvent(GridLayout maingrid) {
        for(int i=0;i<maingrid.getChildCount();i++){
            final CardView cardview=(CardView)maingrid.getChildAt(i);
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(cardview.getCardBackgroundColor().getDefaultColor()==-1){
                        cardview.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "state:True", Toast.LENGTH_SHORT).show();

                    }
                    else{
                        cardview.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "state:False", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout maingrid) {
        for(int i=0;i<maingrid.getChildCount();i++){
            CardView cardview=(CardView)maingrid.getChildAt(i);
            final int finalI=i;

            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   if(finalI==0){
                       Intent intent=new Intent(MainActivity.this,Activityone.class);
                       startActivity(intent);

                   }
                    else  if(finalI==1){
                       Intent intent=new Intent(MainActivity.this,Activitytwo.class);
                       startActivity(intent);

                   }
                    else  if(finalI==2){
                       Intent intent=new Intent(MainActivity.this,Activitythree.class);
                       startActivity(intent);

                   }
                    else  if(finalI==3){
                       Intent intent=new Intent(MainActivity.this,Activityfour.class);
                       startActivity(intent);

                   }
                    else  if(finalI==4){
                       Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://altscse.com"));
                       startActivity(intent);
                   }
                    else  if(finalI==5){
                       Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://alits.ac.in"));
                       startActivity(intent);
                   }
                    else {
                       Toast.makeText(MainActivity.this, "please set activity for this card item", Toast.LENGTH_SHORT).show();
                   }

                }
            });
        }

    }

}
