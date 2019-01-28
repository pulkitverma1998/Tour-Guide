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
public class FairsAndFestivalsFragment extends Fragment {

    public FairsAndFestivalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<listItem> listItems = new ArrayList<>();

        listItems.add(new listItem(R.drawable.gangaurfair, R.string.gangaurFairName, R.string.gangaurFairDate, R.string.gangaurFairDescription));
        listItems.add(new listItem(R.drawable.puskharfair, R.string.puskharFairName, R.string.puskharFairDate, R.string.puskharFairDescription));
        listItems.add(new listItem(R.drawable.udaipurworldmusicfestival, R.string.udaipurWorldMusicFestivalName, R.string.udaipurWorldMusicFestivalDate, R.string.udaipurWorldMusicFestivalDescription));
        listItems.add(new listItem(R.drawable.desertfestival, R.string.desertFestivalName, R.string.desertFestivalDate, R.string.desertFestivalDescription));
        listItems.add(new listItem(R.drawable.kitefestival, R.string.kiteFestivalName, R.string.kiteFestivalDate, R.string.kiteFestivalDEscription));
        listItems.add(new listItem(R.drawable.nagaurfair, R.string.nagaurFairName, R.string.nagaurFairDate, R.string.nagaurFairDescription));
        listItems.add(new listItem(R.drawable.brajholi, R.string.brajHoliName, R.string.brajHoliDate, R.string.brajHoliDescription));
        listItems.add(new listItem(R.drawable.dussehra, R.string.dussehraName, R.string.dussehraDate, R.string.dussehraDescription));

        listItemAdapter adapter = new listItemAdapter(getActivity(), listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
