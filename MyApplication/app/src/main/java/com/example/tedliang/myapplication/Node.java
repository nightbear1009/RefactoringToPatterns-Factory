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

        @Override
        public String getTitle() {
            return "StringNode";
        }
    }
}
