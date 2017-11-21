package com.example.gromykjuriy.coursework_v02;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }
     private int CorrectAnswer = 0;
     int AllAsk;
     private int Index = 0;
     int n = 3;
     RadioGroup RGroup;
     RadioButton rb;
     TextView counter;
     TextView textView;
     String CurrentQuestion;
     String CurrentAnswer;
     String[] Base;
     ArrayList<String> Questions = new ArrayList<>();
     ArrayList<String> Answers = new ArrayList<>();
    public native String[] getListBase();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        RGroup = (RadioGroup) findViewById(R.id.RGroup);
        counter = (TextView) findViewById(R.id.counter);
        textView = (TextView) findViewById(R.id.textView);
        Base = getListBase();

        for(int i = 0; i < Base.length; i++){
            if(i%2 == 0)
                Questions.add(Base[i]);
            else
                Answers.add(Base[i]);
        }
        makeQuestion();
    }

    void makeQuestion(){
        counter.setText(CorrectAnswer+"/"+20);
        if(AllAsk == 20)
        {
            TestDoned();
            return;
        }
        CurrentQuestion = Questions.get(Index);
        CurrentAnswer = Answers.get(Index);
        textView.setText(CurrentQuestion);
        Random rand = new Random();

        int correctAnswer = rand.nextInt(4);
        for(int i = 0; i < RGroup.getChildCount(); i++){
            if( i == correctAnswer){
                ((RadioButton) RGroup.getChildAt(i)).setText(CurrentAnswer);
            }
            else{
                while(true){
                    int n = rand.nextInt(Answers.size());
                    if(CheckRadioButtons(Answers.get(n))){
                        ((RadioButton) RGroup.getChildAt(i)).setText(Answers.get(n));
                        break;
                    }
                }
            }
        }

    }

    boolean CheckRadioButtons(String answ){
        for(int i = 0; i < RGroup.getChildCount(); i++) {
            if (((RadioButton) RGroup.getChildAt(i)).getText().equals(answ))
                return false;
        }
        return true;
    }

    public void TestDoned(){
        new AlertDialog.Builder(this)
                .setTitle("Test finished!")
                .setMessage("You have" + CorrectAnswer + "/" + AllAsk)
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton("Try again", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        CorrectAnswer = AllAsk = Index = 0;
                        makeQuestion();
                    }
                }).create().show();
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit from test?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        Intent intent;
                        intent = new Intent(TestActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }).create().show();
    }

    public void CheckAnswer(View view) {
        int id = RGroup.getCheckedRadioButtonId();
        final int COLOR;
        if(id != -1){
            rb = (RadioButton) findViewById(id);
            if (rb.getText() == CurrentAnswer){
                Index++;
                COLOR = Color.GREEN;
                CorrectAnswer++;
            }
            else{
                COLOR = Color.RED;
            }
            new CountDownTimer(750, 250) {

                public void onTick(long millisUntilFinished) {
                    rb.setBackgroundColor(COLOR);
                }

                public void onFinish() {
                    rb.setBackgroundColor(Color.TRANSPARENT);
                }
            }.start();

            AllAsk++;
            makeQuestion();
            rb.setChecked(false);

            }
    }
}
