package basicJava2;

import java.util.Scanner;

public class Test {


    public static void forLoop() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void loopTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number!");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        //forLoop();
        loopTest();
    }


}
