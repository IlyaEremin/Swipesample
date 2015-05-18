package com.ilyaeremin.swipesample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Ilya Eremin on 17.05.2015.
 */
public class CustomAdapter extends BaseAdapter {

    public static final int TYPE_TEXT  = 0;
    public static final int TYPE_PHOTO = 1;

    LayoutInflater inflater;
    List<String>   statuses;

    public CustomAdapter(Context context, List<String> objects) {
        inflater = LayoutInflater.from(context);
        this.statuses = objects;
    }

    @Override public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = inflater.inflate(R.layout.row_layout, parent, false);
        }
        ((CanDraw) view).draw(getItem(position));
        return view;
    }

    @Override public boolean isEmpty() {
        return false;
    }

    @Override public int getCount() {
        return statuses.size();
    }

    @Override public String getItem(int position) {
        return statuses.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }
}
