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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == ColorActivity.COLOR_REQUEST && resultCode == RESULT_OK) {
            int colorId = data.getIntExtra(ColorActivity.COLOR_EXTRA_ID, R.color.colorPrimary);
            colorView.setBackgroundColor(colorId);
        }
    }

    public void showRatingActivityClicked(View view) {
        float numStars = ratingBar.getRating();

        Intent intent = new Intent(this, RatingActivity.class);
        intent.putExtra(RatingActivity.NUMBER_OF_STARS_EXTRA_ID, numStars);
        startActivity(intent);
    }

    public void showColorActivityClicked(View view) {
        Intent intent = new Intent(this, ColorActivity.class);
        startActivityForResult(intent, ColorActivity.COLOR_REQUEST);
    }
}
