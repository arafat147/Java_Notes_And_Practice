package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestAndPractice {

    public static void main(String[] args) {


        int [] id = new int[5];
        id[0] = 25;
        id[1] = 35;
        id[2] = 45;
        id[3] = 55;

        System.out.println("id numbers are : "+ id[0] + " " + id[1] + " " + id[2] + " " + id[3]);
        System.out.println(Arrays.toString(id)); // another approach of retrieving array value:

        for (int i=0; i<id.length; i++){
            System.out.print(id[i] + " ");
        }
        System.out.println();

        int [] age = {5,10,20,30,2,1,40};
        int smallestNumber = age[0];
        for (int i=0; i<age.length; i++){
            if(age[i]<smallestNumber){
                smallestNumber = age[i];
            }
        }

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
        ar.add(10);
        ar.add(15);
        ar.add(20);
        ar.add(25);
        System.out.println(ar);

        for (int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();

        for (int x : ar){
            System.out.print(x + " ");
        }
        System.out.println();

       Iterator<Integer> it  = ar.iterator();
       while(it.hasNext()){
           System.out.print(it.next() + " ");
       }
        System.out.println();






    }






}
