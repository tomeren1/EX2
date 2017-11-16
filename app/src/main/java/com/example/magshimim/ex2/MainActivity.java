package com.example.magshimim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    final String MY_TAG = "EX2.MainActivity";
    private int cnt=0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cnt",this.cnt);
        Log.i(MY_TAG,"onSaveInstanceState Event");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null)
        {
            this.cnt=savedInstanceState.getInt("cnt");
        }
        else
        {
            Toast.makeText(this, "Welcome, this is your first java coding", Toast.LENGTH_LONG).show();
        }
        Log.i(MY_TAG,"onRestoreInstanceState Event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStart Event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResume Event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPause Event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStop Event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,"onDestroy Event");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"onCreate Event");


    }
    public void bottonClicked(View v)
    {

        EditText edName = (EditText)findViewById(R.id.input);
        if(edName.getText().length()==0)
        {
            Toast.makeText(this, "you mast enter your name", Toast.LENGTH_LONG).show();
        }
        else
        {
            this.cnt++;
            Toast.makeText(this, "Hy " + edName.getText() +  " the botton was clicked: " + cnt + " times", Toast.LENGTH_LONG).show();
        }
    }
}
