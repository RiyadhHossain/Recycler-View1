package com.riyadh.recyclerview1.FirstPage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riyadh.recyclerview1.R;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder>{

    Context context;
    List<String> nameList;

    public NameAdapter(Context context, List<String> nameList) {
        this.context = context;
        this.nameList = nameList;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.name_item,parent,false);
        NameViewHolder nameViewHolder= new NameViewHolder(view);

        return nameViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        String name= nameList.get(position);
        holder.textView.setText(name);

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
