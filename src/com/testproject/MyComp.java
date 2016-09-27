package com.testproject;

import java.util.Comparator;

/**
 * Created by swati on 25/9/16.
 */

class MyComp implements Comparator<String> {

    public int compare(String a,String b){

     int i,j,k;
        String aStr,bStr;
        aStr=a;
        bStr=b;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0) // last names match, check entire name
            return aStr.compareTo(bStr);
        else
            return k;
    }
}
