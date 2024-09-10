package com.example.home_work_33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MagicianAdapter extends RecyclerView.Adapter<MagicianViewHolder> {

    private ArrayList<Magicians> magicians;

    public MagicianAdapter(ArrayList<Magicians> magicians) {
        this.magicians = magicians;
    }

    @NonNull
    @Override
    public MagicianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_magician, parent, false);
        return new MagicianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MagicianViewHolder holder, int position) {
        holder.bind(magicians.get(position));
    }

    @Override
    public int getItemCount() {
        return magicians.size();
    }
}
