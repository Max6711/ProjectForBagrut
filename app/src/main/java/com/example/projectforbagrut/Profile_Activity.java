package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void profile_settings (View view){

        Intent intent=new Intent();
        intent.setClass(this, Profile_Settings.class);

        startActivity(intent);
        finish();

    }
}