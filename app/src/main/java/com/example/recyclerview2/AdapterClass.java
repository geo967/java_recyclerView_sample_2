package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.myHolder> {
    List<ItemList> list;
    AdapterClass(List<ItemList> list){this.list=list;}
    @NonNull
    @Override
    public AdapterClass.myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflator=LayoutInflater.from(context);
        View numberView=inflator.inflate(R.layout.item_design,parent,false);
        return new myHolder(numberView);
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterClass.myHolder holder, int position) {
        holder.number.setText(list.get(position).getNumber());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class myHolder extends RecyclerView.ViewHolder{
        TextView number;
        public myHolder(@NonNull View itemView) {
            super(itemView);
            number=itemView.findViewById(R.id.text);
        }
    }
}
