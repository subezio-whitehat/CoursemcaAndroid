package com.example.sjcet.switch_to_next_activity;

import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =findViewById(R.id.bt);
    }
    public void click(View view) {
        OpenNewActivity();
    }
    public void OpenNewActivity(){
        Intent intent=new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}