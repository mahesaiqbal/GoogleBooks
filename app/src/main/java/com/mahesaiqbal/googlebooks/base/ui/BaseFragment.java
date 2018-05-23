package com.mahesaiqbal.googlebooks.base.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import butterknife.ButterKnife;
import rx.subscriptions.CompositeSubscription;

public class BaseFragment extends Fragment {
    public Activity activity;
    private CompositeSubscription compositeSubscription;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        activity = getActivity();
        ButterKnife.bind(activity, view);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        onUnsubscribe();
    }

    private void onUnsubscribe() {
        if(compositeSubscription != null) {
            compositeSubscription.unsubscribe();
        }
    }
}
