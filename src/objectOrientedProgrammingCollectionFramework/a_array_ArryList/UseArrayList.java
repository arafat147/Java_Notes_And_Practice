package objectOrientedProgrammingCollectionFramework.a_array_ArryList;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {

        int [] a = new int[3]; // this is a static array. means, it has a fixed size.
        a[0]=10;
        a[1]=20;
        a[2]=30;
        //a[3]=40;//this value will give us ArrayIndexOutOfBoundsException.
        System.out.println(a[0]);

        //dynamic array: ArrayList
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        System.out.println(ar.size());
        System.out.println(ar.get(2));


    }

}
