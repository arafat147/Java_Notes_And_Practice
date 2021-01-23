package basicJava;

import java.util.Scanner;

public class K_ConditionalOperator {

    public static void ifElse() {
        //&& (both condition needs to meet to print)
        int number1 = 50;
        int number2 = 60;
        if (number1 == 50 && number2 == 60) {//for && operator, both condition needs to be true to execute the block.
            System.out.println("condition is true in && Operator");
        } else {
            System.out.println("condition is false");
        }

        // or || operator.if either condition is true it will go to print
        if (number1 == 50 || number2 == 50) {
            System.out.println("condition is true in || Operator");
        }
    }

    public static void ifElse2(int age) {

        if (age >= 18 && age <= 65) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote!");
        }

    }

    public static void nestedIfElse() {
        //nested if else:
        int a = 25;
        int b = 30;
        if (a == 25 || a == 30) {
            System.out.println("this block will execute perfectly");
            if (a > 20 || b > 20) {
                System.out.println("both values are greater than 20");
            } else {
                System.out.println("both values are not greater than 20");
            }
        } else {
            System.out.println("condition did not meet as wanted");
        }
    }

    public static void ifElseIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your number?");
        int number = sc.nextInt();
        while (number != 0) {
            if (number <= 50) {
                System.out.println("your grade is D");
            } else if (number <= 60) {
                System.out.println("your grade is C");
            } else if (number <= 70) {
                System.out.println("your grade is B");
            } else if (number <= 80) {
                System.out.println("your grade is B+");
            } else if (number <= 93) {
                System.out.println("your grade is A");
            } else if (number >= 93) {
                System.out.println("your grade is A+");
            }
            number = sc.nextByte();
        }

    }

    public static void main(String[] args) {
        // Use if to specify a block of code to be executed,
        // if a specified condition is true. Use else to specify a block of code to be executed,
        // if the same condition is false.


//       K_ConditionalOperator.ifElse();
//       K_ConditionalOperator.nestedIfElse();
//       K_ConditionalOperator.ifElse2(20);
//       K_ConditionalOperator.ifElseIf();

    }

}
