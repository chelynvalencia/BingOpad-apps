package com.example.lat_passcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lat_passcode.action.ActionDuaActivity;
import com.example.lat_passcode.action.ActionEmpatActivity;
import com.example.lat_passcode.action.ActionEnamActivity;
import com.example.lat_passcode.action.ActionLimaActivity;
import com.example.lat_passcode.action.ActionSatuActivity;
import com.example.lat_passcode.action.ActionTigaActivity;

public class ActionActivity extends AppCompatActivity {
    ImageButton btac1, btac2, btac3, btac4, btac5, btac6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        btac1 = findViewById(R.id.menuact1);
        btac2 = findViewById(R.id.menuact2);
        btac3 = findViewById(R.id.menuact3);
        btac4 = findViewById(R.id.menuact4);
        btac5 = findViewById(R.id.menuact5);
        btac6 = findViewById(R.id.menuact6);

        btac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionSatuActivity.class);
                startActivity(a);
            }
        });

        btac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionDuaActivity.class);
                startActivity(a);
            }
        });

        btac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionTigaActivity.class);
                startActivity(a);
            }
        });

        btac4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionEmpatActivity.class);
                startActivity(a);
            }
        });

        btac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionLimaActivity.class);
                startActivity(a);
            }
        });

        btac6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ActionActivity.this, ActionEnamActivity.class);
                startActivity(a);
            }
        });
    }
}
