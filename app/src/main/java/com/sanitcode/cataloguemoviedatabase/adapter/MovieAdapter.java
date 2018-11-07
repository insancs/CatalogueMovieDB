package com.sanitcode.cataloguemoviedatabase.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sanitcode.cataloguemoviedatabase.R;
import com.sanitcode.cataloguemoviedatabase.data.model.ResultItems;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<ResultItems> resultItemsList = new ArrayList<>();

    private Context context;

    public MovieAdapter(FragmentActivity context) {
        this.context = context;
    }

    public void clearAll() {
        resultItemsList.clear();
        notifyDataSetChanged();
    }

    public void replaceAll(List<ResultItems> items) {
        resultItemsList.clear();
        resultItemsList = items;
        notifyDataSetChanged();
    }

    public void updateData(List<ResultItems> items) {
        resultItemsList.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,
                        parent, false)
        );
    }

    public void setMovieResult(List<ResultItems> resultItems) {
        this.resultItemsList = resultItems;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.bindView(resultItemsList.get(position));
    }

    @Override
    public int getItemCount() {
        return resultItemsList.size();
    }
}
