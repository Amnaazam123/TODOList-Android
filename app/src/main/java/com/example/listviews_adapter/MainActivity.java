package com.example.listviews_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView task;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.AddButton);
        task=findViewById(R.id.task);
        ListView list = findViewById(R.id.myListView);

        ArrayList<String> todoList = new ArrayList<String>();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,todoList);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(task.getText()!=""){
                    String todo = task.getText().toString();
                    todoList.add(todo);
                    list.setAdapter(arrayAdapter);
                }
            }
        });
    }
}