package com.example.carly.music_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<Song> song = new ArrayList<Song>();

        // Add songs to ArrayList
        song.add(new Song("Rumor Has It", "Adele"));
        song.add(new Song("Chasing Pavements", "Adele"));
        song.add(new Song("The Phoenix", "Fall Out Boy"));
        song.add(new Song("Stay Frosty Royal Milk Tea", "Fall Out Boy"));
        song.add(new Song("Welcome to the Black Parade", "My Chemical Romance"));
        song.add(new Song("Sing", "My Chemical Romance"));
        song.add(new Song("Time to Dance", "Panic! At The Disco"));
        song.add(new Song("Victorious", "Panic! At The Disco"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter songAdapter = new SongAdapter(this, song);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list file.
        ListView listView = (ListView) findViewById(R.id.song_list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(songAdapter);
    }
}

