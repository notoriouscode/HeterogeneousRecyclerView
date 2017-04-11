package com.example.pc1.differentrecycler.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pc1.differentrecycler.Model.HeaderUser;
import com.example.pc1.differentrecycler.Model.HomeUser;
import com.example.pc1.differentrecycler.Model.FirstUser;
import com.example.pc1.differentrecycler.Model.SecondUser;
import com.example.pc1.differentrecycler.R;

import java.util.ArrayList;
import java.util.List;

public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  private List<Object> items;
  private final int HEADER=0,HOME = 1, MYBRAND = 2,MYTEAM=3;
  static ArrayList<Integer> a= new ArrayList<Integer>();

  public ComplexRecyclerViewAdapter(List<Object> items) {
    this.items = items;
  }
  public ComplexRecyclerViewAdapter() {
  }
  @Override
  public int getItemCount() {
    return this.items.size();
  }
  @Override
  public int getItemViewType(int position) {

    if (items.get(position) instanceof HeaderUser) {
      return HEADER;
    }
    else if (items.get(position) instanceof HomeUser) {
      return HOME;
    }
    else if (items.get(position) instanceof FirstUser) {
      return MYBRAND;
    }
    else if (items.get(position) instanceof SecondUser) {
      return MYTEAM;
    }
    else
    return -1;
  }
  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
    //More to come
    RecyclerView.ViewHolder viewHolder = null;
    LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());


    switch (viewType) {
      case HEADER:
        View v1 = inflater.inflate(R.layout.drawer_header, viewGroup, false);
        viewHolder = new Header(v1);
        break;
      case HOME:
        View v2 = inflater.inflate(R.layout.first, viewGroup, false);
        viewHolder = new Home(v2);
        break;
      case MYBRAND:
        View v3 = inflater.inflate(R.layout.second, viewGroup, false);
        viewHolder = new First(v3);
        break;
      case MYTEAM:
        View v4 = inflater.inflate(R.layout.third, viewGroup, false);
        viewHolder = new Second(v4);
        break;
    }
    return viewHolder;
  }
  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
    switch (viewHolder.getItemViewType()) {
      case HEADER:
        Header vh1 = (Header) viewHolder;
        configureViewHolder1(vh1, position);
        break;
      case HOME:
        Home vh2 = (Home) viewHolder;
        configureViewHolder2(vh2, position);
        break;
      case MYBRAND:
        First vh3 = (First) viewHolder;
        configureViewHolder3(vh3, position);
        break;
      case MYTEAM:
        Second vh4 = (Second) viewHolder;
        configureViewHolder4(vh4, position);
        break;
    }
  }
  private void configureViewHolder1(Header vh1, int position) {
    HeaderUser user = (HeaderUser) items.get(position);
    if (user != null) {
    //  vh1.getLabel11().setText("Name: " + user.name);
    //  vh1.getLabel11().setText("Hometown: " + position);
    }
  }
  private void configureViewHolder3(First vh1, int position) {
    FirstUser user = (FirstUser) items.get(position);
    if (user != null) {
      //  vh1.getLabel11().setText("Name: " + user.name);
    }
  }
  private void configureViewHolder2(Home vh2, int position) {
    HomeUser user1 = (HomeUser) items.get(position);
  }
  private void configureViewHolder4(Second vh1, int position) {
    SecondUser user = (SecondUser) items.get(position);
    if (user != null) {
   //   vh1.getLabel11().setText("Name: " + user.name);
    }
  }
}