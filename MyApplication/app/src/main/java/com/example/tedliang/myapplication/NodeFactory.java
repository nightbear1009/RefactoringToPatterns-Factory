package com.example.tedliang.myapplication;

/**
 * Created by tedliang on 10/1/14.
 */
public class NodeFactory {

    public Node createStringNode(boolean shouldDecodeNode){
        if(shouldDecodeNode){
            return new Node.DecodingNode();
        }
        return new Node.StringNode();
    }
}
