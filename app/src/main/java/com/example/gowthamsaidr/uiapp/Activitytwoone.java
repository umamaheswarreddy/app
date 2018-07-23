package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activitytwoone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwoone);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)

                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.dm)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.dbms)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.mefa)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.edc)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){

                            case 0:
                                Toast.makeText(Activitytwoone.this, "you selected descret mathamatics", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15mY1TooLrdgYXFxPF1Vl9i3Jvcd_nuMJ/view?usp=sharing"));
                                startActivity(i1);
                                break;
                            case 1:
                                Toast.makeText(Activitytwoone.this, "you selected DBMS", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WYM-Kmq9xYu8eiEx91kt6LzJ7AuQW5-i/view?usp=sharing"));
                                startActivity(i2);
                                break;
                            case 2:
                                Toast.makeText(Activitytwoone.this, "you selected MEFA", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1_Ef_aNoo5B3FqzFeguQ4ZoikeqjP-NkT/view?usp=sharing"));
                                startActivity(i3);
                                break;
                            case 3:
                                Toast.makeText(Activitytwoone.this, "you selected EDC", Toast.LENGTH_SHORT).show();
                                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IL96xqXc2MZXzFy_8TyaOHx4854J4FM0/view?usp=sharing"));
                                startActivity(i4);
                                break;


                        }

                    }
                });
    }
}
