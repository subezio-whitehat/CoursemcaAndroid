package com.example.sjcet.listtoast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.list1);
        String[] courses = {"MCA", "MBA", "BBA", "BCA"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, courses);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);//implement the method by alt+enter


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemname = lv.getItemAtPosition(i).toString();
        Toast.makeText(this, itemname, Toast.LENGTH_SHORT).show();
    }
}
