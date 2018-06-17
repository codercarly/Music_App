package com.example.carly.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        /*
         * Song Button - takes user to SongActivity
         */
        TextView songs = findViewById(R.id.song_button);
        // Set a click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(ArtistActivity.this, SongActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        /*
         * Now Playing Button - takes user to NowPlayingActivity
         */
        TextView nowPlaying = findViewById(R.id.now_playing_button);
        // Set a click listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(ArtistActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        /*
         *Create an array list of Artists & an array adapter
         */
        ArrayList<Song> artist = new ArrayList<Song>();

        // Add the artist name & image
        artist.add(new Song("Adele", R.drawable.adele_19));
        artist.add(new Song("Fall Out Boy", R.drawable.falloutboy_mania));
        artist.add(new Song("My Chemical Romance", R.drawable.mychemicalromance_danger));
        artist.add(new Song("Panic! At The Disco", R.drawable.panic_fever));
        artist.add(new Song("Shawn Mendes", R.drawable.shawn_stiches));
        artist.add(new Song("Paramore", R.drawable.paramore_aint));
        artist.add(new Song("Ed Sheeran", R.drawable.ed_x));
        artist.add(new Song("Lady Gaga", R.drawable.gaga_applause));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArtistAdapter adapter = new ArtistAdapter(this, artist);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list file.
        ListView listView = findViewById(R.id.artist_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
