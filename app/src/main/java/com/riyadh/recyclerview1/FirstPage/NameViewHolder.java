package com.riyadh.recyclerview1.FirstPage;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riyadh.recyclerview1.R;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);

        textView=itemView.findViewById(R.id.nameTextID);
    }
}
