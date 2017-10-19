package com.hackathon.google.micro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DonationActivity extends AppCompatActivity {

    Button b1, b2;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button1);
        et=(EditText)findViewById(R.id.editText3);
        tv=(TextView)findViewById(R.id.tv);
    }


    public void donate(View view) {
        Toast.makeText(getApplicationContext(), "donated " + et.getText() + " number of meals", Toast.LENGTH_SHORT).show();
        int cost = 2 * Integer.valueOf(et.getText().toString().trim());
        tv.setText("$" + String.valueOf(cost));
    }

    public void discover(View view){
        Intent intent = new Intent(this, ShelterActivity.class);
        startActivity(intent);
    }
}
