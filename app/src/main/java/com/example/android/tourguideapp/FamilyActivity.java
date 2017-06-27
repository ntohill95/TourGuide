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

        events.add(new EventModel(getString(R.string.bowling_name), R.drawable.family_bowling, getString(R.string.bowling_description), getString(R.string.bowling_time),getString(R.string.bowling_location), getString(R.string.bowling_price), getString(R.string.bowling_website)));
        events.add(new EventModel(getString(R.string.cinema_name), R.drawable.family_cinema, getString(R.string.cinema_description), getString(R.string.cinema_time),getString(R.string.cinema_location), getString(R.string.cinema_price), getString(R.string.cinema_website)));
        events.add(new EventModel(getString(R.string.golf_name), R.drawable.family_golf, getString(R.string.golf_description), getString(R.string.golf_time),getString(R.string.golf_location), getString(R.string.golf_price), getString(R.string.golf_website)));
        events.add(new EventModel(getString(R.string.ice_name), R.drawable.family_ice, getString(R.string.ice_description) , getString(R.string.ice_time), getString(R.string.ice_location), getString(R.string.ice_price), getString(R.string.ice_website)));
        events.add(new EventModel(getString(R.string.adventure_name), R.drawable.family_adventure, getString(R.string.adventure_description), getString(R.string.adventure_time),getString(R.string.adventure_location), getString(R.string.adventure_price), getString(R.string.adventure_website)));
        events.add(new EventModel(getString(R.string.clip_name), R.drawable.family_clip, getString(R.string.clip_description) , getString(R.string.clip_time), getString(R.string.clip_location), getString(R.string.clip_price), getString(R.string.clip_website)));
        events.add(new EventModel(getString(R.string.picnic_name), R.drawable.family_castle, getString(R.string.picnic_description), getString(R.string.picnic_time),getString(R.string.picnic_location), getString(R.string.picnic_price), getString(R.string.picnic_website)));
        events.add(new EventModel(getString(R.string.vertigo_name), R.drawable.family_weare, getString(R.string.vertigo_description), getString(R.string.vertigo_time),getString(R.string.vertigo_location), getString(R.string.vertigo_price), getString(R.string.vertigo_website)));
        events.add(new EventModel(getString(R.string.zoo_name), R.drawable.family_newzoo, getString(R.string.zoo_description), getString(R.string.zoo_time),getString(R.string.zoo_location), getString(R.string.zoo_price), getString(R.string.zoo_website)));
        events.add(new EventModel(getString(R.string.museum_name), R.drawable.family_museum, getString(R.string.museum_description), getString(R.string.museum_time),getString(R.string.museum_location), getString(R.string.museum_price), getString(R.string.museum_website)));
        events.add(new EventModel(getString(R.string.beach_name), R.drawable.family_beach, getString(R.string.beach_description), getString(R.string.beach_time), getString(R.string.beach_location), getString(R.string.beach_price), getString(R.string.beach_website)));
        events.add(new EventModel(getString(R.string.w5_name), R.drawable.family_w5, getString(R.string.w5_description), getString(R.string.w5_time),getString(R.string.w5_location), getString(R.string.w5_price), getString(R.string.w5_website)));
        events.add(new EventModel(getString(R.string.opera_name), R.drawable.family_grand, getString(R.string.opera_description) , getString(R.string.opera_time),getString(R.string.opera_location), getString(R.string.opera_price), getString(R.string.opera_website)));

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