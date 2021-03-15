package com.example.miwokapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter<Word> {
    int resource_color;
    public WordAdapter(@NonNull Context context, ArrayList<Word> list,int color_code) {
        super(context, 0, list);
        resource_color = color_code;
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
            Word currentAndroidFlavor = getItem(position);
            // Get the {@link AndroidFlavor} object located at this position in the list

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_translation);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            miwokText.setText(currentAndroidFlavor.getMiwokTranslation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView englishText = (TextView) listItemView.findViewById(R.id.english_translation);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            englishText.setText(currentAndroidFlavor.getDefaultTranslation());

            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView

            ImageView img = (ImageView)listItemView.findViewById(R.id.image);
            //If image is there then and then imageView will exist.
            if(currentAndroidFlavor.hasImage()) {
                img.setImageResource(currentAndroidFlavor.getImageResourceId());
                img.setVisibility(View.VISIBLE);
            }
            //ImageView will disable here. In else.
            else
            {
                img.setVisibility(View.GONE);
            }

            View textContainer = listItemView.findViewById(R.id.text_translation);
            int color = ContextCompat.getColor(getContext(),resource_color);
            textContainer.setBackgroundColor(color);

        return listItemView;
    }
}