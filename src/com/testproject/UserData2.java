package com.testproject;

/**
 * Created by swati on 28/9/16.
 */

public class UserData2 extends Userdata {

    public UserData2(Userdata u){
    }

     public Boolean isVoter(Userdata u){

        Boolean status=false;
         try {
             if(calculateAge(u.dob)>=18){
                 status=true;
             }
           }
         catch (AgeException e){
           //  e.printStackTrace();
             InvalidNum e1=new InvalidNum("Magic number is invalid");
             e1.initCause(new AgeException("Cause is Age is lesss"));
             throw e1;
         }

        return  status;
     }


}
