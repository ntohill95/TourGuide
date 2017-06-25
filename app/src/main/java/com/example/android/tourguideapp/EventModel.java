package com.example.android.tourguideapp;

import java.io.Serializable;

/**
 * Created by Niamh on 25/06/2017.
 */

public class EventModel implements Serializable {
    private String mName;
    private int mImageName;
    private String mDescription;
    private String mOpeningTimes;
    private String mLocation;
    private String mPrice;
    private String mWebsite;

    public EventModel(String name, int imageName, String description, String openingTimes, String location, String price, String website){
        this.mName=name;
        this.mImageName=imageName;
        this.mDescription=description;
        this.mOpeningTimes=openingTimes;
        this.mLocation=location;
        this.mPrice=price;
        this.mWebsite=website;
    }

    public String getmName() {
        return mName;
    }

    public int getmImageName() {
        return mImageName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmOpeningTimes() {
        return mOpeningTimes;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmPrice() {
        return mPrice;
    }

    public String getmWebsite() {
        return mWebsite;
    }
}
