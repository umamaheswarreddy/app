package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activityfourtwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfourtwo);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.mc)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.da)
                 .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activityfourtwo.this, "you selected ata anlytics", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uUfb-p6Qr9IwfMQZpkVGAfSMN3xMKxTM/view?usp=sharing"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activityfourtwo.this, "you selected mobile computing", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1kXZpTwbEiOhJd_yqf2x-8jxR5nb2x_8l/view?usp=sharing"));
                               startActivity(i1);
                                break;

                        }

                    }
                });
    }
}
