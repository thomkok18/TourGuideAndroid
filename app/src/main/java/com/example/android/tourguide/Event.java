package com.example.android.tourguide;

public class Event {
    private String mNaam;
    private static String mSite;
    private int mImageRecourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Event(String naam, int imageRecourceId, String site) {
        mNaam = naam;
        mImageRecourceId = imageRecourceId;
        mSite = site;
    }

    public String getNaam() {
        return mNaam;
    }

    public static String getSite() {
        return mSite;
    }

    public int getImageRecourceId() {
        return mImageRecourceId;
    }

    public boolean hasImage() {
        return mImageRecourceId != NO_IMAGE_PROVIDED;
    }
}