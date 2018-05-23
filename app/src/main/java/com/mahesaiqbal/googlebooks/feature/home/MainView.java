package com.mahesaiqbal.googlebooks.feature.home;

import android.content.Intent;

import com.mahesaiqbal.googlebooks.models.Books;

public interface MainView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(Books model);

    void getDataFail(String message);

    void moveToDetail(Intent intent);
}
