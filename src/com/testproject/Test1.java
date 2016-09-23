package com.testproject;

/**
 * Created by swati on 23/9/16.
 */

public class Test1 {

    public static void  main(String args[]) {

        Crest ob1=new Crest();
        Springer ob2=new SmallCrest(4);

        Crest ob3=(SmallCrest)ob2;
     //   System.out.println(ob3.smallCresId);
       ob1.dispMsg();
//        ob1.dispId();
        System.out.println();
        ob2.dispMsg();



  //      System.out.println(ob2.dispNameWithMsg());

    }


}
