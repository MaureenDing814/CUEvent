package com.example.android.cuevent;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import static com.example.android.cuevent.R.menu.drawer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.create:
                startActivity(new Intent(MainActivity.this, CreateEvent.class));
                return true;
            case R.id.log_in:
                startActivity(new Intent(MainActivity.this, LogIn.class));
                return true;
            case R.id.profile:
                startActivity(new Intent(MainActivity.this, Profile.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void event(View view) {
        Intent intent = new Intent(MainActivity.this, EventPage.class);
        startActivity(intent);
    }

    public void event1(View view) {
        Intent intent = new Intent(MainActivity.this, EventPage2.class);
        startActivity(intent);
    }

    public void event2(View view) {
        Intent intent = new Intent(MainActivity.this, EventPage3.class);
        startActivity(intent);
    }

    public void lecture(View view) {
        Intent intent = new Intent(MainActivity.this, EventList.class);
        startActivity(intent);
    }

    public void music(View view) {
        Intent intent = new Intent(MainActivity.this, MusicList.class);
        startActivity(intent);
    }

    public void theater(View view) {
        Intent intent = new Intent(MainActivity.this, Theater.class);
        startActivity(intent);
    }

    public void volunteer(View view) {
        Intent intent = new Intent(MainActivity.this, Volunteer.class);
        startActivity(intent);
    }

    public void workshop(View view) {
        Intent intent = new Intent(MainActivity.this, Workshop.class);
        startActivity(intent);
    }


}
