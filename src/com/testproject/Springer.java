package com.testproject;

/**
 * Created by swati on 23/9/16.
 */

public class Springer {

   protected  int spriId=1;
    protected String spriName="SpringerName";
    static String city="London";

    public void  dispMsg(){
        System.out.println("This is in Springer Class");

    }

    private void dispName(){
        System.out.println("In public method of Springer");
    }

    protected void dispId(){
        System.out.println("In protected method of Springer");
    }

    protected String dispNameWithMsg(){
        return "Helllo...."+spriName;

    }




}
