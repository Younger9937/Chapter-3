package com.example.chapter3.homework;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
    private static final int NUM_LIST_ITEMS = 7;

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "SetTextI18n"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();
        view = View.inflate(viewGroup.getContext(), R.layout.number_list_item, null);
        viewHolder.textView =  view.findViewById(R.id.textView);
        view.setTag(viewHolder);

        viewHolder.textView.setText("Item"+ (i+1));
        return view;
    }

    @Override
    public int getCount() {
        return NUM_LIST_ITEMS;
    }

    private static class ViewHolder{
        private TextView textView;
    }
}
