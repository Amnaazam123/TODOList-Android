package com.example.listviews_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class AddRecordActivity extends AppCompatActivity {

    Button addRecord;
    ArrayList<String> records;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        records=new ArrayList<String>();

        addRecord=findViewById(R.id.btn_add);
    }

    public void AddRecord(View view) {
        records.add("Arshiaa");
    }

}