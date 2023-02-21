package objectOrientedProgrammingCollectionFramework.d_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    //Pririty queue also follows the FIFO(First In First Out) order.

    public static void main(String[] args) {


        PriorityQueue<String> st = new PriorityQueue<>();
        st.add("Alex");
        st.add("Hunter");
        st.add("James");
        st.add("Williams");
        st.add("Nancy");
        st.add("Britney");
        System.out.println("P.Queue size is: "+st.size());
        System.out.println(st);
        //***peek(): to see the front in the queue:
        System.out.println("Peek: " + st.peek());
        System.out.println("After Peek : " + st);
        //***poll(): to remove the front element and return it.
        System.out.println("Poll: " + st.poll());
        System.out.println("After Poll- P.Queue: " + st);

        System.out.println();
        //Fetching Values using for each loop:
        for (String a: st){
            System.out.println(a);
        }
        System.out.println();
        //Iterating through the queue object:
        Iterator<String> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
