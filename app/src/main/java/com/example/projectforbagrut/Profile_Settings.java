package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);
    }
    public void change (View view){
        Intent intent=new Intent();
        intent.setClass(this, change_password.class);

        startActivity(intent);
        finish();
    }
}