package com.mahesaiqbal.googlebooks.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.mahesaiqbal.googlebooks.R;
import com.mahesaiqbal.googlebooks.models.ItemsItem;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private List<ItemsItem> books;
    private int rowLayout;
    private Context context;

    static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView title, author;
        ImageView thumbnail;
        RatingBar rating;

        public BookViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            author = itemView.findViewById(R.id.author);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            rating = itemView.findViewById(R.id.rating);
        }
    }

    public BookAdapter(List<ItemsItem> books, int rowLayout, Context context) {
        this.books = books;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        try {
            holder.title.setText(books.get(position).getVolumeInfo().getTitle());
            holder.author.setText(String.format("Author by %s", books.get(position).getVolumeInfo().getAuthors().get(0)));

            Glide.with(context)
                    .load(books.get(position)
                    .getVolumeInfo()
                    .getImageLinks()
                    .getThumbnail()).into(holder.thumbnail);

            holder.rating.setRating(books.get(position).getVolumeInfo().getAverageRating().floatValue());
        } catch(NullPointerException e) {
            holder.rating.setRating(0);
        }
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
