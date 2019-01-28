package com.example.android.discoverrajasthan;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new DiscoverFragment();
        } else if (position == 2) {
            return new FairsAndFestivalsFragment();
        } else {
            return new PalacesFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.aboutFragment);
        } else if (position == 1) {
            return mContext.getString(R.string.discoverFragment);
        } else if (position == 2) {
            return mContext.getString(R.string.fairsAndFestivalFragment);
        } else {
            return mContext.getString(R.string.palacesFragment);
        }
    }


}