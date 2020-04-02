package com.example.lat_passcode.action;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lat_passcode.MenuSplashActivity;
import com.example.lat_passcode.R;

public class ActionEmpatActivity extends AppCompatActivity {
    ImageButton home;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action4);home = (ImageButton) findViewById(R.id.homeawal);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ActionEmpatActivity.this, MenuSplashActivity.class);
                startActivity(a);
            }
        });
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
