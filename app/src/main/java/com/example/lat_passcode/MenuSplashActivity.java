package com.example.lat_passcode;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuSplashActivity extends AppCompatActivity {

    ImageButton btnRomance, btnHorror, btnAction, btnFiction;
    ImageView bgapp, clover;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusplash);


        btnRomance = findViewById(R.id.romance);
        btnHorror = findViewById(R.id.horror);
        btnAction= findViewById(R.id.action);
        btnFiction = findViewById(R.id.fiction);

        btnRomance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MenuSplashActivity.this, RomanceActivity.class);
                startActivity(a);
            }
        });

        btnHorror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MenuSplashActivity.this, HorrorActivity.class);
                startActivity(a);
            }
        });
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MenuSplashActivity.this, ActionActivity.class);
                startActivity(a);
            }
        });
        btnFiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MenuSplashActivity.this, FictionActivity.class);
                startActivity(a);
            }
        });



        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);
        menus = (LinearLayout) findViewById(R.id.menus);

        bgapp.animate().translationY(-1900).setDuration(2000).setStartDelay(1000);
        clover.animate().alpha(0).setDuration(1500).setStartDelay(600);
        textsplash.animate().translationY(140).alpha(0).setDuration(1500).setStartDelay(800);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);


    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}


