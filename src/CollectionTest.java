import com.testproject.AgeException;

import java.util.*;

/**
 * Created by swati on 27/9/16.
 */

public class CollectionTest {

    static void validate(int ag,String con) throws AgeException{
        if(ag<18 || !(con.equals("India"))){
            throw new AgeException("You cannot vote");
        }
        else
            System.out.println("You can vote");
    }

    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int voterId;

      List<Person> people = new LinkedList<>();
      List<Person> voters = new LinkedList<>();
      Map<Integer,String> voterIdList= new TreeMap<>();

     people.add(new Person("Swati",23,"India"));
     people.add(new Person("Ayu",14,"India"));
     people.add(new Person("John",21,"Japan"));
     people.add(new Person("Shreya",22,"India"));
     people.add(new Person("Shruti",21,"India"));
        people.add(new Person("Swati",21,"India"));

        System.out.println("List of Members:");
       for(Person x:people){
           System.out.println("Name:"+x.name+" Age:"+x.age+" County:"+x.county);
           try {
               validate(x.age,x.county);
               voters.add(x);
           }
           catch (AgeException a){
               System.out.println(a.getMessage());
           }
       }

        System.out.println("__________________");
        System.out.println("Valid Voters:");
       try {
           for (int i = 0; i <=people.size(); i++) {     //assumption all member of people are voters so size taken
               System.out.println(voters.get(i).name);
               voterIdList.put(1001+i,voters.get(i).name);
           }
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("Cause of exception="+e.getCause());
       }

        System.out.println("Please Enter voter Id-");
        voterId=sc.nextInt();
        System.out.println("Voter name is="+voterIdList.get(voterId));

    }
}
