package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.Arrays;

public class Array {

    // Definition: Arrays are used to store multiple values in a single variable, instead of declaring separate variables
    // for each value.


    public static void main(String[] args) {
        // Declaration: Datatype + [] squareBraces + variableName = { .... };
        String[] cars = {"Volvo", "Audi", "Mercedes", "Bmw", "Honda"};
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

        System.out.println("--------------------------------------------------------------------------");

        // find smallest number in an array:

        int[] numbers = {510, 52, 45, 58, 69, 96, 47, 52, 1, 25, 35};
        //first we need to set an initial value:
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
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





    }


}
