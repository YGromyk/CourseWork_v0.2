package com.example.gromykjuriy.coursework_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewWords extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }
    ListView listView = (ListView)findViewById(R.id.listView);
    String[] str = getListBase();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_words);
        /*
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, str);
        listView.setAdapter(arrayAdapter); */


    }
    public native String[] getListBase();
}


