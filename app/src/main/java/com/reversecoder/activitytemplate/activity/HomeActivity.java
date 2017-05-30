package com.reversecoder.activitytemplate.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.reversecoder.activitytemplate.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initLoginUI();
        initLoginAction();
    }

    private void initLoginUI() {
    }

    private void initLoginAction() {
    }
}
