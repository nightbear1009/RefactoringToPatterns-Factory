package com.example.tedliang.myapplication;

import android.util.Log;

/**
 * Created by tedliang on 10/1/14.
 */
public interface Node {
    public String getTitle();
    public static class DecodingNode implements Node{

        @Override
        public String getTitle() {
            return "Decode";
        }
    }

    public static class StringNode implements Node{
        public static Node createStringNode(boolean shouldDecodeNode){
            if(shouldDecodeNode){
                return new Node.DecodingNode();
            }
            return new Node.StringNode();
        }

        @Override
        public String getTitle() {
            return "StringNode";
        }
    }
}
