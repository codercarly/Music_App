package com.example.carly.music_app;

import android.content.Context;
import android.view.View;


public class Song {

    // Default translation for the word
    private String mSongName;  // m in front of the variable shows that it's Private.

    // Miwok translation for the word
    private String mArtistName;


    /**
     * Constructor - Create a new word object
     *
     * @param songName   is the name of the song in the playlist.
     * @param artistName is the artist of the selected song.
     */
    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    /**
     * Get the song name
     */

    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the artist name
     */
    public String getmArtistName() {
        return mArtistName;
    }

}

