package objectOrientedProgrammingCollectionFramework.d_set_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnHashSet {

    /**
     * Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet
     * class and implements Set interface.
     *
     * The important points about Java HashSet class are:
     *
     * HashSet stores the elements by using a mechanism called hashing.
     * HashSet contains unique elements only. Duplicate values don't get added when printed.
     * HashSet allows null value.
     */
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("A");// this will not be added in the hashset object. if we print it only one "A" will be added.
        hs.remove("A");
        System.out.println(hs);
        System.out.println();
        for (String a : hs){
            System.out.println(a);
        }
        System.out.println();
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        Set<String> hp = new HashSet<>();
        hp.add("B");
        hp.add("C");
        hp.add("F");
        hp.add("G");
        hp.addAll(hs);// addAll to add another hashset list:
        System.out.println(hp);
        System.out.println();

        // To Do Union and Intersection of 2 HashSet Objects:

        Set<Integer> first = new HashSet<>();
        // another approach to add
        first.addAll(Arrays.asList(new Integer [] {1,3,5,6,7,8,9}));
        System.out.println(first);
        System.out.println();

        Set<Integer> second = new HashSet<>();
        second.addAll(Arrays.asList(new Integer[]{2,4,6,7,8,9,10}));
        System.out.println(second);
        System.out.println();

        //UNION: addAll
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);
        System.out.println();

        //INTERSECTION: retainAll
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);




    }


}
