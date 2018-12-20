package com.example.mehdi.tp1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {

    public NameViewHolder(View itemView){
        super(itemView);
    }

    TextView textViewName;
    String name;


    public void setContent(String name){
        //
        textViewName = textViewName.findViewById(R.id.activity_main_text);
        this.name = name;
        textViewName.setText(name);
    }







}
