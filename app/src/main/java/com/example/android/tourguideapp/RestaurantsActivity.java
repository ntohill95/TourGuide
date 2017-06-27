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

        events.add(new EventModel(getString(R.string.deanes_name), R.drawable.restaurants_deanes,getString(R.string.deanes_description),getString(R.string.deanes_time),getString(R.string.deanes_location),getString(R.string.deanes_price),getString(R.string.deanes_website) ));
        events.add(new EventModel(getString(R.string.hadskis_name), R.drawable.restaurants_hadskis,getString(R.string.hadskis_description),getString(R.string.hadskis_time),getString(R.string.hadskis_location), getString(R.string.hadskis_price),getString(R.string.hadskis_website)));
        events.add(new EventModel(getString(R.string.hozen_name), R.drawable.restaurant_zen_new, getString(R.string.hozen_description), getString(R.string.hozen_time),getString(R.string.hozen_location), getString(R.string.hozen_price), getString(R.string.hozen_website)));
        events.add(new EventModel(getString(R.string.coppi_name), R.drawable.restaurant_coppi, getString(R.string.coppi_description), getString(R.string.coppi_time),getString(R.string.coppi_location), getString(R.string.coppi_price), getString(R.string.coppi_website)));
        events.add(new EventModel(getString(R.string.duck_name), R.drawable.restaurants_duckhouse, getString(R.string.duck_description), getString(R.string.duck_time),getString(R.string.duck_location), getString(R.string.duck_price), getString(R.string.duck_website)));
        events.add(new EventModel(getString(R.string.howard_name), R.drawable.restaurant_howard, getString(R.string.howard_description), getString(R.string.howard_time),getString(R.string.howard_location), getString(R.string.howard_price), getString(R.string.howard_website)));
        events.add(new EventModel(getString(R.string.home_name), R.drawable.restaurant_home, getString(R.string.home_description) , getString(R.string.home_time),getString(R.string.home_location), getString(R.string.home_price), getString(R.string.home_website)));
        events.add(new EventModel(getString(R.string.james_name), R.drawable.restaurant_james, getString(R.string.james_description),getString(R.string.james_time), getString(R.string.james_location), getString(R.string.james_price), getString(R.string.james_website)));
        events.add(new EventModel(getString(R.string.zen_name),R.drawable.restaurant_zen_new, getString(R.string.zen_description), getString(R.string.zen_time),getString(R.string.zen_location), getString(R.string.zen_price), getString(R.string.zen_website)));
        events.add(new EventModel(getString(R.string.dog_name), R.drawable.restaurants_dog, getString(R.string.dog_description), getString(R.string.dog_time),getString(R.string.dog_location), getString(R.string.dog_price), getString(R.string.dog_website)));
        events.add(new EventModel(getString(R.string.welcome_name), R.drawable.restaurants_welcome, getString(R.string.welcome_description), getString(R.string.welcome_time),getString(R.string.welcome_location), getString(R.string.welcome_price), getString(R.string.welcome_website)));
        events.add(new EventModel(getString(R.string.villa_name), R.drawable.restaurants_villa, getString(R.string.villa_description), getString(R.string.villa_time),getString(R.string.villa_location), getString(R.string.villa_price), getString(R.string.villa_website)));
        events.add(new EventModel(getString(R.string.onion_name), R.drawable.restaurants_onion, getString(R.string.onion_description), getString(R.string.onion_time),getString(R.string.onion_location), getString(R.string.onion_price), getString(R.string.onion_website)));
        events.add(new EventModel(getString(R.string.made_name), R.drawable.restaurants_made, getString(R.string.made_description), getString(R.string.made_time),getString(R.string.made_location), getString(R.string.made_price), getString(R.string.made_website)));

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