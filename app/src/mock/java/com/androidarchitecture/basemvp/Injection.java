package com.androidarchitecture.basemvp;

import android.content.Context;
import android.support.annotation.NonNull;

import com.androidarchitecture.basemvp.domain.repository.source.MainDataSource;
import com.androidarchitecture.basemvp.data.FakeTasksRemoteDataSource;
import com.androidarchitecture.basemvp.domain.repository.MainModelRepository;
import com.androidarchitecture.basemvp.domain.repository.local.TasksLocalDataSource;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Enables injection of mock implementations for
 * {@link MainDataSource} at compile time. This is useful for testing, since it allows us to use
 * a fake instance of the class to isolate the dependencies and run a test hermetically.
 */
public class Injection {

    public static MainModelRepository provideTasksRepository(@NonNull Context context) {
        checkNotNull(context);
        return MainModelRepository.getInstance(FakeTasksRemoteDataSource.getInstance(),
                TasksLocalDataSource.getInstance(context));
    }

}