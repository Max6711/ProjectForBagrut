package com.example.projectforbagrut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register_Activity extends AppCompatActivity {
    private EditText EmailAddress , Number , Password;
    private DatabaseReference DataBase;
    private String user = "user";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        in();
    }
    private void in (){
        EmailAddress = findViewById(R.id.EmailAddress);
        Number = findViewById(R.id.TextPhone);
        Password = findViewById(R.id.Password);
        DataBase = FirebaseDatabase.getInstance().getReference(user);
    }
    public void Register(View view){
        String id = DataBase.getKey();
        String email = EmailAddress.getText().toString();
        String number = Number.getText().toString();
        String password = Password.getText().toString();
        FireBase firebase = new FireBase(id , number, password , email);
        DataBase.push().setValue(firebase);
        Toast.makeText(getBaseContext(), "SAVE", Toast.LENGTH_SHORT).show();
    }

    public void Sing_In (View view){

        Intent intent=new Intent();
        intent.setClass(this, Home_Activity.class);

        startActivity(intent);
        finish();

    }
}