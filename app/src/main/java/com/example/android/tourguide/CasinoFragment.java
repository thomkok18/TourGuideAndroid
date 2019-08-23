package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CasinoFragment extends Fragment {

    public CasinoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_casinos, container, false);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Play World Casino Almere Buiten", R.drawable.play_world_casino_buiten, "Play+World/@52.363797,5.2460537,13z/data=!4m8!1m2!2m1!1scasinos+almere!3m4!1s0x47c617ea5c6f1c61:0x7152406a035e3ea!8m2!3d52.3939552!4d5.2759886?hl=nl&authuser=0"));
        events.add(new Event("Fair Play Casino Almere Centrum", R.drawable.fair_play_casino_centrum, "Fair+Play+Casino/@52.369704,5.1810998,13z/data=!4m8!1m2!2m1!1scasinos+almere!3m4!1s0x47c616e0b97691f7:0x758f48cc362ef2b1!8m2!3d52.369704!4d5.2161187?hl=nl&authuser=0"));
        events.add(new Event("Play World Casino Almere Centrum", R.drawable.play_world_casino_centrum, "Play+World+Casino/@52.3685408,5.2018889,14z/data=!4m8!1m2!2m1!1scasinos+almere!3m4!1s0x47c616e0580a83af:0x49412bbe405cfc5c!8m2!3d52.3715544!4d5.2175941?hl=nl&authuser=0"));
        events.add(new Event("Merkur Casino Almere", R.drawable.merkur_casino, "Merkur+Casino+Almere/@52.3673074,5.213172,16.5z/data=!4m8!1m2!2m1!1scasinos+almere!3m4!1s0x47c616e128ab5c5f:0xf9169deaccecf9c!8m2!3d52.367583!4d5.216322?hl=nl&authuser=0"));
        events.add(new Event("Fair Play Casino Almere Haven", R.drawable.fair_play_casino_haven, "Fair+Play+Casino/@52.3637086,5.140558,11z/data=!4m8!1m2!2m1!1scasinos+almere!3m4!1s0x47c6169d067c6d61:0xe1cf119e138f4100!8m2!3d52.3336387!4d5.2184471?hl=nl&authuser=0"));

        EventAdapter adapter = new EventAdapter(getActivity(), events);
        ListView listView = (ListView) rootView.findViewById(R.id.casinoList);
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