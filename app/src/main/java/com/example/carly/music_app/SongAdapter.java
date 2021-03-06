package com.example.carly.music_app;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song>{

        /**
         * This is a custom constructor
         */
        public SongAdapter(Activity context, ArrayList<Song> songAdapter) {
            super(context, 0, songAdapter);
        }

        /**
         * Provides a view for an AdapterView
         * @param position The position in the list of data that should be displayed in the list item view.
         * @param convertView The recycled view to populate
         * @param parent The parent ViewGroup that is used for inflation
         * @return The View for the position in the AdapterView
         */
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }

            // Get the {@link Song} object located at this position in the list
            Song songName = getItem(position);

            // Get SONG Name
            // Find the TextView in the list_item.xml layout with the ID song_text_view
            TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
            // Get the version name from the current SONG object and set this text on the name TextView
            songTextView.setText(songName.getSongName());

            // Get ARTIST Name
            // Find the TextView in the list_item.xml layout with the ID artist_text_view
            TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
            // Get the version name from the current ARTIST object and set this text on the name TextView
            artistTextView.setText(songName.getArtistName());

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_cover);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(songName.getImageResourceId());

            // Return the whole list item layout (containing 2 TextViews and an ImageView) so that it
            // can be shown in the ListView
            return listItemView;
        }
    }

