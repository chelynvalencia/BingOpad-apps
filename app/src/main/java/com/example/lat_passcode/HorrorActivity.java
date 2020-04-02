package com.example.lat_passcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lat_passcode.horror.HorrorDuaActivity;
import com.example.lat_passcode.horror.HorrorEmpatActivity;
import com.example.lat_passcode.horror.HorrorEnamActivity;
import com.example.lat_passcode.horror.HorrorLimaActivity;
import com.example.lat_passcode.horror.HorrorSatuActivity;
import com.example.lat_passcode.horror.HorrorTigaActivity;
import com.example.lat_passcode.romance.RomanceSatuActivity;

public class HorrorActivity extends AppCompatActivity {
    ImageButton bthr1, bthr2, bthr3, bthr4, bthr5, bthr6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);

        bthr1 = findViewById(R.id.menuhr1);
        bthr2 = findViewById(R.id.menuhr2);
        bthr3 = findViewById(R.id.menuhr3);
        bthr4 = findViewById(R.id.menuhr4);
        bthr5 = findViewById(R.id.menuhr5);
        bthr6 = findViewById(R.id.menuhr6);
        bthr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HorrorActivity.this, HorrorSatuActivity.class);
                startActivity(a);
            }
        });
        bthr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HorrorActivity.this, HorrorDuaActivity.class);
                startActivity(a);
            }
        });

        bthr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HorrorActivity.this, HorrorTigaActivity.class);
                startActivity(a);
            }
        });

        bthr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HorrorActivity.this, HorrorEmpatActivity.class);
                startActivity(a);
            }
        });

        bthr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HorrorActivity.this, HorrorLimaActivity.class);
                startActivity(a);
            }
        });

        bthr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HorrorActivity.this, HorrorEnamActivity.class);
                startActivity(a);
            }
        });
    }

}
