package com.mahesaiqbal.googlebooks.network;

import com.mahesaiqbal.googlebooks.models.Books;
import com.mahesaiqbal.googlebooks.models.ItemsItem;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface NetworkStores {
    @GET("volumes")
    Observable<Books> getTopBooks(@Query("q") String key);

    @GET("volumes/{id}")
    Observable<ItemsItem> getDetailBook(@Path("id") String id);
}
