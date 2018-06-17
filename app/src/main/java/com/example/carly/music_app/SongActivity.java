package com.example.carly.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getActionBar().setDisplayHomeAsUpEnabled(true);


        /*
         * Artist Button - takes user to the ArtistActivity
         */
        TextView artists = findViewById(R.id.artist_button);
        // Set a click listener on that view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(SongActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        /*
         * Now Playing Button - takes user to the NowPlayingActivity
         */
        TextView nowPlaying = findViewById(R.id.now_playing_button);

        // Set a click listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(SongActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Create a list of Songs
        final ArrayList<Song> song = new ArrayList<Song>();

        // Add song name, artist name, and artist album image to list.
        song.add(new Song("Rumor Has It", "Adele", R.drawable.adele_21));
        song.add(new Song("Chasing Pavements", "Adele", R.drawable.adele_19));
        song.add(new Song("The Phoenix", "Fall Out Boy", R.drawable.falloutboy_save));
        song.add(new Song("Stay Frosty Royal Milk Tea", "Fall Out Boy", R.drawable.falloutboy_mania));
        song.add(new Song("Welcome to the Black Parade", "My Chemical Romance", R.drawable.mychemicalromance_black));
        song.add(new Song("Sing", "My Chemical Romance", R.drawable.mychemicalromance_danger));
        song.add(new Song("Time to Dance", "Panic! At The Disco", R.drawable.panic_fever));
        song.add(new Song("Victorious", "Panic! At The Disco", R.drawable.panic_death));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter songAdapter = new SongAdapter(this, song);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list file.
        ListView listView = findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(songAdapter);

        // ListView on item selected listener.
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Getting ListView click value into String variable.
                String TempListViewClickedValue = song[position].toString();

                Intent intent = new Intent(SongActivity.this, NowPlayingActivity.class);

                // Sending value to another activity using intent.
                intent.putExtra("ListViewClickedValue", TempListViewClickedValue);

                startActivity(intent);

                }
        });

    }
}

