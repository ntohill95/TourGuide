package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Niamh on 25/06/2017.
 */

public class PhraseWordAdaptor extends ArrayAdapter<Phrase> {

    private int mColorState;

    public PhraseWordAdaptor(Activity context, ArrayList<Phrase> phrase, int ColorState) {
        super(context, 0, phrase);
        mColorState = ColorState;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.phrase_list_item, parent, false);
        }

        Phrase currentPhrase = getItem(position);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        englishTextView.setText(currentPhrase.getEnglishTranslation());

        TextView irishTextView = (TextView) listItemView.findViewById(R.id.irish);
        irishTextView.setText(currentPhrase.getIrishTranslation());

        int color = ContextCompat.getColor(getContext(), mColorState);
        englishTextView.setBackgroundColor(color);
        irishTextView.setBackgroundColor(color);
        return listItemView;
    }
}
