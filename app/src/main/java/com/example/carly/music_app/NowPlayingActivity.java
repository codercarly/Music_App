package com.example.carly.music_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class NowPlayingActivity extends AppCompatActivity{

    TextView editArtist;
    TextView editSong;
    ImageView editImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        /*
         * Artist Button - takes user to the ArtistActivity
         */
        TextView artists = findViewById(R.id.artist_button);
        // Set a click listener on that view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(NowPlayingActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        /*
         * Song Button - takes user to SongActivity
         */
        TextView songs = findViewById(R.id.song_button);
        // Set a click listener on that view
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistsIntent = new Intent(NowPlayingActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });

        /*
         * Get the Extras and place them in the now_playing.xml file when a song is clicked.
         */
        editArtist = findViewById(R.id.artist_name);
        editSong = findViewById(R.id.song_name);
        editImage = findViewById(R.id.artist_image);

        // Receiving value into activity using intent.
        String artist = getIntent().getStringExtra("artist name");
        String song = getIntent().getStringExtra("song name");
        int image = getIntent().getIntExtra("image", 0);


        // Setting up received value into EditText.
        editArtist.setText(artist);
        editSong.setText(song);
        editImage.setImageResource(image);

    }
}
