package com.example.sjcet.optionmenu;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener {
    GridView gridView;
    static final String[] gridviewvalue={
            "facebook","Instagram","YouTube","Whatsapp",
            "facebook","Instagram","YouTube","Whatsapp",
            "Twitter","Snapchat","Pinterest","Onlyfans"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridv1);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,gridviewvalue);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname=gridView.getItemAtPosition(i).toString();
        Toast.makeText(this,itemname,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Profile:   // full colon
                Toast.makeText(this, " Profile Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Contactus:
                Toast.makeText(this, " Contact Us Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, " Help Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Logout:
                Toast.makeText(this, " Logout  Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}