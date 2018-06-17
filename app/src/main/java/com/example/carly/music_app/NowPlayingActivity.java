package com.example.carly.music_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity{

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        editText = (EditText) findViewById(R.id.artist_name);

        // Receiving value into activity using intent.
        String TempHolder = getIntent().getStringExtra("ListViewClickedValue");

        // Setting up received value into EditText.
        editText.setText(TempHolder);

    }
}
