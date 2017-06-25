package com.example.android.tourguideapp;

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

        events.add(new EventModel("City Hall", 0, "Deanes is a restaurant", "9-5", "Queens", "£££", "www.deanesatqueens.co.uk"));
        events.add(new EventModel("Titanic Centre", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Belfast Castle", 0, "House of Zen is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Giants Causeway", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Bushmills", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("St George's Market", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Gaol", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Botanic Gardens", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Cavehill", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Carrickfergus Castle", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Stormont Estate", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("St Anne's Cathedral", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));
        events.add(new EventModel("Queen's University", 0, "Hadksis is a restaurant", "9-5", "Cathedral Quarter", "£££", "www.hadskis.co.uk"));


        EventAdapter adapter = new EventAdapter(this, events, R.color.primary);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                EventModel event = events.get(position);

            }
        });

    }
}