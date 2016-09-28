package com.testproject;

/**
 * Created by swati on 28/9/16.
 */
public class ValidateName extends Exception {

    public void validateName(String s) throws Exception{

        if(!s.equals(null)){
            System.out.println("Valid Name");
        }
        else
            throw new  Exception("Name can not be null");

    }


}
