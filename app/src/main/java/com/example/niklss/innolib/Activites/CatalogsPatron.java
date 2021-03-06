package com.example.niklss.innolib.Activites;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.niklss.innolib.R;

import java.util.ArrayList;

/**
 * Created by user on 04.02.2018.
 */

public class CatalogsPatron extends Activity   {

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogpatron);

        ExpandableListView listView = (ExpandableListView)findViewById(R.id.elv);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();  //now we will fill names by our own, but then we will use database methods
        ArrayList<String> children1 = new ArrayList<String>();
        ArrayList<String> children2 = new ArrayList<String>();
        ArrayList<String> children3 = new ArrayList<String>();
        children1.add("Book_1");
        children1.add("Book_2");
        groups.add(children1);
        children2.add("Article_1");
        children2.add("Article_2");
        children2.add("Article_3");
        groups.add(children2);
        children3.add("AVM_1");
        groups.add(children3);

        listView.setOnItemClickListener(click);

        ExpListAdapter adapter = new ExpListAdapter(getApplicationContext(), groups);
        listView.setAdapter(adapter);
    }
        ExpandableListView.OnItemClickListener click = (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CatalogsPatron.this,"Perfect",Toast.LENGTH_SHORT).show();
            }
        });
}
