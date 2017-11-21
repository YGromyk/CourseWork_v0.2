package com.example.gromykjuriy.coursework_v02;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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
    public void OpenNewActivity(View view) {
        Intent intent;
        if(view.getId() == R.id.buttonLearn) {
            intent = new Intent(MainActivity.this, SecondActivity1.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.buttonTest){
            intent = new Intent(MainActivity.this, TestActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                    }
                }).create().show();
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String[] getListBase();
}
