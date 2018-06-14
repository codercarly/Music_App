package com.example.carly.music_app;

import android.content.Context;
import android.view.View;


public class Song {

    // Song Name
    private String mSongName;  // m in front of the variable shows that it's Private.

    // Artist Name
    private String mArtistName;

    // Album Cover Art
    private int mImageResourceId;


    /**
     * Constructor - Create a new song object
     *
     * @param songName   is the name of the song in the playlist.
     * @param artistName is the artist of the selected song.
     */
    public Song(String songName, String artistName, int imageResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
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
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the image resource id
     */
    public int getImageResourceId() { return mImageResourceId;}
}

