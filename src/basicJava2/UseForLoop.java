package basicJava2;

import java.util.Scanner;

public class UseForLoop {

    //for loop: if u know exactly how many time u want to repeat then you should use for loop.



    //structure:
    //for(initialization(which is starting point) + ; + condition (end point) + ; + increment/decrement){..statement..}


    // here is the loop life cycle:
    // in for loop, initialization executes only once.
    //then it goes to condition,
    //after condition it goes to loop body.
    // from loop body, it prints the loop body statement
    // from there it goes to increment/decrement part
    // from there it comes to condition part again. and repeats as same
    //so we can say that-
    //1.initialization-->2.condition-->3.loop body-->4.increment/decrement-->from there it goes to condition again and follow 1,2,3,4 points in this line

    public static void basicFroLoop(){
        for(int i=0; i<5;i++){
            System.out.println(" hello " + i);
        }
    }
    // find even/odd numbers:
    public static void findEvenOrOdd(){
        for(int i = 0; i<=50; i++){
            if(i%2==0){
                System.out.println(i + " is an even number");
            }else{
                System.out.println(i + " is an odd number");
            }
        }

    }
    // make patterns using for loop:
    public static void makePattern(){

        //*****
        //****
        //***
        //**
        //*

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Row Number");
        int rowNumber= input.nextInt();

        for (int i= rowNumber; i>= 1; i--){
            for (int j =1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void makePattern2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter desired row number please");
        int number = sc.nextInt();
        while(number != 0) {
            for (int i = number; i >= 1; i--) {

                for (int j = number; j >= i; j--) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            System.out.println("Enter desired row number please");
            number = sc.nextInt();
        }

    }



    public static void main(String[] args) {

//        UseForLoop.basicFroLoop();
//        UseForLoop.findEvenOrOdd();
//        UseForLoop.makePattern();
        UseForLoop.makePattern2();





    }


}
