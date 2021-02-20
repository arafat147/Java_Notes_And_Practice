package objectOrientedProgrammingCollectionFramework.c_set_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestHashSet {


    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.addAll(Arrays.asList(new Integer[]{1,2,3,4,7,8,9}));

        Set<Integer> second = new HashSet<>();
        second.addAll(Arrays.asList(new Integer[]{1,2,3,5,6,8,9,10}));


        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        System.out.println("After union operation: " + union);

        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println("After intersection operation: " + intersection);


    }

}
