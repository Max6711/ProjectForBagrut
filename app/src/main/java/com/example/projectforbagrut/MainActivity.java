package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    protected void Next (){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Register_Activity.class);
                startActivity(intent);
            }
        }, 2000);
    }
     */

    public void maps (View view){

        Intent intent=new Intent();
        intent.setClass(this, Map_Activity.class);

        startActivity(intent);
        finish();

    }
    public void profile (View view){

        Intent intent=new Intent();
        intent.setClass(this, Profile_Activity.class);

        startActivity(intent);
        finish();

    }


    public void sing_up(View view) {
        Intent intent=new Intent();
        intent.setClass(this, Register_Activity.class);

        startActivity(intent);
        finish();

    }
}