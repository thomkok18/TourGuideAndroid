package com.example.android.tourguide;

public class Word {
    private String mNaam, mPlaats, mWebsite, mTel, mTijden;
    private int mImageRecourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String naam, String plaats, String website, String tel, String tijden, int imageRecourceId) {
        mNaam = naam;
        mPlaats = plaats;
        mWebsite = website;
        mTel = tel;
        mTijden = tijden;
        mImageRecourceId = imageRecourceId;
    }

    public String getNaam() {
        return mNaam;
    }

    public String getplaats() {
        return mPlaats;
    }

    public String getwebsite() {
        return mWebsite;
    }

    public String getTel() {
        return mTel;
    }

    public String getTijden() {
        return mTijden;
    }

    public int getImageRecourceId() {
        return mImageRecourceId;
    }

    public boolean hasImage() {
        return mImageRecourceId != NO_IMAGE_PROVIDED;
    }
}