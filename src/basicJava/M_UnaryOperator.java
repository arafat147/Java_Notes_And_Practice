package basicJava;

public class M_UnaryOperator {

    public static void main(String[] args) {
        //increment: ++a, a++
        //decrement: --a, a--

//        int a = 5;
//        //pre increment: it happens before. meaning in the below line we wrote ++a inside the print line.
//        System.out.println(++a);// here it will add 1 before and then print the total as 1 +5.
//        //post increment: it happens later when we print the value. in the below line since we wrote a++, it will give the
//        // current value, and add 1 in the next print line.
//        System.out.println(a++);//here it did not add 1. it is saved for future.
//        a++;
//        System.out.println(a); //from line 23 it keeps the 1 and current value is 7. then on line 24, it adds another 1 with 7 and in the printline in 25, it gives us 8.


//        int b = 10;
//        System.out.println(++b); //11
//
//        System.out.println(b++); //11  +1
//
//        System.out.println(b--); //12  -1
//
//        System.out.println(--b); // 10
//

        int a = 10;
        System.out.println(a++);// prints 10 and saves 1 for future.
        System.out.println(a++);// it prints 11 bcz line 30 gets iterated and shows us 11 and keeps 1 for future.
        System.out.println(a++);// it will do same as above line. 12
        System.out.println(a);// 13
        System.out.println(a++);// 13

    }
}
