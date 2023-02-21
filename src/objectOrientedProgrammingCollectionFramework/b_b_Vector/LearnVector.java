package objectOrientedProgrammingCollectionFramework.b_b_Vector;

import java.util.Iterator;
import java.util.Vector;

public class LearnVector {

    // Vector implements a dynamic array that means it can grow or shrink as required. Like an array,
    // it contains components that can be accessed using an integer index

    // They are very similar to ArrayList but Vector is synchronized and has some legacy method that the collection
    // framework does not contain.It also maintains an insertion order like an ArrayList but it is rarely used in a
    // non-thread environment as it is synchronized and due to which it gives a poor performance in adding, searching,
    // delete and update of its elements.

    public static void main(String[] args) {


        Vector<Integer> vt = new Vector<Integer>();
        vt.add(2);
        vt.add(4);
        vt.add(6);
        vt.add(8);
        vt.add(10);
        vt.add(12);
        System.out.println(vt);
        vt.remove(1);
        System.out.println(vt);
        System.out.println(vt.size());
        System.out.println(vt.get(4));
        System.out.println();
        vt.set(0,1);
        System.out.println(vt);
        for (int i = 0; i < vt.size(); i++) {
            System.out.println(vt.get(i));
        }
        System.out.println();
        for (int x : vt) {
            System.out.println(x);
        }
        System.out.println();
        Iterator<Integer> it = vt.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
        Vector<Employee> v1 = new Vector<Employee>();
        Employee e1 = new Employee("Alex",25);
        Employee e2 = new Employee("Hunter",35);
        Employee e3 = new Employee("James",30);
        v1.add(e1);
        v1.add(e2);
        v1.add(e3);
        Iterator<Employee> it2 = v1.iterator();
        while(it2.hasNext()){
            Employee emp = it2.next();
            System.out.println(emp.name + " : " +emp.age);
        }



    }


}
