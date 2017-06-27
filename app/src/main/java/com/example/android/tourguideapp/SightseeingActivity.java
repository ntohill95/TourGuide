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

public class SightseeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        final ArrayList<EventModel> events = new ArrayList<EventModel>();

        events.add(new EventModel(getString(R.string.city_name), R.drawable.sights_cityhall, getString(R.string.city_description), getString(R.string.city_time),getString(R.string.city_location), getString(R.string.city_price), getString(R.string.city_website)));
        events.add(new EventModel(getString(R.string.titanic_name), R.drawable.sights_titanic, getString(R.string.titanic_description), getString(R.string.titanic_time),getString(R.string.titanic_location), getString(R.string.titanic_price), getString(R.string.titanic_website)));
        events.add(new EventModel(getString(R.string.castle_name), R.drawable.sights_belfastcastle, getString(R.string.castle_description), getString(R.string.castle_time),getString(R.string.castle_location),getString(R.string.castle_price), getString(R.string.castle_website)));
        events.add(new EventModel(getString(R.string.giants_name), R.drawable.sights_casueway, getString(R.string.giants_description), getString(R.string.giants_time),getString(R.string.giants_location), getString(R.string.giants_price), getString(R.string.giants_website)));
        events.add(new EventModel(getString(R.string.bushmills_name), R.drawable.sights_bushmills, getString(R.string.bushmills_description), getString(R.string.bushmills_time),getString(R.string.bushmills_location), getString(R.string.bushmills_price), getString(R.string.bushmills_website)));
        events.add(new EventModel(getString(R.string.market_name), R.drawable.sights_market, getString(R.string.market_description), getString(R.string.market_time),getString(R.string.market_location), getString(R.string.market_price), getString(R.string.market_website)));
        events.add(new EventModel(getString(R.string.gaol_name), R.drawable.sights_gaol, getString(R.string.gaol_description), getString(R.string.gaol_time),getString(R.string.gaol_location), getString(R.string.gaol_price), getString(R.string.gaol_website)));
        events.add(new EventModel(getString(R.string.botanic_name), R.drawable.sights_botanic, getString(R.string.botanic_description), getString(R.string.botanic_time), getString(R.string.botanic_location), getString(R.string.botanic_price), getString(R.string.botanic_website)));
        events.add(new EventModel(getString(R.string.cavehill_name), R.drawable.sights_cavehill, getString(R.string.cavehill_description), getString(R.string.cavehill_time),getString(R.string.cavehill_location), getString(R.string.cavehill_price), getString(R.string.cavehill_website)));
        events.add(new EventModel(getString(R.string.carrick_name), R.drawable.sights_carrick_castle, getString(R.string.carrick_description), getString(R.string.carrick_time), getString(R.string.carrick_location), getString(R.string.carrick_price), getString(R.string.carrick_website)));
        events.add(new EventModel(getString(R.string.stormont_name), R.drawable.sights_stormont, getString(R.string.stormont_description), getString(R.string.stormont_time),getString(R.string.stormont_location), getString(R.string.stormont_price), getString(R.string.stormont_website)));
        events.add(new EventModel(getString(R.string.anne_name), R.drawable.sights_saint_anne, getString(R.string.anne_description), getString(R.string.anne_time), getString(R.string.anne_location), getString(R.string.anne_price), getString(R.string.anne_website)));
        events.add(new EventModel(getString(R.string.queens_name), R.drawable.sights_queens, getString(R.string.queens_description), getString(R.string.queens_time), getString(R.string.queens_location), getString(R.string.queens_price), getString(R.string.queens_website)));


        EventAdapter adapter = new EventAdapter(this, events, R.color.primary);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EventModel event = events.get(position);
                Intent eventIntent = new Intent(SightseeingActivity.this, EventActivity.class);
                eventIntent.putExtra("Event",event);
                startActivity(eventIntent);

            }
        });

    }
}