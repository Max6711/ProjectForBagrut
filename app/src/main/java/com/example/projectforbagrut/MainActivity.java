package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void maps (View view){

        Intent intent=new Intent();
        intent.setClass(this, Maps_Activity.class);

        startActivity(intent);
        finish();

    }
    public void profile (View view){

        Intent intent=new Intent();
        intent.setClass(this, Profile_Activity.class);

        startActivity(intent);
        finish();

    }

    public void forgot_password(View view) {
        Intent intent=new Intent();
        intent.setClass(this, Forgot_Password.class);

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