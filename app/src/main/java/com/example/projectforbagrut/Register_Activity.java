package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
    public void Sing_In (View view){

        Intent intent=new Intent();
        intent.setClass(this, Home_Activity.class);

        startActivity(intent);
        finish();

    }
}