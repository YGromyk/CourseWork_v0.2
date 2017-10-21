package com.example.gromykjuriy.coursework_v02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static java.security.AccessController.getContext;

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


    /** Called when the user taps the Send button */
    public void OpenNewAcivity(View view) {
        Intent intent;
        intent = new Intent(this, SecondActivity1.class);
        startActivity(intent);
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String[] getListBase();
}
