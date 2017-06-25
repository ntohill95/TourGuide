package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Niamh on 24/06/2017.
 */

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        final ArrayList<EventModel> events = new ArrayList<EventModel>();

        events.add(new EventModel("Bowling", 0, "Deanes is a restaurant", "9-5", "Queens", "£££", "www.deanesatqueens.co.uk"));
        events.add(new EventModel("Cinema", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Mini Golf", 0, "House of Zen is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Ice Skating", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Adventure PlayGround", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Clip n Climb", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Picnic", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("We are Vertigo", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Zoo", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Ulster Museum", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Beach", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("W5", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Grand Opera House", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));

        EventAdapter adapter = new EventAdapter(this, events, R.color.primary);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EventModel event = events.get(position);
                Intent eventIntent = new Intent(FamilyActivity.this, EventActivity.class);
                eventIntent.putExtra("Event",event);
                startActivity(eventIntent);
            }
        });

    }
}