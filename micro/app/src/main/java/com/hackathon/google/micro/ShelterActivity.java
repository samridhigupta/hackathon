package com.hackathon.google.micro;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class ShelterActivity extends AppCompatActivity {

    Button b1;
    EditText ed, ed2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);
        b1=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editZipCode);
        ed2=(EditText)findViewById(R.id.editText3);
        tv = (TextView)findViewById(R.id.numberOfMealsDonated);
        tv.setText("5");
    }

    public void find(View view) {
        Toast.makeText(getApplicationContext(),
                "Loading restaurants that pay it forward!", Toast.LENGTH_SHORT).show();
    }

    public void enterCode(View view) {
        Intent intent = new Intent(this, EnterCodeActivity.class);
        startActivity(intent);
    }
}
