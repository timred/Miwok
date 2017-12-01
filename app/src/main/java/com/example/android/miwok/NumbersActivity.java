package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of numbers
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the rootView that will contain the childViews for each number text
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        for(int i = 0; i < words.size(); i++) {
            // Create a new {@link TextView} that displayed the word at each index
            // and add the View as a child to the rootView
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }

        // Print each element to the logs
        for(int i = 0; i < words.size(); i++) {
            Log.v("NumbersActivity","Word at index " + i + ": " + words.get(i));
        }

    }
}
