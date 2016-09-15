package com.androidarchitecture.basemvp.presentation.contracts;

import com.androidarchitecture.basemvp.base.BasePresenter;
import com.androidarchitecture.basemvp.base.BaseView;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface MainContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        boolean isActive();
    }

    interface Presenter extends BasePresenter {


    }
}