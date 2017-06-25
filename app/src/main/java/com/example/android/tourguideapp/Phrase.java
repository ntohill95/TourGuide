package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Niamh on 24/06/2017.
 */

public class Phrase {

    private String mName;
    private String mEnglishTranslation;
    private String mIrishTranslation;

    public Phrase(String name) {
        mName = name;

    }
    public Phrase(String englishTranslation, String irishTranslation){
        mEnglishTranslation = englishTranslation;
        mIrishTranslation=irishTranslation;

    }

    public String getName() {
        return mName;
    }

    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public String getIrishTranslation(){
        return mIrishTranslation;
    }
}
