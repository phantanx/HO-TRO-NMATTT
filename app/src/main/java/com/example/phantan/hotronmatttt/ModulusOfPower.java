package com.example.phantan.hotronmatttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.phantan.utils.CenterProcessing;

import java.util.ArrayList;

public class ModulusOfPower extends AppCompatActivity {
    private String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
            "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
            "Android", "iPhone", "WindowsMobile"};
    private ArrayList<String> calculatingDetails = new ArrayList<>();
    private EditText inputA, inputB, inputM;
    private ListView mListView;
    private Button mop_act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulus_of_power);
        //khởi tạo các biến, giá trị ban đầu

        mListView = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<String> mStringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,calculatingDetails);
        mListView.setAdapter(mStringArrayAdapter);

        inputA = (EditText) findViewById(R.id.inputA);
        inputB = (EditText) findViewById(R.id.inputB);
        inputM = (EditText) findViewById(R.id.inputM);

        mop_act = (Button)findViewById(R.id.mop_act);
        mop_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    long a = Long.valueOf(inputA.getText() + "");
                    long b = Long.valueOf(inputB.getText() + "");
                    long m = Long.valueOf(inputM.getText() + "");
                    CenterProcessing.replaceArrayListDataWithArrayList(calculatingDetails,CenterProcessing.modulo(a,b,m));
                    mStringArrayAdapter.notifyDataSetChanged();

                } catch (Throwable e) {
                    Log.d(getClass().getSimpleName(), e.getMessage());
                }
            }
        });

//        for (int i = 0; i < values.length; i++) {
//            calculatingDetails.add(values[i]);
//        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_modulus_of_power, menu);
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
}
