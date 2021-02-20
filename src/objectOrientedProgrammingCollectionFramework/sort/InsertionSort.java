package objectOrientedProgrammingCollectionFramework.sort;

import objectOrientedProgrammingCollectionFramework.a_array_ArryList.Array;

import java.util.Arrays;

public class InsertionSort {
    // https://www.youtube.com/watch?v=yCxV0kBpA6M


    public static void main(String[] args) {
        // Array sorting: for array insertion sorting we need to divide the array into 2 sublist. sorted and unsorted.
        // in this array, 5 is considered as in the sorted sublist and 4,10,1,6,2 are considered as unsorted sublist.
        // and we will compare the elements starting from 4 and find a place for that inside the sorted sublist.
        // so the first loop will be increment order cz staring from 4, to compare the next value with sorted sublist we
        // need to increment to the next index values.
        // and after getting the first value from first loop, Second loop will be decrement order bcz it will compare to the left index values until the 0th index


        int[] a = {5, 4, 10, 1, 6, 2};

        for (int i=1; i<a.length; i++){ //First Loop: the initial value needs to start from 1 bcz 0th index is considered as default sorted list. and we use the
            // value of 0th index to start the sorting of other elements. that's why i=1; also the unsorted subLIst goes in increment order. that's why the first loop is incremented
            int temp = a[i];// then we need to store the value of the given array index into a variable(temp) so that we can compare it later with the sorted index values and assign.
            int j = i - 1;// the sorted sub list is starts at the 0th index. cz 1st index is the initial value of int i. so j value starts from i-1.
            while(j>=0 && a[j]>temp){ //Second Loop: we will see if index of j>=0 and value of that is > temp which is holding the value of index i or not. if so,
                a[j + 1] = a[j];// then we have to assign that value of a[j] to a[j+1]. meaning it will be stored to one index right.
                j--; // and j value will decrement until condition meets inside the while loop body.
            }
            a[j+1] = temp;// if the second loop condition does not satisfy then the value of a[j+1]th index will be the value of temp.

        }

        // after the loop we just need an iterator to print the array:
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }


        for(int i=1; i<a.length; i++){

            int temp = a[i];
            int j= i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;

        }


    }

}


