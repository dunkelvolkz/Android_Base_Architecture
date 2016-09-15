package com.androidarchitecture.basemvp.presentation.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;

import com.androidarchitecture.basemvp.presentation.fragments.MainFragment;
import com.androidarchitecture.basemvp.Injection;
import com.artkodec.basesimplemvp.R;
import com.androidarchitecture.basemvp.base.BaseActivity;
import com.androidarchitecture.basemvp.presentation.presenters.MainPresenter;
import com.androidarchitecture.basemvp.util.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
       // ActionBar ab = getSupportActionBar();
        //ab.setDisplayHomeAsUpEnabled(true);
       // ab.setDisplayShowHomeEnabled(true);

        MainFragment fragment = (MainFragment) getSupportFragmentManager()
                .findFragmentById(R.id.body);

        if (fragment == null) {
            fragment = MainFragment.newInstance();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, R.id.body);
        }

        // Create the presenter
        new MainPresenter(
                "id",
                Injection.provideTasksRepository(getApplicationContext()),
                fragment);
    }
}
