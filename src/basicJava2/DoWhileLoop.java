package basicJava2;

import java.util.Scanner;

public class DoWhileLoop {





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        do{
            System.out.println("number of player is " + number);
            number--;
        }while(number>=1);

        int i = 1;
        do {
            System.out.println("player number is " + i);
            i++;
        }while(i<=5);

        int x = 5;
        do {
            System.out.println("student number is " + x);
            x++;
        }while (x>=1);

    }


}
