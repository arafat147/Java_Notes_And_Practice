package objectOrientedProgrammingCollectionFramework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GeneralSorting {


    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("Baghdad");
        al.add("Arizona");
        al.add("Dallas");
        al.add("Chicago");

        //to sort string objects:
        Collections.sort(al);
        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("############");
        //to sort string object in reverse:
        Collections.sort(al,Collections.reverseOrder());
        Iterator<String> it2 = al.iterator();
        while(it2.hasNext() ){
            System.out.println(it2.next());
        }
        System.out.println("############");
        //to sort wrapper class objects: integer:
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(101);
        ar.add(50);
        ar.add(100);
        ar.add(80);
        Collections.sort(ar);
        Iterator<Integer> it3 = ar.iterator();
        while(it3.hasNext() ){
            System.out.println(it3.next());
        }



    }



}
