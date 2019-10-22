package com.example.insuingae.adapter;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insuingae.Insus;
import com.example.insuingae.R;

import java.util.ArrayList;


public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.MainViewHolder>{
    ArrayList<Insus> items = new ArrayList<Insus>();

    @NonNull
    @Override
    public TodoAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.insu_view, parent, false);
        return new MainViewHolder(itemView);
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView contentsTextView;
        TextView titleTextView;
        MainViewHolder(View v) {
            super(v);
            titleTextView = v.findViewById(R.id.titleTextView);
            contentsTextView = v.findViewById(R.id.contentsTextView);
        }

        public void setItem(Insus item) {

            titleTextView.setText(item.getTitle());
            contentsTextView.setText(item.getContents());
        }

    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.MainViewHolder holder, int position) {
        Insus item = items.get(position);
        holder.setItem(item);
    }



    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Insus item) {
        items.add(item);
    }
}
