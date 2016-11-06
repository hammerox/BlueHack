package com.hammerox.bluehack;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class InterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
        ButterKnife.bind(this);

        if (getSupportActionBar() != null)
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @OnClick({ R.id.interest_image1, R.id.interest_image2, R.id.interest_image3})
    public void onImageClick(ImageView imageView){
        imageView.getDrawable().setColorFilter(
                new PorterDuffColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY));
    }
}
