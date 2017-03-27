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
        events.add(new Event("Restaurant De Beren", R.drawable.bb, "Restaurant+de+beren+almere"));
        events.add(new Event("Restaurant Rhodos", R.drawable.rhodos, "Restaurant+rhodos+almere"));
        events.add(new Event("Woodstone Pizza and Wine", R.drawable.woodstone, "Restaurant+woodstone+almere"));

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