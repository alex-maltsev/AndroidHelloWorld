package com.tva.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private View colorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        colorView = findViewById(R.id.colorView);
    }

    public void showRatingActivityClicked(View view) {
        float numStars = ratingBar.getRating();

        Intent intent = new Intent(this, RatingActivity.class);
        intent.putExtra("NUMBER_OF_STARS", numStars);
        startActivity(intent);
    }

    public void showColorActivityClicked(View view) {

    }
}
