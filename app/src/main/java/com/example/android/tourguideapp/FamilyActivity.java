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

        events.add(new EventModel("Bowling", R.drawable.family_bowling, "At Odyssey Bowl we provide the facilities to suit everyone, we have our automatic lane bumpers, Kiddy Dino Ramps, and larger ball ramps ", "12-10pm",
                " 2 Queens Quay, Belfast BT3 9QQ", "£4", "www.odysseybowl.co.uk/"));
        events.add(new EventModel("Cinema", R.drawable.family_cinema, "Visit the Odyssey website today to discover more about all of the latest cinema releases, movie times and special offers available at your cinema in Belfast.", "12-10pm",
                "2 Queens Quay, Belfast BT3 9QQ", "£6", "www.odysseycinemas.co.uk/"));
        events.add(new EventModel("Mini Golf", R.drawable.family_golf, "This Florida-Style Mini Golf complex, which is open year round seven days a week", "10-10pm",
                "111A Old Dundonald Rd, Dundonald, Belfast BT16 1XT", "£7", "www.piratesadventuregolf.com/"));
        events.add(new EventModel("Ice Skating", R.drawable.family_ice, "Get your skates on and take to the ice for a totally cool day out! ", "10-11:30pm",
                "111 Old Dundonald Rd, Belfast BT16 1XT", "£6", "www.theicebowl.com/"));
        events.add(new EventModel("Adventure PlayGround", R.drawable.family_adventure, "Located in the picturesque grounds of the Belfast Castle estate.", "11-3:30pm",
                "Antrim Road. You can find signposts to the park fr, Belfast", "Free", "ww.belfastcity.gov.uk/parksandopenspaces"));
        events.add(new EventModel("Clip n Climb", R.drawable.family_clip, "Challenge yourself, challenge your friends at Ireland's first Clip 'n Climb. ", "2:30-10pm",
                "111 Old Dundonald Rd, Belfast BT16 1XT", "£7", "www.clipnclimbdundonald.co.uk/"));
        events.add(new EventModel("Picnic", R.drawable.family_castle, "The Belfast Castle is the perfect setting for a sunny picnic!", "All Day",
                "Antrim Rd, Belfast BT15 5GR", "Free", "www.belfastcity.gov.uk/tourism-venues/belfastcastle/bcabout.aspx"));
        events.add(new EventModel("We are Vertigo", R.drawable.family_weare, "We are Vertigo is Northern Ireland's leading entertainment complex for all ages. Trampoline, Adventure, Ski & Spa.", "10-9pm",
                "1, Newtownbreda Industrial Estate, Cedarhurst Rd, Belfast BT8 4RH", "£6", "www.wearevertigo.com/"));
        events.add(new EventModel("Zoo", R.drawable.family_newzoo, "Welcome to Belfast Zoo, home to 116 species, surrounded by stunning panoramic views across Belfast Lough.", "10-7pm",
                "Antrim Rd, Belfast BT36 7PN", "£13", "www.belfastzoo.co.uk/"));
        events.add(new EventModel("Ulster Museum", R.drawable.family_museum, "Come face to face with dinosaurs, meet an Egyptian Mummy and see modern masterpieces with a visit to the Ulster Museum.", "10-5pm",
                "Botanic Gardens, Belfast BT9 5AB", "Free", "www.nmni.com/um"));
        events.add(new EventModel("Beach", R.drawable.family_beach, "The Strand Portstewart is a Sandy beach located near Portstewart in County Derry.", "All-day",
                "118 Strand Rd, Portstewart BT55 7PG", "Free-£2", "https://www.nationaltrust.org.uk/portstewart-strand"));
        events.add(new EventModel("W5", R.drawable.family_w5, "W5 is an award winning Interactive Discovery Centre in Belfast, Northern Ireland. Located at the Odyssey Arena, its a perfect day out for the whole family.", "10-5pm",
                "he Odyssey, 2 Queens Quay, Belfast BT3 9QQ", "£££", "www.w5online.co.uk/\u200E"));
        events.add(new EventModel("Grand Opera House", R.drawable.family_grand, "The Grand opera house is the premier Belfast theatre with something to suit all the all the family. ", "9-11pm",
                "2-4 Great Victoria St, Belfast BT2 7HR", "££", "https://www.goh.co.uk/"));

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