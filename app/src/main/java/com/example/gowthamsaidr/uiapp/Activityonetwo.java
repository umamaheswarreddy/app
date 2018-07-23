package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activityonetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityonetwo);



        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.chemistry)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.es)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ds)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.eng)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activityonetwo.this, "you selected Chemistry", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/10ZyRAJ4ZspM4m81Bl00kbfoFQVKrisXG/view?usp=sharing"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activityonetwo.this, "you selected environment science", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1qkF97M50DkVz5Y7wrd5fnLMlg_Q7_gVD/view?usp=sharing"));
                                startActivity(i1);
                                break;
                            case 2:
                                Toast.makeText(Activityonetwo.this, "you selected datastructurs", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-f26XjQcUFRCwzW_WL5bQUHwTv6JkN8U/view?usp=sharing"));
                                startActivity(i2);
                                break;
                            case 3:
                                Toast.makeText(Activityonetwo.this, "you selected english", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uUfb-p6Qr9IwfMQZpkVGAfSMN3xMKxTM/view?usp=sharing"));
                                startActivity(i3);
                                break;



                        }

                    }
                });

    }
}
