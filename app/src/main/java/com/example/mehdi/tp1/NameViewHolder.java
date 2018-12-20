package com.example.mehdi.tp1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    public NameViewHolder(View itemView){
        super(itemView);
    }

    String name;
    TextView textViewName;

    public void setContent(String name){
        //

        this.name = name;
        textViewName.setText(name);
    }







}
