package com.example.lat_passcode.horror;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lat_passcode.MenuSplashActivity;
import com.example.lat_passcode.R;
import com.example.lat_passcode.romance.RomanceSatuActivity;

public class HorrorSatuActivity extends AppCompatActivity {
    ImageView home;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror1);

        home = findViewById(R.id.homeawal);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(HorrorSatuActivity.this, MenuSplashActivity.class);
                startActivity(a);
            }
        });


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

}
