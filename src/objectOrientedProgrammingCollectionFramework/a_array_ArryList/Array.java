package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

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
        System.out.println(cars[0] + " " + cars[1]+" " + cars[2] + " " +cars[3]+" " + cars[4]);



        //Another approach:
        int [] a = new int[3]; // this is a static array. means, it has a fixed size.
        a[0]=10;
        a[1]=20;
        a[2]=30;

        System.out.println(a[2]);


    }




}
