package com.example.listviews_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendlist=new ArrayList<String>();
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        friendlist.add("zain");
        friendlist.add("Ahmed");
        friendlist.add("Arooj");

        listView = findViewById(R.id.lw1);

        adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, friendlist);

        Collections.sort(friendlist);

        listView.setAdapter(adapter);
        //delete record
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("adapter view ", adapterView.toString());
                Log.d("view view ", view.toString());
                Log.d("int i ", String.valueOf(i));
                Log.d("long l ", String.valueOf(l));
                Log.d("friend list", friendlist.get(i));
                //delete
                friendlist.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }
    //view details
    //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    //  @Override
    //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    //  Log.d("friend list",friendlist.get(i));
    //Intent intent=new Intent(MainActivity.this,DetailActivity.class);
    // intent.putExtra("name",friendlist.get(i));
    //intent.putExtra("id","9");
    //intent.putExtra("position","Software Engineer");
    //startActivity(intent);
    //}
    //});
    //};

    public void Add(View view){
        friendlist.add("Amna");
        adapter.notifyDataSetChanged();
    }
}