package objectOrientedProgrammingCollectionFramework.e_map;

import java.util.*;

public class UseHashMap {

    //Hashmap: is a class that implements Map interface.
    // it store elements as a pair of key and value.
    // it contains only unique values.
    // it may have only one null key but it can have multiple null values.

    public static void main(String[] args) {


        HashMap<Integer, String> hp = new HashMap<>();
        //to add values:
        hp.put(1, "Alex");
        hp.put(2, "Tom");
        hp.put(3, "James");
        hp.put(4, "Williams");
        //to remove using key:
        hp.remove(4);
        //to get a value using key:
        System.out.println(hp.get(1));
        System.out.println("-----");
        //to get all the keys:
        System.out.println(hp.keySet());
        //to get all the values only:
        System.out.println(hp.values());
        System.out.println(hp.containsKey(4));//to check if the given key is available or not:
        System.out.println(hp.containsValue("James"));//to check if the given value is available or not:
        System.out.println("Get the value of a set using key:" + hp.get(2));
        //to get all the values in general:
        System.out.println(hp);
        System.out.println("################## 1");

        //to get values using entryset() method: entry set method returns the set of elements together inside a hashmap object.
        System.out.println(hp.entrySet());

        System.out.println("##################");
        //to get all the key and values using for each loop:
        for (Map.Entry<Integer,String> m : hp.entrySet()) {
            System.out.println("Key " + m.getKey() + " Value is" + ": " + m.getValue());
        }
        for (Map.Entry<Integer,String> m : hp.entrySet()){
            System.out.print(m.getKey() + " : " + m.getValue());
            System.out.println();
        }


        //to use Employee class objects inside hashmap:
        // first we have to create a new hashmap object:
        HashMap<Integer, Employee> hp2 = new HashMap<>();

        //now lets create 3 employee info with Employee constructor:
        Employee e1 = new Employee("Alex", 27);
        Employee e2 = new Employee("James", 29);
        Employee e3 = new Employee("Tom", 30);
        // now lets assign these values to a key and insert inside the hp2 object:
        hp2.put(1, e1);
        hp2.put(2, e2);
        hp2.put(3, e3);

        for (Map.Entry<Integer, Employee> m : hp2.entrySet()) {
            // m.getkey() will give us the key. for values, we need m.getValue().name and m.getValue().age for printing
            // name and age of each Employee object.
            System.out.println(m.getKey() + " : " + m.getValue().name + " , " + m.getValue().age);

        }


        HashMap<Integer, String> st = new HashMap<>();
        st.put(1, "asdf");
        st.put(2, "fdas");
        st.put(3, "trwe");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.get(1));
        for (Map.Entry mp : st.entrySet()) {
            System.out.println(mp.getKey() + " : " + mp.getValue());
        }

        HashMap<Integer, Employee> st2 = new HashMap<>();

        Employee s1 = new Employee("Alex", 27);
        Employee s2 = new Employee("James", 29);
        Employee s3 = new Employee("Tom", 30);
        // now lets assign these values to a key and insert inside the hp2 object:
        hp2.put(1, s1);
        hp2.put(2, s2);
        hp2.put(3, s3);

        for (Map.Entry<Integer, Employee> m2 : st2.entrySet()) {
            System.out.println(m2.getKey() + " : " + m2.getValue().name + " ," + m2.getValue().age);
        }
        System.out.println("------------");
        ArrayList<Employee> value = new ArrayList<Employee>(st2.values());
        Iterator<Employee> it = value.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name + " : " + emp.age );
        }

    }


}
