package com.example.mehdi.tp1;

import java.util.ArrayList;
import java.util.List;

public class DataManager{

    private static DataManager INSTANCE;
    private List<String> nameList;

    private DataManager(){
        this.nameList=new ArrayList<>();
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void addName(String name) {
        this.nameList.add(name);
    }

    static public DataManager getInstance(){
        if(INSTANCE==null){
            INSTANCE=new DataManager();
        }
        return INSTANCE;
    }

}