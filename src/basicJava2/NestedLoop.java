package basicJava2;

import java.util.Scanner;

public class NestedLoop {
    public static void diamond() {

        for (int i = 5; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }



    public static void main(String[] args) {



    }
}
