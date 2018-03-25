package com.travis.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class hostels_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hostels_name);
        RelativeLayout a = findViewById(R.id.kailash);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(hostels_name.this,blocks.class));
            }
        });
        findViewById(R.id.manimahesh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.himgiri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.himadri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.shivalik).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.vidyanchal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.satpura).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.ambika).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.parvati).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.dauladhar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.neelkanth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(hostels_name.this, "Will be added soon", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

