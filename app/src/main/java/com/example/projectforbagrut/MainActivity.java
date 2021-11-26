package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    long pressedTime;
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

    public void home (View view){

        Intent intent=new Intent();
        intent.setClass(this, Home_Activity.class);

        startActivity(intent);
        finish();

    }

    public void maps (View view){

        Intent intent=new Intent();
        intent.setClass(this, Map_Activity.class);

        startActivity(intent);
        finish();

    }

    public void friends (View view){

        Intent intent=new Intent();
        intent.setClass(this, Chat_Activity.class);

        startActivity(intent);
        finish();

    }
    public void profile (View view){

        Intent intent=new Intent();
        intent.setClass(this, Profile_Activity.class);

        startActivity(intent);
        finish();
        super.onBackPressed();

    }

    public void forgot_password (View view){

        Intent intent=new Intent();
        intent.setClass(this, Forgot_Password.class);

        startActivity(intent);
        finish();

    }
    public void  LogIn (View view){

        Intent intent=new Intent();
        intent.setClass(this, Home_Activity.class);

        startActivity(intent);
        finish();

    }
    public void sing_up(View view) {
        Intent intent=new Intent();
        intent.setClass(this, Register_Activity.class);

        startActivity(intent);
        finish();

    }
    public void onBackPressed() {


        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }
}
