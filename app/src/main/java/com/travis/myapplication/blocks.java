package com.travis.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Chobarla on 3/25/2018.
 */

public class blocks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blocks);
        findViewById(R.id.block_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(blocks.this,floors.class) );
            }
        });
        findViewById(R.id.block_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blocks.this, "Will be added soon!", Toast.LENGTH_SHORT).show();;
            }
        });

        findViewById(R.id.block_c).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blocks.this, "Will be added soon!", Toast.LENGTH_SHORT).show();;
            }
        });

        findViewById(R.id.block_d).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blocks.this, "Will be added soon!", Toast.LENGTH_SHORT).show();;
            }
        });

        findViewById(R.id.block_e).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(blocks.this, "Will be added soon!", Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
