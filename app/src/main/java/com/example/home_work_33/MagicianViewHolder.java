package com.example.home_work_33;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class MagicianViewHolder extends RecyclerView.ViewHolder {
    private ImageView magicianImage;
    private TextView grade, title;


    public MagicianViewHolder(@NonNull View itemView) {
        super(itemView);
        magicianImage = itemView.findViewById(R.id.img_magician);
        grade = itemView.findViewById(R.id.tv_grade);
        title = itemView.findViewById(R.id.tv_name);
    }

    protected void bind (Magicians magicians) {
        title.setText(magicians.getName());
        grade.setText(magicians.getGrade());
        Glide.with(itemView.getContext())
                .load(magicians.getImage())
                .into(magicianImage);
    }
}
