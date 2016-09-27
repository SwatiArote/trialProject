package com.testproject;

/**
 * Created by swati on 23/9/16.
 */

public class Springer {

   protected  int spriId=1;
    protected String spriName="SpringerName";
    static String city="London";
    final int year;

    Springer(int yr){
        year=yr;
    }

    Springer(){
        year=2004;
    }

    public void  dispMsg(){
        System.out.println("This is in Springer Class");

    }

    static void dispName(){
        System.out.println("In static method of Springer");
    }

    protected void dispId(){
        System.out.println("In protected method of Springer");
    }

    public String dispWithMsg(int num){
        return "Helllo...."+num;
    }

    public String dispWithMsg(String name){
        return "Helllo...."+name;
    }

     protected void dispYear(){
         System.out.println("Year="+year);
     }

}
