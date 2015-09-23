package com.example.phantan.hotronmatttt;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.HashMap;
import java.util.List;

/**
 * Created by phantan on 23/09/2015.
 */
public class ExampleArrayAdapter extends ArrayAdapter<String> {
     HashMap<String,Integer>mIdMap = new HashMap<String,Integer>();
    public ExampleArrayAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        for(int i=0; i<objects.size();i++){
            mIdMap.put(objects.get(i),i);
        }
    }

    @Override
    public long getItemId(int position) {
        String item = getItem(position);
        return mIdMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }
}
