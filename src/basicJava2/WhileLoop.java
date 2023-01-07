package basicJava2;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {


//        int number = 1;
//        while(number<=5){
//            System.out.println(" contestant number is " + number);
//            number++;
//        }
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter your number");
////        int i = sc.nextInt();
////        while (i >= 1) {
////            System.out.println("number of contestant " + i);
////            i--;
////        }
//
//        WhileLoop.calculator();

        WhileLoop.useSwitchCase();


    }



    public static void whileLoop(){
        int i = 1;
        while (i<=5){
            System.out.println("student number is " + i);
            i++;
        }
    }


//    public static void whileLoop() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter food number");
//        int foodNumber = sc.nextInt();
//
//        while (foodNumber != 0) {
//            String foodName;
//            switch (foodNumber) {
//                case 1:
//                    foodName = "pizza";
//                    break;
//                case 2:
//                    foodName = "burger";
//                    break;
//                case 3:
//                    foodName = "Sandwich";
//                    break;
//                default:
//                    foodName = "Not available";
//                    break;
//            }
//            System.out.println("your chosen food item is " + foodName);
//            System.out.println("Enter food number");
//            foodNumber = sc.nextInt();
//        }
//    }
//
//    public static void whileLoop2() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter row number");
//        int rownumber = sc.nextInt();
//        while (rownumber != 0) {
//
//        }
//
//    }
//
//    public static void foodMenu() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter menu number!");
//        int foodNumber = sc.nextInt();
//        while (foodNumber != 0) {
//            String name;
//            switch (foodNumber) {
//                case 1:
//                    name = "pizza";
//                    break;
//                case 2:
//                    name = "chicken";
//                    break;
//                case 3:
//                    name = "fish";
//                    break;
//                case 4:
//                    name = "mutton";
//                    break;
//                default:
//                    name = "not available";
//            }
//            System.out.println("your selected item is " + name);
//            System.out.println("Enter menu number!");
//            foodNumber = sc.nextInt();
//
//        }
//
//
//    }

    public static void useSwitchCase() {
        System.out.println("enter your order number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String foodName;
        while (number != 0) {
            switch (number) {
                case 1:
                    foodName = "vat";
                    break;
                case 2:
                    foodName = "dal";
                case 3:
                    foodName = "mach";
                    break;
                default:
                    foodName = "not available";
            }
            System.out.println("your desired food number is " + foodName);

        }
        System.out.println("enter your order number");
        number = sc.nextInt();
    }

    public static void calculator(){
        System.out.println("Welcome to my calculator! ");
        System.out.println("Please enter the first number");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        System.out.println("Great! now enter the second number");
        int secondNumber = sc.nextInt();
        int additionOfTwoNumber = firstNumber + secondNumber;
        int subtractionOfTwoNumber = firstNumber - secondNumber;
        int multiplicationOfTwoNumber = firstNumber * secondNumber;
        int divisionOfTwoNumber = firstNumber / secondNumber;
        System.out.println("addition of two number is " + additionOfTwoNumber);
        System.out.println("subtraction of two number is " + subtractionOfTwoNumber);
        System.out.println("multiplication of two number is " + multiplicationOfTwoNumber);
        System.out.println("division of two number is " + divisionOfTwoNumber);
        System.out.println("Thank you for using my calculator!");
    }



}
