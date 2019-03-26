package com.japjotsingh.udacitymovie.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.japjotsingh.udacitymovie.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element versionElement = new Element();
        versionElement.setTitle("Version 1.2");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.ic_themoviedb)
                .setDescription(getString(R.string.description))
                .addItem(versionElement)
                .addEmail("japjots3198@gmail.com")
                .addWebsite("http://www.japjotsingh.com/")
                .addPlayStore("com.japjotsingh.udacitymovie")
                .addGitHub("japjotsingh")
                .create();

        setContentView(aboutPage);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}