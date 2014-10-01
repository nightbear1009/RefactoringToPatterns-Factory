package com.example.tedliang.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testNode(){
        Parser parser = new Parser();
        parser.getStringNodeParingOption().setNodeDecode(true);
        Node node = StringParser.find(parser);
        assertEquals(node.getTitle(),"Decode");
    }
}