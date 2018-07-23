package com.example.gowthamsaidr.uiapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Activitythreetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythreetwo);

        CircleMenu circleMenu= (CircleMenu) findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add,R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ai)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.wt)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.daa)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.dp)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.dm)
                .addSubMenu(Color.parseColor("#FF22DEC5"),R.drawable.cd)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(Activitythreetwo.this, "you selected artifial inteligence", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yQzQjaAK-ZGeD2iv6Rw_38NHSzg6Fi08/view?usp=sharing"));
                                startActivity(i);
                                break;
                            case 1:
                                Toast.makeText(Activitythreetwo.this, "you selected web technologys", Toast.LENGTH_SHORT).show();
                                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1quX7xFR8FcyMFatMHDjBPugodTMFq0zl/view?usp=sharing"));
                                startActivity(i1);
                                break;
                            case 2:
                                Toast.makeText(Activitythreetwo.this, "you selected design analasis and algorithams", Toast.LENGTH_SHORT).show();
                                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KfvVL6GZ2WyFz3iym2OA981I1heaXzRY/view?usp=sharing"));
                                startActivity(i2);
                                break;
                            case 3:
                                Toast.makeText(Activitythreetwo.this, "you selected design patterns", Toast.LENGTH_SHORT).show();
                                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YIb-pNnSbnSCrj6ZqQD0Ieg9uHSW0QOe/view?usp=sharing"));
                                startActivity(i3);
                                break;
                            case 4:
                                Toast.makeText(Activitythreetwo.this, "you selected datamining", Toast.LENGTH_SHORT).show();
                                Intent i4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Zss3bSxULweuMooGPB86peOEQBj2IiHx/view?usp=sharing"));
                                startActivity(i4);
                                break;
                            case 5:
                                Toast.makeText(Activitythreetwo.this, "you selected Compiler design", Toast.LENGTH_SHORT).show();
                                Intent i5=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/19pIE22fmEOS8ysTZrsWTCYEBFUMe_43q/view?usp=sharing"));
                                startActivity(i5);
                                break;



                        }

                    }
                });
    }
}
