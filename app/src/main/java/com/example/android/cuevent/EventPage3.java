package com.example.android.cuevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EventPage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page3);
    }

    public void success (View view){
        Toast.makeText(EventPage3.this, "Registration successful!",
                Toast.LENGTH_SHORT).show();
    }
}
