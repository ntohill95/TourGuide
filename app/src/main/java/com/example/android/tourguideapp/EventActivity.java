package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Niamh on 25/06/2017.
 */

public class EventActivity extends AppCompatActivity {

    private TextView eventName;
    private ImageView eventImage;
    private TextView eventDescription;
    private TextView eventOpeningTimes;
    private TextView eventLocation;
    private TextView eventPrice;
    private TextView eventWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.events_layout);

        EventModel event = (EventModel) getIntent().getSerializableExtra("Event");

        eventName = (TextView)findViewById(R.id.eventName);
        eventImage = (ImageView)findViewById(R.id.eventImage);
        eventDescription = (TextView)findViewById(R.id.description);
        eventOpeningTimes = (TextView)findViewById(R.id.openingTimes);
        eventLocation = (TextView)findViewById(R.id.location);
        eventPrice = (TextView)findViewById(R.id.price);
        eventWebsite = (TextView)findViewById(R.id.website);

        eventName.setText(event.getmName());
        eventImage.setImageResource(event.getmImageName());
        eventDescription.setText(event.getmDescription());
        eventOpeningTimes.setText(event.getmOpeningTimes());
        eventLocation.setText(event.getmLocation());
        eventPrice.setText(event.getmPrice());
        eventWebsite.setText(event.getmWebsite());
    }
}
