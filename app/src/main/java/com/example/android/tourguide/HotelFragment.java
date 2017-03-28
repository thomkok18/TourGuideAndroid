package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Restaurant De Beren", R.drawable.bb, "Restaurant+De+Beren+Almere/@52.3905237,4.8999948,10z/data=!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x47c616e6b67cc933:0xfc6b559633846b69!8m2!3d52.3684528!4d5.2198084?hl=nl&authuser=0"));
        events.add(new Event("Restaurant Rhodos", R.drawable.rhodos, "Restaurant+Rhodos/@52.3905237,4.8999948,10z/data=!3m1!5s0x47c616e1b882cec7:0x55f0c588f2bf3d7c!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x4165399bf037fe9b:0x827eeae60081d178!8m2!3d52.3742921!4d5.2195145?hl=nl&authuser=0"));
        events.add(new Event("Woodstone Pizza and Wine", R.drawable.woodstone, "WOODSTONE+Pizza+and+Wine+Almere/@52.3905237,4.8999948,10z/data=!3m1!5s0x47c616e0d7eae875:0x571df4604231cebc!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x47c616e0e14042b7:0x6daaf55c74dccd4e!8m2!3d52.3700553!4d5.2181784?hl=nl&authuser=0"));
        events.add(new Event("Proeflokaal Bregje", R.drawable.bregje, "Proeflokaal+Bregje+Almere/@52.3905237,4.8999948,10z/data=!3m1!5s0x47c616e0d7eae875:0x571df4604231cebc!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x47c616e0dcfdc333:0x4d0245bc9efec6b0!8m2!3d52.3699517!4d5.2175972?hl=nl&authuser=0"));
        events.add(new Event("Wereldrestaurant Atlantis", R.drawable.atlantis_almere, "Wereldrestaurant+Atlantis+Almere/@52.3905237,4.8999948,10z/data=!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x47c616edaef81e99:0xceca4e84d2501ed6!8m2!3d52.35595!4d5.222871?hl=nl&authuser=0"));
        events.add(new Event("Goudenhuis Almere", R.drawable.goudenhuis, "Goudenhuis+Almere/@52.3905237,4.8999948,10z/data=!4m8!1m2!2m1!1srestaurants+almere!3m4!1s0x47c6164517886387:0xce67159f7faa33c0!8m2!3d52.3599026!4d5.2548936?hl=nl&authuser=0"));

        EventAdapter adapter = new EventAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.hotelList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.nl/maps/place/" + events.get(position).getSite())));
            }
        });
        return rootView;
    }
}