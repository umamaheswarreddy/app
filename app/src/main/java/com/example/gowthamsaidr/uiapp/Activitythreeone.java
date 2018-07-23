package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activitythreeone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythreeone);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ppl)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ooad)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.st)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.os)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.cn)
                .addSubMenu(Color.parseColor("#FF22DEC5"),R.drawable.bigdata)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activitythreeone.this, "you selected ppl", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1IQmom7b5AcVXz5m6D368OG61pSGciFRB/view?usp=sharing"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activitythreeone.this, "you selected ooad", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JRmTFfxT4iaKQQr15RQ8CsFz5_IdjCQo/view?usp=sharing"));
                                startActivity(i1);
                                break;
                            case 2:
                                Toast.makeText(Activitythreeone.this, "you selected st", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FMchYTuO1yOZEUnz9tjGocCpajcx2UP6/view?usp=sharing"));
                                startActivity(i2);
                                break;
                            case 3:
                                Toast.makeText(Activitythreeone.this, "you selected os", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fOA7O4PDAUzwCYgFUBtYiKppjHXJFjZU/view?usp=sharing"));
                                startActivity(i3);
                                break;
                            case 4:
                                Toast.makeText(Activitythreeone.this, "you selected Coputer networks", Toast.LENGTH_SHORT).show();
                                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1z-G2e62JOMVy9RDEdg3prYFEX5t1kgr4/view?usp=sharing"));
                                startActivity(i4);
                                break;
                            case 5:
                                Toast.makeText(Activitythreeone.this, "you selected bigdata", Toast.LENGTH_SHORT).show();
                                Intent i5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uUfb-p6Qr9IwfMQZpkVGAfSMN3xMKxTM/view?usp=sharing\n"));
                                startActivity(i5);
                                break;


                        }

                    }
                });
    }
}
