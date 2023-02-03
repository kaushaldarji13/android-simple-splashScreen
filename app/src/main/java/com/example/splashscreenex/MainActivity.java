package com.example.splashscreenex;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.circularreveal.CircularRevealRelativeLayout;

public class MainActivity extends AppCompatActivity {

    Animation logo , leftToRight , rightToLeft , pop_up;
    ImageView img, img_left, img_right;
    RelativeLayout relativeLayout_main ;
    TextView txt ;


    @SuppressLint({"MissingInflatedId", "SuspiciousIndentation"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        relativeLayout_main = findViewById(R.id.main_layout);
        img = findViewById(R.id.img);
        img_left = findViewById(R.id.img_left);
        img_right = findViewById(R.id.img_right);
        txt = findViewById(R.id.text);

        logo = AnimationUtils.loadAnimation(MainActivity.this,R.anim.heartbeat_anim);
        leftToRight = AnimationUtils.loadAnimation(MainActivity.this,R.anim.left_torigth_anim);
        rightToLeft = AnimationUtils.loadAnimation(MainActivity.this,R.anim.right_toleft_anim);
        pop_up = AnimationUtils.loadAnimation(MainActivity.this , R.anim.pop_up_anim);


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//
//                relativeLayout_main.setVisibility(View.VISIBLE);
//                relativeLayout_main.setAnimation(logo);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        txt.setVisibility(View.VISIBLE);
                        txt.setAnimation(logo);

                        img.setVisibility(View.VISIBLE);
                        img.setAnimation(logo);

                        img_left.setVisibility(View.VISIBLE);
                        img_left.setAnimation(leftToRight);

                        img_right.setVisibility(View.VISIBLE);
                        img_right.setAnimation(rightToLeft);

                    }
                },1200);
//
//            }
//        },1000);


        new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Intent intent = new Intent(MainActivity.this, home.class);
                      startActivity(intent);
                  }
              },3000    );


    }

}