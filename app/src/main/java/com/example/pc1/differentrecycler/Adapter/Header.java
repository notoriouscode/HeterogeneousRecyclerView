package com.example.pc1.differentrecycler.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc1.differentrecycler.R;

public class Header extends RecyclerView.ViewHolder {

    private TextView label11, label12,label13;
    ImageView iv,iv2,iv3;

    public Header(View v) {
        super(v);
        label11 = (TextView) v.findViewById(R.id.tx3);

    }
    public TextView getLabel11() {
        return label11;
    }
    public ImageView getImageView() {
        return iv;}

    public ImageView getImageView1() {
        return iv2;}
    public ImageView getImageView2() {
        return iv3;}
    public void setLabel1(TextView label1) {
        this.label11 = label1;
    }
    public TextView getLabel12() {
        return label12;
    }
    public void setLabel2(TextView label2) {
        this.label12 = label2;
    }
}