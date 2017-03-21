package com.example.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorRecourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorRecourceId) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View listItemView = converView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView naamTextView = (TextView) listItemView.findViewById(R.id.naam_text_view);
        naamTextView.setText(currentWord.getNaam());
        TextView plaatsTextView = (TextView) listItemView.findViewById(R.id.plaats_text_view);
        plaatsTextView.setText(currentWord.getplaats());
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_text_view);
        websiteTextView.setText(currentWord.getwebsite());
        TextView telTextView = (TextView) listItemView.findViewById(R.id.tel_text_view);
        telTextView.setText(currentWord.getTel());
        TextView tijdenTextView = (TextView) listItemView.findViewById(R.id.tijden_text_view);
        tijdenTextView.setText(currentWord.getTijden());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageRecourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorRecourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}