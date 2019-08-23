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

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_hotels, container, false);

        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event("Bastion Hotel Almere", R.drawable.bastion_hotel, "Bastion+Hotel+Almere/@52.350645,5.0347533,11z/data=!4m8!1m2!2m1!1shotels+almere!3m4!1s0x47c6114921bdcb01:0x3e896871a6940a6c!8m2!3d52.350645!4d5.174829?hl=nl&authuser=0"));
        events.add(new Event("Van der Valk Hotel Almere", R.drawable.van_der_valk_hotel, "Van+der+Valk+Hotel+Almere/@52.3632141,5.1405555,11z/data=!4m8!1m2!2m1!1shotels+almere!3m4!1s0x47c6165b2696fbd9:0xa8aa05590eae502b!8m2!3d52.3592775!4d5.2523612?hl=nl&authuser=0"));
        events.add(new Event("Finn Hotel Almere", R.drawable.finn_hotel, "Hotel,+Restaurant+%26+Zalen+FINN+Almere/@52.3630493,5.1405547,11z/data=!4m8!1m2!2m1!1shotels+almere!3m4!1s0x47c616e066beeca3:0xf36f405344e9f700!8m2!3d52.3721002!4d5.2165085?hl=nl&authuser=0"));
        events.add(new Event("Apollo Hotel Almere City Centre", R.drawable.apollo_hotel, "Apollo+Hotel+Almere+City+Centre/@52.3628845,5.1405539,11z/data=!4m8!1m2!2m1!1shotels+almere!3m4!1s0x47c616e6dfe72ea1:0x83524058b55ab810!8m2!3d52.3674999!4d5.217496?hl=nl&authuser=0"));
        events.add(new Event("CSMART Hotel Almere", R.drawable.csmart_hotel, "CSMART+Hotel+Almere/@52.3363407,5.125497,14z/data=!4m8!1m2!2m1!1shotels+almere!3m4!1s0x47c61163aaaaaa93:0x4a48cbb4f6f049d2!8m2!3d52.3385433!4d5.1385509?hl=nl&authuser=0"));

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