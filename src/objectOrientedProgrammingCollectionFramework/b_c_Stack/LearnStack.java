package objectOrientedProgrammingCollectionFramework.b_c_Stack;

import java.util.Stack;

public class LearnStack {
    /**
     * Stack:
     * The stack is a linear data structure that is used to store the collection of objects.
     * It is based on Last-In-First-Out (LIFO) order.
     * https://www.javatpoint.com/java-stack#:~:text=The%20stack%20is%20a%20linear,store%20the%20collection%20of%20objects.
     */

    public static void main(String[] args) {

        // Last-In-First-Out (LIFO):

        Stack<String> booksNames = new Stack<String>();
        //to check if the stack object is empty:
        boolean result = booksNames.empty();
        System.out.println("Stack is empty? : " + result);
        // *** when we add values in stack, the first value goes in the bottom and next values goes on top of it serially:
        booksNames.push("The best of me");
        booksNames.push("The lucky One");
        booksNames.push("The Choice");
        booksNames.push("Safe Heaven");
        // fetching values:
        System.out.println(booksNames);
        // *** pop method will remove the top value from the stack.
        System.out.println(booksNames.pop()); // we can print the pop method to see which value it is removing: here it will remove "Safe Haven"
        System.out.println(booksNames);
        System.out.println(booksNames.pop());// here it will remove "The Choice".
        System.out.println(booksNames);
        System.out.println(booksNames.contains("The Choice"));
        booksNames.push("The Last Song");
        System.out.println(booksNames);
        // *** peek method: it only shows the top element but doesn't remove it:
        System.out.println(booksNames.peek());
        System.out.println(booksNames);


    }


}
