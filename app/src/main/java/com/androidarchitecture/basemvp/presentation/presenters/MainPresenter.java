package com.androidarchitecture.basemvp.presentation.presenters;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.androidarchitecture.basemvp.data.repository.MainModelRepository;
import com.androidarchitecture.basemvp.presentation.contracts.MainContract;
import com.androidarchitecture.basemvp.presentation.fragments.MainFragment;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Listens to user actions from the UI ({@link MainFragment}),
 * retrieves the data and updates the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {

    private final MainContract.View mView;
    private final MainModelRepository mRepository;

    @Nullable
    private String mTaskId;

    public MainPresenter(@Nullable String taskId,
                               @NonNull MainModelRepository mRepository,
                               @NonNull MainContract.View mView) {
        this.mTaskId = taskId;
        this.mRepository = checkNotNull(mRepository, "mRepository cannot be null!");
        this.mView = checkNotNull(mView, "mView cannot be null!");
        this.mView.setPresenter(this);
    }
    @Override
    public void start() {

    }
}
