package com.example.sjcet.message_read_pass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {
    Button send_button;
    EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_text = (EditText)findViewById(R.id.send_text_id);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // get the value which input by user in EditText
                // and convert it to string
                String str = send_text.getText().toString();
                // Create the Intent object of this class Context() to Second_activity class
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string
                intent.putExtra("message_key", str);
                // start the Intent
                startActivity(intent);
            }
        });


    }


}
