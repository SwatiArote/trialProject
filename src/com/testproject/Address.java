package com.testproject;


/**
 * Created by swati on 25/9/16.
 */
public class Address {

    int bNum;
    String bName;
    String city;
    String county;


    public Address(int bNum, String bName, String city, String county) {
        this.bNum = bNum;
        this.bName = bName;
        this.city = city;
        this.county = county;
    }

    public String toStr(){
        return bNum+","+bName+" from "+city+","+county;
    }




}
