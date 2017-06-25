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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        final ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        phrases.add(new Phrase("Thank You", "go raibh maith agat"));
        phrases.add(new Phrase("Hello", "Dia Dhuit"));
        phrases.add(new Phrase("How are you?", "Cad é mar atá tú"));
        phrases.add(new Phrase("I am good", "Tá mé go maith"));
        phrases.add(new Phrase("What's your name?", "Cén t-ainm atá ort?"));
        phrases.add(new Phrase("My name is...", "Is mise ..."));
        phrases.add(new Phrase("Goodbye", "Slán"));
        phrases.add(new Phrase("Cheers!", "Sláinte!"));
        phrases.add(new Phrase("Safe Home", "Slán abhaile"));


        PhraseWordAdaptor adaptor = new PhraseWordAdaptor(this, phrases, R.color.primary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phrase phrase = phrases.get(position);

            }
        });
    }
}