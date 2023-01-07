package basicJava;

import java.util.Scanner;

public class PracticeJava1 extends Thread{

     int value1;
     int value2;


    public static void addition(){
        int a = 20;
        int b = 30;
        int total = a + b;
        System.out.println("addition result is " + total);
    }
    public static int subtraction(){
        int a = 20;
        int b = 5;
        int total = a-b;
        System.out.println("subtraction result is " + total);
        return a;
    }

    public void multiplication(int number1, int number2){
        this.value1 = number1;
        this.value2 = number2;
        int total = number1 * number2;
        System.out.println("multiplication result is " + total);
    }

    public static String division(int number1, int number2){
        int total = number1/number2;
        System.out.println("division result is " + total);
        return "division must be whole number";
    }

    public static void scannerPractice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
    }

    public void run(){
        System.out.println("run this program first");
    }

    public static void main(String[] args) {
        PracticeJava1 pj1 = new PracticeJava1();
        pj1.multiplication(5,8);
        System.out.println(PracticeJava1.division(10,5));
        PracticeJava1.scannerPractice();
    }



}
