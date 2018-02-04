package com.example.android.cuevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Volunteer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
    }

    public void add (View view){
        Intent intent = new Intent(Volunteer.this, CreateEvent.class);
        startActivity(intent);
    }
}

