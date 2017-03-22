package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Activity context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View listItemView = converView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Event currentEvent = getItem(position);
        TextView naamTextView = (TextView) listItemView.findViewById(R.id.naam_text_view);
        naamTextView.setText(currentEvent.getNaam());
        TextView plaatsTextView = (TextView) listItemView.findViewById(R.id.plaats_text_view);
        plaatsTextView.setText(currentEvent.getplaats());
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);
        websiteTextView.setText(currentEvent.getwebsite());
        TextView telTextView = (TextView) listItemView.findViewById(R.id.tel_text_view);
        telTextView.setText(currentEvent.getTel());
        TextView tijdenTextView = (TextView) listItemView.findViewById(R.id.tijden_text_view);
        tijdenTextView.setText(currentEvent.getTijden());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentEvent.hasImage()) {
            imageView.setImageResource(currentEvent.getImageRecourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        return listItemView;
    }
}