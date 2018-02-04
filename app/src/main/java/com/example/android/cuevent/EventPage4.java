package com.example.android.cuevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EventPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page4);
    }

    public void success (View view){
        Toast.makeText(EventPage4.this, "Registration successful!",
                Toast.LENGTH_SHORT).show();
    }
}
