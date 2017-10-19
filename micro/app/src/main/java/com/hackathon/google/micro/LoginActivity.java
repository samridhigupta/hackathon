package com.hackathon.google.micro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends Activity {


    Button b1,b2;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1=(Button)findViewById(R.id.button);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);

        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void login(View view) {
        if(ed1.getText().toString().equals("user") && ed2.getText().toString().equals("user")) {
            Intent intent = new Intent(this, EnterCodeActivity.class);
            startActivity(intent);
        } else if(ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin")) {
                Intent intent = new Intent(this, RedemptionActivity.class);
                startActivity(intent);

        } else if(ed1.getText().toString().equals("shelter") && ed2.getText().toString().equals("shelter")) {
            Intent intent = new Intent(this, ShelterActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials, Try Again",Toast.LENGTH_SHORT).show();
        }
    }
}

