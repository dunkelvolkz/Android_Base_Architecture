package com.androidarchitecture.basemvp.domain.repository.source;

import android.support.annotation.NonNull;

import com.androidarchitecture.basemvp.domain.model.MainModel;

import java.util.List;

/**
 * Created by junior on 27/08/16.
 */
public interface MainDataSource {

    interface LoadMainCallback {

        void onMainModelLoaded(List<MainModel> tasks);

        void onDataNotAvailable();
    }

    interface GetMainModelCallback {

        void onMainModelLoaded(MainModel mainModel);

        void onDataNotAvailable();
    }

    void getMainModel(@NonNull LoadMainCallback callback);

    void getMainModel(@NonNull String id, @NonNull GetMainModelCallback callback);

    void saveMainModel(@NonNull MainModel mainModel);

    void refreshMainModel();

    void deleteAllMainModel();

    void deleteMainModel(@NonNull String id);
}
