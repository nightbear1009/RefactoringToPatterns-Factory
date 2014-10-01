package com.example.tedliang.myapplication;

/**
 * Created by tedliang on 10/1/14.
 */
public class StringNodeParsingOption {
    private boolean shouldDecode = false;

    public void setNodeDecode(boolean _shouldDecode){
        shouldDecode = _shouldDecode;
    }

    public boolean shouldDecode(){
        return shouldDecode;
    }

    public Node createStringNode() {
        if (shouldDecode) {
            return new Node.DecodingNode();
        }
        return new Node.StringNode();
    }

}
