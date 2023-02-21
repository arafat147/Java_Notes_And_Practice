package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.ArrayList;
import java.util.Collections;
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
        ar1.add(50);
        ar1.add(10);
        // ar1.add("Alex"); it will give us error because we defined the arraylist object to hold only integer values.
        ar1.add(158);
        ar1.add(0, 20);
        System.out.println(ar1.size());
        System.out.println(ar1.get(1));
        Collections.sort(ar1);// to sort arraylist elements
        System.out.println(ar1);
        System.out.println(ar1.contains(10));//to check if a value is available or not:

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
        Iterator<Integer> it = ar1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //To store Employee class objects into ArrayList: lets create an arrayList object with Employee class reference:
        ArrayList<Employee> e = new ArrayList<>();
        // create some employee objects:
        Employee e1 = new Employee("Alex", 25);
        Employee e2 = new Employee("James", 35);
        Employee e3 = new Employee("Tom", 28);
        //lets add these values inside arrayList object:
        e.add(e1);
        e.add(e2);
        e.add(e3);
        // to retrieve data:
        Iterator<Employee> it2 = e.iterator();
        while (it2.hasNext()) {
            Employee emp = it2.next();
            System.out.println(emp.name + " , " + emp.age);
        }


    }

}
