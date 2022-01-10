package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText Name,Pass;
    private Button Login;

    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name =(EditText) findViewById(R.id.etnusername);
        Pass =(EditText) findViewById(R.id.etnpass);

        Login =(Button) findViewById(R.id.etnlogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Pass.getText().toString());
            }
        });

    }
    private void validate(String username ,String password){
        if((username.equals("Gopika"))&&(password.equals("Gopika@124")))
        {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }else{
            Login.setError("Incorrect username and password");

            counter--;

            if(counter==0){
                Login.setEnabled(false);
            }

        }
    }
}