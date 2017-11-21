package com.example.gromykjuriy.coursework_v02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondActivity1 extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        GridView gv = (GridView) findViewById(R.id.griedView);
        // Initializing a new String Array
        String[] plants = getListBase();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < plants.length; i++)
            arrayList.add(plants[i] + " - " + plants[++i]);
        // Populate a List from Array elements
        final List<String> plantsList = new ArrayList<String>(Arrays.asList(plants));

        // Create a new ArrayAdapter
        final ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arrayList);

        // Data bind GridView with ArrayAdapter (String Array elements)
        gv.setAdapter(gridViewArrayAdapter);

    }
        /*
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.textView);
        String[] arr = getListBase();
        String str = new String();
        for(String var: arr)
            str += var +",";
        tv.setText(str);
        */



    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String[] getListBase();
}