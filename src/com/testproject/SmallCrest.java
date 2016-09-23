package com.testproject;

/**
 * Created by swati on 23/9/16.
 */

public class SmallCrest extends Crest {

    public int smallCresId=3;
    protected String smalCrestName="Small Crest";

    public void dispMsg(){
        System.out.println("This is in Small Crest Class");
    }

    public SmallCrest(int smallCresId) {
        this.smallCresId = smallCresId;
    }
}
