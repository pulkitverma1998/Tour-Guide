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
public class PalacesFragment extends Fragment {

    public PalacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<listItem> listItems = new ArrayList<>();

        listItems.add(new listItem(R.drawable.alwarcitypalace, R.string.alwarCityPalaceName, R.string.alwarCityPalaceDescription));
        listItems.add(new listItem(R.drawable.amberpalace, R.string.amberPalaceName, R.string.amberPalaceDescription));
        listItems.add(new listItem(R.drawable.neemranafort, R.string.neemranaFortName, R.string.neemranaFortDescription));
        listItems.add(new listItem(R.drawable.jaisalmerfort, R.string.jaisalmerFortName, R.string.jaisalmerFortDecsription));
        listItems.add(new listItem(R.drawable.lakepalace, R.string.lakePalaceName, R.string.lakePalaceDescription));
        listItems.add(new listItem(R.drawable.patwonkihaveli, R.string.patwonKiHaveliName, R.string.patwonKiHaveliDescription));
        listItems.add(new listItem(R.drawable.ranisarpadmasar, R.string.ranisarPadamsarName, R.string.ranisarPadamsarDescription));
        listItems.add(new listItem(R.drawable.gagronfort, R.string.gagronFortName, R.string.gagronFortDescription));

        listItemAdapter adapter = new listItemAdapter(getActivity(), listItems);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
