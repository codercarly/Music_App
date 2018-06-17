package com.example.carly.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        /**
         * Find the View that shows the artists category
         */
        TextView artists = (TextView) findViewById(R.id.artists);
        // Set a click listener on that view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });
        /**
         * Find the View that shows the songs category
         */
        TextView songs = (TextView) findViewById(R.id.songs);
        // Set a click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create a new intent to open the {@link SongActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });
        /**
         * Find the View that shows the now playing category
         */
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that view
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}
