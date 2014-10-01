package com.example.tedliang.myapplication;

/**
 * Created by tedliang on 10/1/14.
 */
public class Parser {
    private StringNodeParsingOption option = new StringNodeParsingOption();

    public StringNodeParsingOption getStringNodeParingOption(){
        return  option;
    }

    public void setStringNodeParsingOption(StringNodeParsingOption _option){
        option = _option;
    }
}
