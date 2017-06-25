package com.example.android.tourguideapp;

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

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        final ArrayList<EventModel> events = new ArrayList<EventModel>();

        events.add(new EventModel("Deanes at Queens", 0, "Deanes is a restaurant", "9-5", "Queens", "£££", "www.deanesatqueens.co.uk"));
        events.add(new EventModel("Hadskis", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("House of Zen", 0, "House of Zen is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Coppi", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Duck House", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Howard Street", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Home", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("James Street South", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Zen", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("The Barking Dog", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("The Welcome", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Villa Italia", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("The Dirty Onion", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Made in Belfast", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));

        EventAdapter adapter = new EventAdapter(this, events, R.color.primary);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EventModel event = events.get(position);
                Intent eventIntent = new Intent(RestaurantsActivity.this, EventActivity.class);
                eventIntent.putExtra("Event",event);
                startActivity(eventIntent);
            }
        });

    }
}