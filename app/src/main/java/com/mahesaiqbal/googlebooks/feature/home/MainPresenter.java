package com.mahesaiqbal.googlebooks.feature.home;

import android.app.Activity;
import android.content.Intent;

import com.mahesaiqbal.googlebooks.base.ui.BasePresenter;
import com.mahesaiqbal.googlebooks.feature.detail.DetailActivity;
import com.mahesaiqbal.googlebooks.models.Books;
import com.mahesaiqbal.googlebooks.models.ItemsItem;
import com.mahesaiqbal.googlebooks.network.NetworkCallback;

public class MainPresenter extends BasePresenter<MainView> {
    public MainPresenter(MainView view) {
        super.attachView(view);
    }

    public void loadData(String key) {
        view.showLoading();
        addSubscribe(apiStores.getTopBooks(key), new NetworkCallback<Books>() {
            @Override
            public void onSuccess(Books model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

    public void getItem(ItemsItem item, Activity activity) {
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra("id", item.getId());
        view.moveToDetail(intent);
    }
}
