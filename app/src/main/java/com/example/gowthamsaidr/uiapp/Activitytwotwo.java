package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activitytwotwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwotwo);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.co)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.java)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.flat)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.mpi)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.se)
                .addSubMenu(Color.parseColor("#FF22DEC5"),R.drawable.ps)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activitytwotwo.this, "you selected Computer organization", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YvJirA8vFK5PrdaIxfL7099Ol_xiuzWb/view?usp=sharing\n"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activitytwotwo.this, "you selected JAVA", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dK4WlCVK7OQF0_vsYpl0XK9-AqI8c14H/view?usp=sharing\n"));
                                startActivity(i1);
                                break;
                            case 2:
                                Toast.makeText(Activitytwotwo.this, "you selected flat", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Gbkm66Z3XpRs0ljMLay07-AqxOPvo3O5/view?usp=sharing\n"));
                                startActivity(i2);
                                break;
                            case 3:
                                Toast.makeText(Activitytwotwo.this, "you selected mpi", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ENXQbbO-IsI4SAJapAiNnzZ0pG1RnQx0/view?usp=sharing\n"));
                                startActivity(i3);
                                break;
                            case 4:
                                Toast.makeText(Activitytwotwo.this, "you selected software engineering", Toast.LENGTH_SHORT).show();
                                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/15psWsMbDuQ59NYAL9KdSoEmLWMjx3gi1/view?usp=sharing\n"));
                                startActivity(i4);
                               break;
                            case 5:
                              Toast.makeText(Activitytwotwo.this, "you selected probability statistics", Toast.LENGTH_SHORT).show();
                               Intent i5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1b0zVWOnfNkhqPt-VMEBUfcyYZs5G4Qmb/view?usp=sharing\n"));
                                startActivity(i5);
                                break;


                        }

                    }
                });
    }
}
