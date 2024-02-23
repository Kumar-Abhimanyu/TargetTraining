package Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        for (String s : set) {
            System.out.println(s);
        }
    }
}
