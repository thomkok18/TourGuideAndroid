package com.example.android.tourguide;

public class Event {
    private String mNaam;
    private int mImageRecourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Event(String naam, int imageRecourceId) {
        mNaam = naam;
        mImageRecourceId = imageRecourceId;
    }

    public String getNaam() {
        return mNaam;
    }

    public int getImageRecourceId() {
        return mImageRecourceId;
    }

    public boolean hasImage() {
        return mImageRecourceId != NO_IMAGE_PROVIDED;
    }
}