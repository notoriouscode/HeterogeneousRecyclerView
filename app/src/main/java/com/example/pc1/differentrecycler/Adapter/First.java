package com.example.pc1.differentrecycler.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.pc1.differentrecycler.R;

public class First extends RecyclerView.ViewHolder {

    private TextView label1, label2;

    public First(View v) {
        super(v);
        label1 = (TextView) v.findViewById(R.id.text1);
        label2 = (TextView) v.findViewById(R.id.text2);
    }

    public TextView getLabel1() {
        return label1;
    }
    public void setLabel1(TextView label1) {
        this.label1 = label1;
    }
    public TextView getLabel2() {
        return label2;
    }
    public void setLabel2(TextView label2) {
        this.label2 = label2;
    }
}