package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {

        int[] a = new int[3]; // this is a static array. means, it has a fixed size.
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        //a[3]=40;//this value will give us ArrayIndexOutOfBoundsException.
        System.out.println(a[0]);
        System.out.println(a.length); // to fetch the size of static array.
        System.out.println("###########################");
        //dynamic array: ArrayList
        // non-generic:
        ArrayList ar = new ArrayList(); //this is non-generic arrayList object cz we did not define any datatype so we can store anything here

        ar.add(10);
        ar.add(20);
        ar.add("alex");
        ar.add(12.55);
        ar.add(true);
        ar.add(30);
        ar.add(40);
        System.out.println(ar.size());// size of a dynamic array
        System.out.println(ar.get(2));// to get a value of an index
        System.out.println(ar); // to get the values of an array object.
        System.out.println("###########################");

        // generic: means we define specific type of data
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(5);
        ar1.add(10);
        // ar1.add("Alex"); it will give us error because we defined the arraylist object to hold only integer values.
        ar1.add(15);
        System.out.println(ar1.size());
        System.out.println(ar1.get(1));

        for (int i = 0; i < ar1.size(); i++) {// using for loop:
            System.out.println(ar1.get(i));
        }
        System.out.println("###########################");


        // for each loop:
        for (int x : ar1) {//using for each loop:
            System.out.println(x);
        }
        System.out.println("###########################");


        // iterator:
        Iterator<Integer> x = ar1.iterator();
        while (x.hasNext()) {//using iterator:
            System.out.println(x.next());
        }



    }

}
