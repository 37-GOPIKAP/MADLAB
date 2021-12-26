package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private Button login;
    private TextView info;
    int count=5;
    String username,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etname);
        password=(EditText)findViewById(R.id.etpassword);
        login=(Button)findViewById(R.id.btnlogin);
        info=(TextView)findViewById(R.id.tvinfo);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                username=name.getText().toString();
                pass=password.getText().toString();

                if (username.equals("gopika") && pass.equals("gp@123"))
                {
                    Intent intent= new Intent(MainActivity.this,login.class);
                    startActivity(intent);
                }
                else
                {

                    count--;
                    info.setText("Login attempt remaining:"+count);
                    if(count==0)
                    {
                        info.setText("Login Failed");
                        login.setEnabled(false);
                        Toast.makeText(MainActivity.this,"login failed",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}