package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_restaurants, container, false);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Restaurant De Beren", "Plaats: Citymall Almere, Forum 101, 1315 TG Almere", "Website: beren.nl", "Tel: 036 530 3555", "Openingstijden:\nmaandag: 11:00-22:00\ndinsdag: 11:00-22:00\nwoensdag: 11:00-22:00\ndonderdag: 11:00-22:00\nvrijdag: 11:00-22:00\nzaterdag: 11:00-22:00\nzondag: 11:00-22:00", R.drawable.bb));
        events.add(new Event("Restaurant De Beren", "Plaats: Citymall Almere, Forum 101, 1315 TG Almere", "Website: beren.nl", "Tel: 036 530 3555", "Openingstijden:\nmaandag: 11:00-22:00\ndinsdag: 11:00-22:00\nwoensdag: 11:00-22:00\ndonderdag: 11:00-22:00\nvrijdag: 11:00-22:00\nzaterdag: 11:00-22:00\nzondag: 11:00-22:00", R.drawable.bb));
        events.add(new Event("Restaurant De Beren", "Plaats: Citymall Almere, Forum 101, 1315 TG Almere", "Website: beren.nl", "Tel: 036 530 3555", "Openingstijden:\nmaandag: 11:00-22:00\ndinsdag: 11:00-22:00\nwoensdag: 11:00-22:00\ndonderdag: 11:00-22:00\nvrijdag: 11:00-22:00\nzaterdag: 11:00-22:00\nzondag: 11:00-22:00", R.drawable.bb));


        EventAdapter adapter = new EventAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.restaurantlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Event event = events.get(position);
            }
        });
        return rootView;
    }
}