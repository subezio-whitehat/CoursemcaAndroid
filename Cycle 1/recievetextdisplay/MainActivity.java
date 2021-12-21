package com.example.sjcet.recievetextdisplay;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name,lastname,mobile,address;
    TextView details;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        lastname=(EditText)findViewById(R.id.lastname);
        mobile=(EditText)findViewById(R.id.mobile);
        address=(EditText)findViewById(R.id.address);
        click=(Button)findViewById(R.id.click);
        details=(TextView)findViewById(R.id.details);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Name: "+name.getText()+lastname.getText()+"\nMobile: "+mobile.getText()+"\nAddress: "+address.getText());
            }
        });
    }

}
