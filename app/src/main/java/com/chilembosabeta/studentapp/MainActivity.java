package com.chilembosabeta.studentapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Home: onCreate()");

        Button timetableButton = findViewById(R.id.timetableButton);

        timetableButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TimetableActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Home: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Home: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Home: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Home: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Home: onDestroy()");
    }
}