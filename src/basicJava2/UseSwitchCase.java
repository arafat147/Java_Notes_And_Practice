package basicJava2;

import java.util.Scanner;

public class UseSwitchCase {


    public static void switchMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your food number");
        int number = sc.nextInt();
        String foodName;
        while (number != 0) {
            switch (number) {
                case 1:
                    foodName = "Burger";
                    break;
                case 2:
                    foodName = "sandwich";
                    break;
                case 3:
                    foodName = "pizza";
                    break;
                default:
                    foodName = "your food number is not valid";
                    break;
            }
            System.out.println("your chosen food is " + foodName);
            number=sc.nextInt();
        }

    }
    public static void main(String[] args) {
        UseSwitchCase.switchMethod();
    }
}
