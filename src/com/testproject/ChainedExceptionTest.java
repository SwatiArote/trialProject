package com.testproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by swati on 28/9/16.
 */
public class ChainedExceptionTest {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name;
        String bDate;

        SimpleDateFormat dFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date d = new Date();
        System.out.println(dFormat.format(d));
        System.out.println("Current date:"+dFormat.format(d));

        System.out.println("Enter name of user=");
        name = sc.next();
        System.out.println("Enter date in dd/mm/yyyy format");
        bDate = sc.next();

        Date birthDate = null;
        try {
            birthDate = dFormat.parse(bDate);
            System.out.println(birthDate.getYear());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Userdata u1 = new Userdata(name,birthDate);
        UserData2 u2 = new UserData2(u1);

      try {
            u1.calculateAge(u1.dob);

        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Person can Vote= ");
            System.out.println(u2.isVoter(u1));
        } catch (InvalidNum invalidNum) {
            System.out.println("No");
            System.out.println(invalidNum.getCause());
        }

    }
}
