package com.example.gromykjuriy.coursework_v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class SecondActivity1 extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib.cpp");
    }

    private CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox);
    private CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
    private CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
    private CheckBox checkBox4 = (CheckBox)findViewById(R.id.checkBox4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
    }
    public void onCheckboxClicked1(){
        if(checkBox1.isChecked()){
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
        }

    }
    public void onCheckboxClicked2(){
        if(checkBox2.isChecked()){
            checkBox1.setChecked(false);
            checkBox3.setChecked(false);
            checkBox4.setChecked(false);
        }

    }
    public void onCheckboxClicked3(){
        if(checkBox3.isChecked()){
            checkBox2.setChecked(false);
            checkBox1.setChecked(false);
            checkBox4.setChecked(false);
        }

    }
    public void onCheckboxClicked4(){
        if(checkBox4.isChecked()){
            checkBox2.setChecked(false);
            checkBox3.setChecked(false);
            checkBox1.setChecked(false);
        }

    }

}
