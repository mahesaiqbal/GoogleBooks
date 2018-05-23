package com.mahesaiqbal.googlebooks.base.mvp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.mahesaiqbal.googlebooks.base.ui.BaseFragment;
import com.mahesaiqbal.googlebooks.base.ui.BasePresenter;

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment {
    protected P presenter;

    protected abstract P createPresenter();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        presenter = createPresenter();
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter != null) {
            presenter.dettachView();
        }
    }
}
