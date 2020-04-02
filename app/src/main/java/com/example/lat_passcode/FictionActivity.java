package com.example.lat_passcode;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.lat_passcode.fiction.FictionDuaActivity;
import com.example.lat_passcode.fiction.FictionEmpatActivity;
import com.example.lat_passcode.fiction.FictionEnamActivity;
import com.example.lat_passcode.fiction.FictionLimaActivity;
import com.example.lat_passcode.fiction.FictionSatuActivity;
import com.example.lat_passcode.fiction.FictionTigaActivity;

public class FictionActivity extends AppCompatActivity {
    CardView cdfi1, cdfi2, cdfi3, cdfi4, cdfi5, cdfi6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);

        cdfi1 = findViewById(R.id.menufi1);
        cdfi2 = findViewById(R.id.menufi2);
        cdfi3 = findViewById(R.id.menufi3);
        cdfi4 = findViewById(R.id.menufi4);
        cdfi5 = findViewById(R.id.menufi5);
        cdfi6 = findViewById(R.id.menufi6);

        cdfi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionSatuActivity.class);
                startActivity(a);
            }
        });
        cdfi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionDuaActivity.class);
                startActivity(a);
            }
        });
        cdfi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionTigaActivity.class);
                startActivity(a);
            }
        });
        cdfi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionEmpatActivity.class);
                startActivity(a);
            }
        });
        cdfi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionLimaActivity.class);
                startActivity(a);
            }
        });
        cdfi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(FictionActivity.this, FictionEnamActivity.class);
                startActivity(a);
            }
        });
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
