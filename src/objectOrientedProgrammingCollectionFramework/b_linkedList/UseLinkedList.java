package objectOrientedProgrammingCollectionFramework.b_linkedList;

import java.util.LinkedList;

public class UseLinkedList {



    /* LinkedList:
    The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

    The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
    This means that you can add items, change items, remove items and clear the list in the same way.

    However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

    How does it stores data:
    The LinkedList stores its items in "containers." The list has a link to the first container and each container has a
    link to the next container in the list. To add an element to the list, the element is placed into a new container and
    that container is linked to one of the other containers in the list.


     */
    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<String>();
        //add:
        li.add("PO");
        li.add("BA");
        li.add("DA");
        li.add("QA");

        System.out.println("contents of linked list :" + li);
        //add first:
        li.addFirst("SDLC");
        System.out.println("contents of linked list :" + li);
        //add last:
        li.addLast("DEV");
        System.out.println("contents of linked list :" + li);
        //to change any specific index value:
        li.add(1,"ProductOwner");
        System.out.println("contents of linked list :" + li);
        //remove first:
        // li.removeFirst();
        //removeLast :
        // li.removeLast();
        //remove any specific index:
        li.remove(2);
        System.out.println("contents of linked list :" + li);

        System.out.println("************* printing value using for loop ******************");

        //printing values using for loop:
        for(int i=0; i<li.size();i++){
            System.out.println(li.get(i));
        }




    }


}
