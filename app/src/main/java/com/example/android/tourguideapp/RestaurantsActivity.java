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

        events.add(new EventModel("Deanes at Queens", R.drawable.restaurants_deanes, "Deanes at Queens holds a Michelin Bib Gourmand.", "1-6pm", "1 College Gardens, " +
                "Belfast BT9 6BQ, " +
                "Northern Ireland", "££", "www.michaeldeane.co.uk/deanes-at-queens/"));
        events.add(new EventModel("Hadskis", R.drawable.restaurants_hadskis, "Hadskis has been borne out of one man’s love for cooking great food.",
                "11-9:30pm", "33 Donegall Street, " + "Commercial Court, " + "Belfast BT1 2NB", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("House of Zen", R.drawable.restaurants_house_of_zen, "Fine Asian Cuisine Cocooned in theHeart of the Cathedral Quarter.", "1:30-10:30pm",
                "3 St Annes Square, Cathedral Quarter, Belfast BT1 2LR", "££", "www.houseofzenbelfast.co.uk/"));
        events.add(new EventModel("Coppi", R.drawable.restaurant_coppi, "Contemporary Italian Cooking Showcasing the Best Local Produce in Belfast.", "12-10pm",
                "Saint Anne's Square, " +"Cathedral Quarter," + "BT1 2LR", "££", "www.coppi.co.uk/"));
        events.add(new EventModel("Duck House", R.drawable.restaurants_duckhouse, "Duck house is part of the Zen House restaurant group.", "1:30-11pm",
                "51-53 Adelaide St, Belfast BT2 8FEr", "££", "www.zenduckhouse.co.uk/"));
        events.add(new EventModel("Howard Street", R.drawable.restaurant_howard, "One of the leading restaurants Belfast city centre offers. Delicious menus for all tastes.", "12-9:30pm",
                "56 Howard St, Belfast BT1 6PG", "££", "www.howardstbelfast.com"));
        events.add(new EventModel("Home", R.drawable.restaurant_home, "Home started life as a pop-up restaurant in an off-the-beaten track location in Belfast City ", "1-9pm",
                "22 Wellington Pl, Belfast BT1 6GE", "££", "www.homebelfast.co.uk"));
        events.add(new EventModel("James Street South", R.drawable.restaurant_james, "James St. South offers a modern dining experience with great food and an exciting wine list in Belfast city centre.",
                "12-10:45pm", "21 James St S, Belfast BT2 7GA", "£££", "www.jamesstreetsouth.co.uk"));
        events.add(new EventModel("Zen",R.drawable.restaurant_zen_new, "Zen is one of Belfast's much loved Asian cuisine restaurants.", "1:30-10:30pm",
                "55-59 Adelaide St, Belfast BT2 8FE", "££", "http://www.zenbelfast.co.uk/"));
        events.add(new EventModel("The Barking Dog", R.drawable.restaurants_dog, "The Barking Dog prides itself on its unique offering, combining first-class cuisine with a relaxed atmosphere.", "12-9pm",
                "33-35 Malone Rd, Belfast BT9 6RU", "£", "www.barkingdogbelfast.com"));
        events.add(new EventModel("The Welcome", R.drawable.restaurants_welcome, "The Wong family opened their first Welcome Restaurant in Northern Ireland in 1973.", "3-10pm",
                "22 Stranmillis Rd, Belfast BT9 5AA", "££", "www.welcomebelfast.co.uk"));
        events.add(new EventModel("Villa Italia", R.drawable.restaurants_villa, "Villa Italia is a family run pizzeria restaurant established in 1988 in the heart of South Belfast, just a stones throw from Queen's University. ", "12:30-9:30pm",
                "39-41 University Rd, Belfast BT7 1ND", "£", "www.villaitaliarestaurant.co.uk"));
        events.add(new EventModel("The Dirty Onion", R.drawable.restaurants_onion, "The Dirty Onion is a traditional public house with a modern twist.", "12-12am",
                "3 Hill St, Belfast BT1 2LA", "£", "www.thedirtyonion.com"));
        events.add(new EventModel("Made in Belfast", R.drawable.restaurants_made, "With restaurants located in major areas in the city centre area of Belfast and something for everyone on the menu, you're in for a treat.", "12-9pm",
                "Talbot St, Belfast BT1 2QH", "££", "www.madeinbelfastni.com/"));

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