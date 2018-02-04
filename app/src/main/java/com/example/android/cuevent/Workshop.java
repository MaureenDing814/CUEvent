package com.example.android.cuevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Workshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
    }
    public void event (View view){
        Intent intent = new Intent(Workshop.this, EventPage4.class);
        startActivity(intent);
    }
}
