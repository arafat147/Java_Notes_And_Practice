package javaMentoring;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //basic for loop:
//        for(int i=0; i<=5; i++){
//            System.out.println("Loop value is "+i);
//        }

        System.out.println("*****************************");


        //nested for loop:
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number above 1 ");
        int number = sc.nextInt();

        for(int i =number ; i>=1 ; i--){

            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }



        for(int i = number; i>=1 ; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }




















    }
}
