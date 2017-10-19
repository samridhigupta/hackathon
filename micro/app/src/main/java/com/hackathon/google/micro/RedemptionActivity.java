package com.hackathon.google.micro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RedemptionActivity extends AppCompatActivity {

    Button b1;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redemption);


        b1=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editText);
    }

    public void redeem(View view) {
        Toast.makeText(getApplicationContext(), "Redeemed " + ed.getText().toString() + " meals", Toast.LENGTH_SHORT).show();
    }

}

