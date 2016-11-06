package com.hammerox.bluehack;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.view.View.GONE;

public class InterestActivity extends AppCompatActivity {

    @BindView(R.id.activity_interest) RelativeLayout layout;
    @BindView(R.id.interest_scroll) ScrollView scrollView;
    @BindView(R.id.interest_button) Button interestButton;
    @BindColor(R.color.colorPrimary) int colorPrimary;

    private int interestCount;

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

        String idString = getResources().getResourceEntryName(imageView.getId());
        String number = idString.split("image")[1];
        String newIdName = "interest_okay" + number;

        int resourceId = this.getResources().getIdentifier(newIdName, "id", this.getPackageName());

        findViewById(resourceId).setVisibility(View.VISIBLE);
        interestCount++;

        if (interestCount == 1) {
            interestButton.setVisibility(View.VISIBLE);
        }
    }

    @OnClick({ R.id.interest_okay1, R.id.interest_okay2, R.id.interest_okay3})
    public void onCheckClick(ImageView imageView) {
        imageView.setVisibility(GONE);
        interestCount--;

        if(interestCount == 0) {
            interestButton.setVisibility(GONE);
        }
    }

    @OnClick(R.id.interest_button)
    public void onOkayClick() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
