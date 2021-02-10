package objectOrientedProgrammingCollectionFramework.b_linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(5);
        li.add(10);
        li.add(15);
        li.add(20);
        li.add(25);
        System.out.println(li);

        li.add(0, 2);
        System.out.println(li);
        li.addFirst(1);
        System.out.println(li);
        li.addLast(30);
        System.out.println(li);
        System.out.println(li.get(4));

        System.out.println("#####");
        for (int i=0; i<li.size(); i++){
            System.out.println(li.get(i));
        }
        System.out.println("#####");
        for (int x : li) {
            System.out.println(x);
        }
        System.out.println("#####");
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}
