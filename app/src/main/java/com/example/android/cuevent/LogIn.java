package com.example.android.cuevent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void register(View view){
    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://ec2-54-205-49-193.compute-1.amazonaws.com/about-us/")));
}


    public void login(View view){
        Intent intent = new Intent(LogIn.this, MainActivity.class);
        startActivity(intent);
    }
}
