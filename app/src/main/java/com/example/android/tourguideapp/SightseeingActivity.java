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

        events.add(new EventModel("City Hall", R.drawable.sights_cityhall, "Belfast City Hall is the civic building of Belfast City Council.", "8:30-5pm",
                "Donegall Square, Belfast BT1 5GS", "Free", "www.belfastcity.gov.uk/tourism-venues/cityhall/cityhall-about.aspx"));
        events.add(new EventModel("Titanic Centre", R.drawable.sights_titanic, "Titanic Belfast is the world's largest Titanic visitor experience, exploring the Titanic story in a fresh and insightful way. ", "9-7pm",
                "1 Olympic Way, Queens Road, Titanic Quarter, Belfast BT3 9EP", "Free-£18", "www.titanicbelfast.com"));
        events.add(new EventModel("Belfast Castle", R.drawable.sights_belfastcastle, "Historic Belfast Castle has great views over Belfast Lough. Have lunch or dinner at the Cellar Restaurant or visit the Cave Hill Visitor Centre", "9-4:30pm",
                "Antrim Rd, Belfast BT15 5GR", "Free", "www.belfastcity.gov.uk/tourism-venues/belfastcastle"));
        events.add(new EventModel("Giants Causeway", R.drawable.sights_casueway, "Discover the amazing stones at the Giant's Causeway in Northern Ireland with the National Trust.", "9-5pm",
                "44 Causeway Rd, Bushmills BT57 8SU", "Free to walk", "https://www.nationaltrust.org.uk/giants-causeway"));
        events.add(new EventModel("Bushmills", R.drawable.sights_bushmills, "In the small village of Bushmills, settled on the banks of the river you'll find the oldest working distillery in Ireland.", "12-4:45pm",
                "2 Distillery Rd, Bushmills BT57 8XH", "Free", "www.bushmills.com/distillery"));
        events.add(new EventModel("St George's Market", R.drawable.sights_market, "St George’s Market is one of Belfast’s oldest attractions.", "9-3pm",
                "12-20 East Bridge Street, Belfast BT1 3NQ", "Free", "www.belfastcity.gov.uk/tourism-venues/stgeorgesmarket"));
        events.add(new EventModel("Crumlin Road Gaol", R.drawable.sights_gaol, "Explore within the walls of Crumlin Road Gaol that have seen 17 men executed over its 150 year history.", "9-5",
                "53-55 Crumlin Rd, Belfast BT14 6ST", "£5.50-7.50", "www.crumlinroadgaol.com/"));
        events.add(new EventModel("Botanic Gardens", R.drawable.sights_botanic, "Botanic Gardens is home to the Palm House and the Tropical Ravine.", "9-5pm",
                "College Park E, Belfast BT7 1LP", "Free", "www.belfastcity.gov.uk/leisure/parks-openspaces/Park-6614.aspx"));
        events.add(new EventModel("Cavehill", R.drawable.sights_cavehill, "You will discover much of what the park has to offer from archaeological sites and wildlife to panoramic views.", "24/7",
                "Antrim Rd, Belfast BT15 5GR", "Free", "www.walkni.com/walks/79/cave-hill-country-park/"));
        events.add(new EventModel("Carrickfergus Castle", R.drawable.sights_carrick_castle, "Carrickfergus Castle is a Norman castle in Northern Ireland, situated in the town of Carrickfergus in County Antrim, on the northern shore of Belfast Lough.", "10-5",
                "Marine Hwy, Carrickfergus BT38 7BG", "£3", "https://discovernorthernireland.com/Carrickfergus-Castle-Carrickfergus-P2814"));
        events.add(new EventModel("Stormont Estate", R.drawable.sights_stormont, "Stormont is the site of Northern Ireland's main government buildings, which are surrounded by woods and parkland.", "9-9pm",
                "Belfast BT4 3SH", "Free", "https://www.nidirect.gov.uk/articles/stormont-estate"));
        events.add(new EventModel("St Anne's Cathedral", R.drawable.sights_saint_anne, "It is unusual in serving two separate dioceses, yet being the seat of neither.", "9-5",
                "Donegall St, Belfast BT1 2HB", "Free - £5", "www.belfastcathedral.org/"));
        events.add(new EventModel("Queen's University", R.drawable.sights_queens, "A prestigious Russell Group UK university, Queen's University is respected across the globe as a centre of teaching excellence and innovative research.", "9-5",
                "University Rd, Belfast BT7 1NN", "Free", "https://www.qub.ac.uk"));


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