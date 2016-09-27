package com.testproject;

import com.sun.javafx.collections.MappingChange;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by swati on 23/9/16.
 */

public class Test1 {

    public static void  main(String args[]) {

   /*     Crest ob1=new Crest();
        Springer ob2=new SmallCrest(4);
        Crest ob3=(SmallCrest)ob2;

        Springer ob4=new Crest();
        Springer ob5=new Springer();
        Springer ob6=new Springer(1992);

     //   System.out.println(ob3.smallCresId);
        ob2.dispMsg();
        ob1.dispName();
        System.out.println(ob2.dispWithMsg(2));
        System.out.println(ob2.dispWithMsg("Springer"));
        ob3.dispCrest();
        ob5.dispYear();
        ob6.dispYear();  */


        List<Integer> l1=new LinkedList<>();
        List<Integer> l2 =new ArrayList<>();

        HashSet<Integer> s1=new HashSet<>();
        LinkedHashSet<Integer> s2=new LinkedHashSet<>();
        TreeSet<Integer> s3=new TreeSet<>();

        //***************Performance of sets*********8
        System.out.println("Performance comparision of sets==>>");

        long startTime=System.nanoTime();
        for(int i=1;i<1000;i++){
            s1.add(i);
        }
        long endTime=System.nanoTime();
        System.out.println("Time to insert 1K nums in hashSet="+(endTime-startTime));

        startTime=System.nanoTime();
        for (int i=1;i<1000;i++){
            s2.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("Time to insert 1K nums in LinkedhashSet="+(endTime-startTime));

        startTime=System.nanoTime();
        for (int i=1;i<1000;i++){
            s3.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("Time to insert 1K nums in TreeSet="+(endTime-startTime));

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println();
        System.out.println("Array values to retain in all set with retainAll method"+arr);
        s1.retainAll(arr);
        s2.retainAll(arr);
        s3.retainAll(arr);
        s1.add(0);
        s1.add(7);
        s1.add(9);
        System.out.println("insert sequence(0,7,9) in HashSet not maintain order==>"+s1);
        s2.add(10);
        s2.add(9);
        s2.add(7);
        System.out.println("insert sequence 10,9,7 in LinkeHashSet get maintained=>"+s2);
        s3.add(10);
        s3.add(9);
        s3.add(7);
        System.out.println("insert of 10,9,7 in TreeSet resp get sorted=>"+s3);
        s1.add(null);
        s2.add(null);
     //   s3.add(null);   //null not allow in trreSet
        System.out.println("-----------------");
        System.out.println("null allowed in hashSet"+s1);
        System.out.println("null allowed in linkedhashset"+s2);
        System.out.println("null insertion in tree set gives run time exception");
        System.out.println("-----------------");
        System.out.println("performance of list==>");

        startTime=System.nanoTime();
        for (int i=1;i<10;i++){
            l1.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("time to insert 10 elemnts in linkedLIst="+(endTime-startTime));
        startTime=System.nanoTime();
        for (int i=1;i<10;i++){
            l2.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("time to insert 10 elemnts in ArrayList="+(endTime-startTime));


        startTime=System.nanoTime();
        for (int i=1;i<1000000;i++){
            l1.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("time to insert 1000000 elemnts in linkedLIst="+(endTime-startTime));
        startTime=System.nanoTime();
        for (int i=1;i<1000000;i++){
            l2.add(i);
        }
        endTime=System.nanoTime();
        System.out.println("time to insert 1000000 elemnts in ArrayList="+(endTime-startTime));




        System.out.println("-----------------");
        startTime=System.nanoTime();
        l1.indexOf(78);
        endTime=System.nanoTime();
        System.out.println("time to access element in linkedLIst="+(endTime-startTime));

        startTime=System.nanoTime();
         l2.indexOf(78);
        endTime=System.nanoTime();
        System.out.println("time to access element in ArrayLIst="+(endTime-startTime));



        System.out.println("-----------------");
        startTime=System.nanoTime();
        for (int i=1;i<100;i++){
           l1.remove(99-i);
        }
        endTime=System.nanoTime();
        System.out.println("time to remove 100 elemnts in linkedLIst="+(endTime-startTime));

        startTime=System.nanoTime();
        for (int i=1;i<100;i++){
            l2.remove(99-i);
        }
        endTime=System.nanoTime();

        System.out.println("time to remove 100 elemnts in ArrayList="+(endTime-startTime));

        Map<Integer,String> m1=new HashMap<>();
        TreeMap<Integer,String> m2=new TreeMap<>();
        LinkedHashMap<Integer,String> m4=new LinkedHashMap<>();
        m1.put(1,"One");
        m1.put(2,"Two");
        m1.put(3,"Three");

        Iterator m1Iter =m1.keySet().iterator();
        while (m1Iter.hasNext()){
            System.out.println(m1Iter.next());
        }






    }


}
