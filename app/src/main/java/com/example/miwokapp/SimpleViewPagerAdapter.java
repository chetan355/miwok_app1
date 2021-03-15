package com.example.miwokapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleViewPagerAdapter extends FragmentPagerAdapter {

    public SimpleViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new NumberActivity_Fragment();
            case 1:
                return new FamilyMembers_Fragment();
            case 2:
                return new ColorActivity_Fragment();
            case 3:
                return new PhrasesActivity_Fragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Numbers";
            case 1:
                return "Colors";
            case 2:
                return "Family";
            case 3:
                return "Phrases";
            default:
                return null;
        }
    }
}
