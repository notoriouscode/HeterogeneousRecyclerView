package com.example.pc1.differentrecycler.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pc1.differentrecycler.Adapter.ComplexRecyclerViewAdapter;
import com.example.pc1.differentrecycler.Model.HeaderUser;
import com.example.pc1.differentrecycler.Model.HomeUser;
import com.example.pc1.differentrecycler.Model.FirstUser;
import com.example.pc1.differentrecycler.Model.SecondUser;
import com.example.pc1.differentrecycler.R;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ComplexRecyclerViewAdapter crv;
        @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        crv = new ComplexRecyclerViewAdapter();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(new ComplexRecyclerViewAdapter(getSampleArrayList()));
    }
    public ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
            items.add(new HeaderUser("Rob Stark", "Winterfell"));
            items.add(new HomeUser("Jon Snow", "Castle Black"));
            items.add(new FirstUser("Jon Snow", "Castle Black"));
           items.add(new SecondUser("Jon Snow", "Castle Black"));
        return items;
    }
}