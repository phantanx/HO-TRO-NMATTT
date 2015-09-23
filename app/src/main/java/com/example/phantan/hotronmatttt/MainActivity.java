package com.example.phantan.hotronmatttt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.phantan.utils.Constant;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //    private ArrayList<String> mArrayList;
//    private ExampleArrayAdapter mExampleArrayAdapter;
    private ArrayList<String> mDataList;
    private ListView mListView;
    private ArrayAdapter<String> mArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDataList = new ArrayList<>();
        mDataList.add("A power B mod M");
        mListView=(ListView)findViewById(R.id.listview);
        mArrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mDataList);
        mListView.setAdapter(mArrayAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                handleItemClick(position);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void handleItemClick(int pos){
        switch (pos){
            case Constant.A_POWER_B_MOD_M:
                Log.d("MainActivity.java","A power B mod B");
                startActivity(new Intent(this,ModulusOfPower.class));
                break;
            default:
                Log.d("MainActivity.java","Defaut Handle Item Click");
        }
    }
}

 /*
mListView =(ListView)findViewById(R.id.listview);
final String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
        "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
        "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
        "Android", "iPhone", "WindowsMobile" };
        mArrayList = new ArrayList<>();
        for(int i=0;i<values.length;i++){
        mArrayList.add(values[i]);
        }

        mExampleArrayAdapter = new ExampleArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,mArrayList);
        mListView.setAdapter(mExampleArrayAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
final String item = (String)parent.getItemAtPosition(position);
        view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
@Override
public void run() {
        mArrayList.remove(item);
        mExampleArrayAdapter.notifyDataSetChanged();
        view.setAlpha(1);
        }
        });
        }
        });
        int a = 1;
 */