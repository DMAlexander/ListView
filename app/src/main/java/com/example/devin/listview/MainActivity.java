package com.example.devin.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String foods[] = {"Bacon", "Ham", "Tuna", "Candy", "Meatball", "Potato"};
        ListAdapter devinsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        ListView devinsListView = (ListView) findViewById(R.id.devinsListView);
        devinsListView.setAdapter(devinsAdapter);

        devinsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                        String food = String.valueOf(adapterView.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
