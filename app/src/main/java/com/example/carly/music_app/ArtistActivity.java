package com.example.carly.music_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        // Create a list of words
        ArrayList<Song> artist = new ArrayList<Song>();

        // words.add("one");
        artist.add(new Song("Adele", R.drawable.adele_19));
        artist.add(new Song("Fall Out Boy", R.drawable.falloutboy_mania));
        artist.add(new Song("My Chemical Romance", R.drawable.mychemicalromance_danger));
        artist.add(new Song("Panic! At The Disco", R.drawable.panic_fever));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter adapter = new SongAdapter(this, artist);

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
