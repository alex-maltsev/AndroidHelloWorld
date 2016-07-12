package com.tva.helloworld;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Alex Maltsev on 7/11/16.
 */
public class ColorActivity extends AppCompatActivity {
    public static int COLOR_REQUEST = 100;
    public static String COLOR_EXTRA_ID = "COLOR_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    public void colorButtonClicked(View view) {
        ColorDrawable buttonBackground = (ColorDrawable)view.getBackground();
        int colorId = buttonBackground.getColor();
        Intent intent=new Intent();
        intent.putExtra(COLOR_EXTRA_ID, colorId);
        setResult(RESULT_OK, intent);
        finish();
    }
}
