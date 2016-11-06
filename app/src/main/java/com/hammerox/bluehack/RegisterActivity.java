package com.hammerox.bluehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        if (getSupportActionBar() != null)
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @OnClick(R.id.register_button)
    public void onOkayClick() {
        Intent intent = new Intent(this, InterestActivity.class);
        startActivity(intent);
        finish();
    }
}
