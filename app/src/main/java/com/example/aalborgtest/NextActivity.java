package com.example.aalborgtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Metal");
        list.add("Træ");
        list.add("Glas");
        list.add("Jord");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    startActivity(new Intent(NextActivity.this,GlasActivity.class));
                }else if (position==1){
                    startActivity(new Intent(NextActivity.this,JordActivity.class));
                }else if (position==2){
                    startActivity(new Intent(NextActivity.this, MetalActivity.class));
                }else if(position==3){
                    startActivity(new Intent(NextActivity.this, TraeActivity.class));
                }else{

                }
            }
        });
    }
}