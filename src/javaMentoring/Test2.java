package javaMentoring;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter food number");
        int foodNumber = sc.nextInt();

        while (foodNumber != 0) {
            String foodName;
            switch (foodNumber) {
                case 1:
                    foodName = "pizza";
                    break;
                case 2:
                    foodName = "burger";
                    break;
                case 3:
                    foodName = "Sandwich";
                    break;
                default:
                    foodName = "Not available";
                    break;
            }
            System.out.println("your chosen food item is " + foodName);
            System.out.println("Enter food number");
            foodNumber = sc.nextInt();
        }
    }
}
