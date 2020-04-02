package com.example.lat_passcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lat_passcode.romance.RomanceDuaActivity;
import com.example.lat_passcode.romance.RomanceEmpatActivity;
import com.example.lat_passcode.romance.RomanceEnamActivity;
import com.example.lat_passcode.romance.RomanceLimaActivity;
import com.example.lat_passcode.romance.RomanceSatuActivity;
import com.example.lat_passcode.romance.RomanceTigaActivity;
import com.example.lat_passcode.romance.RomanceTujuhActivity;

public class RomanceActivity extends AppCompatActivity {
    ImageButton btrm1,btrm2,btrm3,btrm4,btrm5,btrm6,btrm7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance);

        btrm1 = findViewById(R.id.menurm1);
        btrm2 = findViewById(R.id.menurm2);
        btrm3 = findViewById(R.id.menurm3);
        btrm4 = findViewById(R.id.menurm4);
        btrm5 = findViewById(R.id.menurm5);
        btrm6 = findViewById(R.id.menurm6);
        btrm7 = findViewById(R.id.menurm7);

        btrm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceSatuActivity.class);
                startActivity(a);
            }
        });


        btrm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceDuaActivity.class);
                startActivity(a);
            }
        });

        btrm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceTigaActivity.class);
                startActivity(a);
            }
        });

        btrm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceEmpatActivity.class);
                startActivity(a);
            }
        });
        btrm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceLimaActivity.class);
                startActivity(a);
            }
        });

        btrm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceEnamActivity.class);
                startActivity(a);
            }
        });

        btrm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(RomanceActivity.this, RomanceTujuhActivity.class);
                startActivity(a);
            }
        });

    }
}
