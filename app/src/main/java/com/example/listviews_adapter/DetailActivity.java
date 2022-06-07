package com.example.listviews_adapter;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView name,id,position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img=findViewById(R.id.imageView);
        name=findViewById(R.id.textView);
        id=findViewById(R.id.textView2);
        position=findViewById(R.id.textView3);

        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
        id.setText(intent.getStringExtra("id"));
        position.setText(intent.getStringExtra("position"));
    }
}