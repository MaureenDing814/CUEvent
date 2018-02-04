package com.example.android.cuevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);
    }

    public void event (View view){
        Intent intent = new Intent(MusicList.this, EventPage3.class);
        startActivity(intent);
    }
}
