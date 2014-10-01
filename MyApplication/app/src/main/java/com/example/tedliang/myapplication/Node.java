package com.example.tedliang.myapplication;

import android.util.Log;

/**
 * Created by tedliang on 10/1/14.
 */
public class Node {
    public void doSomething(){
        Log.d("Ted","do something");
    }
    public static class DecodingNode extends Node{

    }

    public static class StringNode extends Node{
        public static Node createStringNode(boolean shouldDecodeNode){
            if(shouldDecodeNode){
                return new Node.DecodingNode();
            }
            return new Node.StringNode();
        }
    }
}
