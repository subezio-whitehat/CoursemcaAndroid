package com.example.sjcet.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    TextView tv1;
    int n1, n2;
    float res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.id1);
        ed2 = (EditText) findViewById(R.id.id2);
        tv1 = (TextView) findViewById(R.id.result);

    }

    public void subtract(View view) {
        String fst = ed1.getText().toString();
        String secnd = ed2.getText().toString();
        n1 = Integer.parseInt(fst);
        n2 = Integer.parseInt(secnd);
        res = n1-n2;

    }

    public void add(View view) {
        String fst = ed1.getText().toString();
        String secnd = ed2.getText().toString();
        n1 = Integer.parseInt(fst);
        n2 = Integer.parseInt(secnd);
        res = n1+n2;
    }

    public void divide(View view) {
        String fst = ed1.getText().toString();
        String secnd = ed2.getText().toString();
        n1 = Integer.parseInt(fst);
        n2 = Integer.parseInt(secnd);
        res = n1/n2;
    }

    public void multiply(View view) {
        String fst = ed1.getText().toString();
        String secnd = ed2.getText().toString();
        n1 = Integer.parseInt(fst);
        n2 = Integer.parseInt(secnd);
        res = n1*n2;
    }

    public void result(View view) {
        String ans = Float.toString(res);
        tv1.setText(ans);
    }
}
