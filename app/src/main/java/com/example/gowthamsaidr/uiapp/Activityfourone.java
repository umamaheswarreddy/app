package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activityfourone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfourone);


        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ms)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.cc)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.is)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.mad)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.sa)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activityfourone.this, "you selected ms", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jQcRn0hqmmFdcl7RrsQMCxSNW5OgjR-C/view?usp=sharing"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activityfourone.this, "you selected cc", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gkNkr-mzEE7wFU13zIsDB8JQXwWgZzcK/view?usp=sharing"));
                                startActivity(i1);
                                break;
                            case 2:
                                Toast.makeText(Activityfourone.this, "you selected IS", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1J0_lHgj3h6igiUtB_7HW8sFqT73GKQ3y/view?usp=sharing"));
                                startActivity(i2);
                                break;
                            case 3:
                                Toast.makeText(Activityfourone.this, "you selected mad", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14iKfZ1bXLbeoCrR0iPp0k5IZlNkHuxu0/view?usp=sharing"));
                                startActivity(i3);
                                break;
                            case 4:
                                Toast.makeText(Activityfourone.this, "you selected sa", Toast.LENGTH_SHORT).show();
                                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yazWgAwyJkepQUhaa_BAN21NWLJXH96t/view?usp=sharing"));
                                startActivity(i4);
                                break;


                        }

                    }
                });
    }
}
