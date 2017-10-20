package com.example.gromykjuriy.coursework_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv = (GridView) findViewById(R.id.griedView);
        Button btn = (Button) findViewById(R.id.button);

        // Initializing a new String Array
        String[] plants = getListBase();
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i < plants.length; i++)
            arrayList.add(plants[i] + " - " + plants[++i]);
        // Populate a List from Array elements
        final List<String> plantsList = new ArrayList<String>(Arrays.asList(plants));

        // Create a new ArrayAdapter
        final ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, arrayList);

        // Data bind GridView with ArrayAdapter (String Array elements)
        gv.setAdapter(gridViewArrayAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add/insert item to ArrayAdapter
                // Insert at the end of ArrayAdapter
                // ArrayAdapter is zero based index
                plantsList.add(plantsList.size(),"Itchweed");

                // Update the GridView
                gridViewArrayAdapter.notifyDataSetChanged();

                // Get the newly added item from ArrayAdapter
                String addedItemText = plantsList.get(plantsList.size()-1);

                // Confirm the addition
                Toast.makeText(getApplicationContext(),
                        "Item added : " + addedItemText, Toast.LENGTH_SHORT).show();
            }
        });
        /*
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.textView);
        String[] arr = getListBase();
        String str = new String();
        for(String var: arr)
            str += var +",";
        tv.setText(str);
        Button button = (Button) findViewById(R.id.button);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(MainActivity.this, ListViewWords.class);
                startActivity(myIntent);
            }
        });
        */
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String[] getListBase();
}
