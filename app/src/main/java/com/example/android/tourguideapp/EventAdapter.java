package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Niamh on 24/06/2017.
 */

public class EventAdapter extends ArrayAdapter<EventModel> {

    private int mColorState;

    public EventAdapter(Activity context, ArrayList<EventModel> events, int ColorState) {
        super(context, 0, events);
        mColorState = ColorState;
    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        EventModel currentEvent = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentEvent.getmName());

        int color = ContextCompat.getColor(getContext(), mColorState);
        nameTextView.setBackgroundColor(color);

        return listItemView;
    }
}

