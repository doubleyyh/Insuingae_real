package com.example.insuingae.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insuingae.Insus;
import com.example.insuingae.R;

import java.util.ArrayList;
import java.util.Date;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.MainViewHolder>{
    ArrayList<Insus> items = new ArrayList<Insus>();
    static class MainViewHolder extends RecyclerView.ViewHolder {

        MainViewHolder(View v) {
            super(v);
        }
    }
    @NonNull
    @Override
    public TodoAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.insu_view, parent, false);
        items.add(new Insus("test1", "me", "test", new Date()));
        items.add(new Insus("test1", "me", "test", new Date()));
        items.add(new Insus("test1", "me", "test", new Date()));

        return new MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.MainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public void setItem(Insus item){

    }
}
