package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);
    }
    public void home (View view) {

        Intent intent = new Intent();
        intent.setClass(this, Home_Activity.class);

        startActivity(intent);
        finish();
    }
    public void maps (View view) {

        Intent intent = new Intent();
        intent.setClass(this, Map_Activity.class);

        startActivity(intent);
        finish();
    }
    public void friends (View view) {

        Intent intent = new Intent();
        intent.setClass(this, Chat_Activity.class);

        startActivity(intent);
        finish();
    }

        public void profile (View view) {

        Intent intent = new Intent();
        intent.setClass(this, Profile_Activity.class);

        startActivity(intent);
        finish();
    }

    }