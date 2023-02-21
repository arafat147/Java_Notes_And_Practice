package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.Arrays;
import java.util.Collections;

public class Array {

    // Definition: Arrays are used to store multiple values in a single variable, instead of declaring separate variables
    // for each value.
    public static void testArray(){
        int[] id = {12,52,56,36};
        System.out.println(id[0]);
        System.out.println(Arrays.toString(id));

        int[] a = new int[3];
        a[0] = 5;
        a[1] = 55;
        a[2] = 555;
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Declaration: Datatype + [] squareBraces + variableName = { .... };
        String[] cars = {"Volvo", "Audi", "Mercedes", "Bmw", "Honda"};
        for (int i=0; i<cars.length; i++){
            System.out.print(cars[i]+ " , ");
        }
        // to get a value of an array:
        System.out.println(cars[0]);
        // to get the length of an array:
        System.out.println(cars.length);
        //to get the output of the whole array:
        System.out.println(cars[0] + " " + cars[1] + " " + cars[2] + " " + cars[3] + " " + cars[4]);
        // another approach:
        System.out.println(Arrays.toString(cars));
        //Another approach:
        int[] a = new int[3]; // this is a static array. means, it has a fixed size.
        a[0] = 10;
        a[1] = 20;
        a[2] = 20;

        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println(Arrays.toString(a));

        System.out.println("***************************************************");

        // find smallest number in an array:

        int[] numbers = {510, 52, 45, 58, 69, 96, 47, 52, 1, 25, 35};
        //first we need to set an initial value: let's assume the 0th index value, 510 is the smallest:
        int smallest = numbers[0];//numbers[0] = 510.

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {//numbers[i] is 510, since i starts from 0. and we know smallest is 510 initially. since it is not true, it will terminate and i will increment and numbers[i] will be 52 which is < than 510 so it will store in the next line// will be
                smallest = numbers[i];// after comparing each value with the previously compared value it will store the most smallest value until the array iterates through all the numbers
            }
        }

        System.out.println("smallest value is " + smallest);

        // find biggest number in an array:
        // lets use the numbers array:

        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest number is " + largest);

        System.out.println("*****************************************************");
        testArray();
        System.out.println("*************************");


    }


}
