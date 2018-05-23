package com.mahesaiqbal.googlebooks.feature.detail;

import com.mahesaiqbal.googlebooks.models.ItemsItem;

public interface DetailView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(ItemsItem item);

    void getDataFail(String message);

    void refreshData();
}
