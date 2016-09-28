package com.testproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by swati on 28/9/16.
 */

public class Userdata {

    String uName;
    Date dob;

    public Userdata(){}

    public Userdata(String uName, Date dob) {
        this.uName = uName;
        this.dob = dob;
    }

    public int calculateAge(Date date){

        DateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date d = new Date();
        int ageDiff = d.getYear()-date.getYear();

        if(ageDiff < 18){
            throw new AgeException("Age is less than 18");
        }
        else {
            return ageDiff;
        }

    }

    public void validateDate(Userdata u) throws Exception{


    }
}
