package com.tva.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Alex Maltsev on 7/11/16.
 */
public class RatingActivity extends AppCompatActivity {
    public static String NUMBER_OF_STARS_EXTRA_ID = "NUMBER_OF_STARS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        float numStars = getIntent().getFloatExtra(NUMBER_OF_STARS_EXTRA_ID, 0); // Will default to 0, if value is not passed in

        TextView ratingText = (TextView)findViewById(R.id.ratingText);
        ratingText.setText(String.valueOf(numStars));
    }
}
