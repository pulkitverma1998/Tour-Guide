package com.example.android.discoverrajasthan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends Fragment {

    public DiscoverFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<listItem> listItems = new ArrayList<>();

        listItems.add(new listItem(R.drawable.alwar, R.string.alwarName, R.string.alwarDescription));
        listItems.add(new listItem(R.drawable.ajmer, R.string.ajmerName, R.string.ajmerDescription));
        listItems.add(new listItem(R.drawable.chittorgarhfort, R.string.chittorgarhFortName, R.string.chittorgarhFortDescription));
        listItems.add(new listItem(R.drawable.jaipur, R.string.jaipurName, R.string.jaipurDescription));
        listItems.add(new listItem(R.drawable.ranthambore, R.string.ranthamboreName, R.string.ranthamboreDescription));
        listItems.add(new listItem(R.drawable.hawamahal, R.string.hawaMahalName, R.string.hawaMahalDescription));
        listItems.add(new listItem(R.drawable.birlatemple, R.string.birlaTempleName, R.string.birlaTempleDescription));
        listItems.add(new listItem(R.drawable.lakepichola, R.string.lakePicholaName, R.string.lakePicholaDescription));

        listItemAdapter adapter = new listItemAdapter(getActivity(), listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
