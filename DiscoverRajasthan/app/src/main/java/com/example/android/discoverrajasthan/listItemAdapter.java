package com.example.android.discoverrajasthan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listItemAdapter extends ArrayAdapter<listItem> {

    public listItemAdapter(Context context, ArrayList<listItem> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        listItem currentListItem = getItem(position);

        TextView nameOfAttraction = (TextView) listItemView.findViewById(R.id.name_of_attraction);
        nameOfAttraction.setText(currentListItem.getNameOfAttraction());

        TextView descriptionOfAttraction = (TextView) listItemView.findViewById(R.id.description_of_attraction);
        descriptionOfAttraction.setText(currentListItem.getDescriptionOfAttraction());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentListItem.getImageResourceId());

        TextView bodyParagraph = (TextView) listItemView.findViewById(R.id.bodyParagraph);

        if (currentListItem.hasParagraph()) {
            bodyParagraph.setText(currentListItem.getBodyParagraphId());
            bodyParagraph.setVisibility(View.VISIBLE);
        } else {
            bodyParagraph.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
