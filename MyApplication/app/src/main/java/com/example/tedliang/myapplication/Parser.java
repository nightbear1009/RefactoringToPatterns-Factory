package com.example.tedliang.myapplication;

/**
 * Created by tedliang on 10/1/14.
 */
public class Parser {
    private boolean shouldDecode = false;
    public void setNodeDecode(boolean _shouldDecode){
        shouldDecode = _shouldDecode;
    }

    public boolean shouldDecode(){
        return shouldDecode;
    }
}
