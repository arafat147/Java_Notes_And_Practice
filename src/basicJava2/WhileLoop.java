package basicJava2;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int i = sc.nextInt();
        while(i>=1){
            System.out.println("number of contestant " + i);
            i--;
        }

    }


}
