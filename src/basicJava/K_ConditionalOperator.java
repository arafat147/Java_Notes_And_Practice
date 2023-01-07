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

    public static void operator() {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        while (age != 0) {
            if (age >= 18 && age <= 65) {
                System.out.println("you are eligible to vote this year");
            } else if (age < 18) {
                int x = 18 - age;
                System.out.println("you have to wait " + x + " more year to vote");
            } else if (age > 65) {
                int y = age - 65;
                System.out.println("you are " + y + " year over the limit to vote");
            } else {
                System.out.println("your voting app is not working");
            }

            age = sc.nextInt();
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
            number = sc.nextInt();
        }

    }

    public static void practiceLoop(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        while (number !=0){
            if (number<=50){
                System.out.println("Grade D");
            }else if (number <=60){
                System.out.println("Grade C");
            }else if (number <=70){
                System.out.println("Grade B");
            }
            number = sc.nextInt();
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

//        K_ConditionalOperator.practiceLoop();
        K_ConditionalOperator.operator();

    }

}
