package com.testproject;

/**
 * Created by swati on 23/9/16.
 */

public class Crest extends Springer {

    int crestId=2;
    String crestName="CrestName";


    public void dispMsg(){
        System.out.println("This is in Crest Class");
        System.out.println("Crest id is="+crestId);
        System.out.println("Crest name is="+crestName);
        System.out.println("Springer id is="+spriId);
        System.out.println("Springer name is="+spriName);

    }

    protected void dispCrest(){
        super.dispWithMsg(4);
        System.out.println("Display in crest calss");
    }





}
