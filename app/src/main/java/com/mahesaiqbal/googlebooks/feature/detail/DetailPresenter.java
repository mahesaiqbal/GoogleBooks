package com.mahesaiqbal.googlebooks.feature.detail;

import com.mahesaiqbal.googlebooks.base.ui.BasePresenter;
import com.mahesaiqbal.googlebooks.models.ItemsItem;
import com.mahesaiqbal.googlebooks.network.NetworkCallback;

public class DetailPresenter extends BasePresenter<DetailView> {
    public DetailPresenter(DetailView view) {
        super.attachView(view);
    }

    public void loadData(String id) {
        view.showLoading();
        addSubscribe(apiStores.getDetailBook(id), new NetworkCallback<ItemsItem>() {
            @Override
            public void onSuccess(ItemsItem model) {
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
}
