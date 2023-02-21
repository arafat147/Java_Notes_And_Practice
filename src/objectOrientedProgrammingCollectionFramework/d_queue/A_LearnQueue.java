package objectOrientedProgrammingCollectionFramework.d_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A_LearnQueue {

    /**
     * The Queue interface present in the java.util package and extends the Collection interface is used
     * to hold the elements about to be processed in FIFO(First In First Out) order.
     * <p>
     * Since Queue is an interface, objects cannot be created of the type queue. We always need a class
     * which extends this Queue in order to create an object.
     */

    public static void main(String[] args) {

        //  FIFO(First In First Out) :

        Queue<String> q = new PriorityQueue<>();
        //adding values to the queue:
        q.add("Alex");
        q.add("Tom");
        q.add("Williams");
        q.add("James");
        q.add("Nancy");
        q.add("Hunter");

        // to see the size of the queue:
        System.out.println("Size of the queue object is: " + q.size());
        System.out.println("Elements of Queue: " + q);


        // To Remove elements: it maintains First In First Out process:
        // to see which element it removed in the print line: we need to print the value of q.remove();
        System.out.println("Removed element is: " + q.remove());
        //q.remove();//this will remove the first element which is "Alex"
        System.out.println("After removing first time: " + q);
        // poll() method is also used to remove the head and return it.
        System.out.println(q.poll());
        System.out.println("After Polling first time: " + q);
        // peek() method allows to see the first element in the queue:
        System.out.println("After peeking first time: " + q.peek());

        System.out.println();
        //Fetching values from the queue using for each loop:
        for (String a : q) {
            System.out.println(a);
        }


        System.out.println();
        // using Iterator:
        Iterator<String> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("*************************************************************");
        testPriorityQueue();

    }

    public static void testPriorityQueue() {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(4);
        queue.add(6);
        queue.add(8);
        queue.add(10);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);

    }

}
