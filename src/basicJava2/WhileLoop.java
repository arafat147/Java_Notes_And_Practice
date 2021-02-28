package basicJava2;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {


//        int number = 1;
//        while(number<=5){
//            System.out.println(" contestant number is " + number);
//            number++;
//        }







        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int i = sc.nextInt();
        while(i>=1){
            System.out.println("number of contestant " + i);
            i--;
        }

    }
    public static void whileLoop(){
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
