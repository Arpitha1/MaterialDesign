package com.example.abhi.materialdesign;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {
    public String[] Dataset;
    private View itemLayoutView;
    private ViewHolder viewHolder;

    public CardViewAdapter(String[] myDataset){
        Dataset=myDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View item  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,null);
        
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(CardViewAdapter.ViewHolder holder, int position) {
        
        viewHolder.tvtinfo_text.setText(Dataset[position].toString());

    }

    @Override
    public int getItemCount() {
        return Dataset.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvtinfo_text;
        public ViewHolder(View itemLayoutView){
            super(itemLayoutView);
            tvtinfo_text=(TextView)itemLayoutView.findViewById(R.id.text);
        }
    }
}

