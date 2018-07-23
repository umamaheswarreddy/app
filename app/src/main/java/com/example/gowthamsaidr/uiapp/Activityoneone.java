package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activityoneone extends AppCompatActivity {

    String arrayName[]={"C","java","google","pinrest","vchat"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityoneone);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.c)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.phy)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.eng)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                       switch (index){
                           case 0:
                               Toast.makeText(Activityoneone.this, "you selected C", Toast.LENGTH_SHORT).show();
                               Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1AzAfDHpiCu-ZyisadAeDOjxpc3COGoiM/view?usp=sharing"));
                               startActivity(i);
                               break;

                           case 1:
                               Toast.makeText(Activityoneone.this, "you selected physics", Toast.LENGTH_SHORT).show();
                               Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uFgvIH2ShnpmtMfaaFA9V2KgRnw8oQiI/view?usp=sharing"));
                               startActivity(i2);
                               break;
                           case 2:
                               Toast.makeText(Activityoneone.this, "you selected english", Toast.LENGTH_SHORT).show();
                               Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uUfb-p6Qr9IwfMQZpkVGAfSMN3xMKxTM/view?usp=sharing"));
                               startActivity(i3);
                               break;


                       }

                    }
                });
    }

}
