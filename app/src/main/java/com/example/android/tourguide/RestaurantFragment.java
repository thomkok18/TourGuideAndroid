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

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("", "", "", "", "", R.drawable.bb));

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.restaurantlist);
        listView.setAdapter(adapter);
        return rootView;
    }
}