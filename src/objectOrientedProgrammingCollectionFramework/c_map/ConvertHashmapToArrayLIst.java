package objectOrientedProgrammingCollectionFramework.c_map;

import java.util.*;

public class ConvertHashmapToArrayLIst {

    public static void main(String[] args) {
        HashMap<Integer, String> company = new HashMap<>();
        company.put(185,"google");
        company.put(120,"yahoo");
        company.put(138,"amazon");
        company.put(244,"ebay");

        System.out.println(company.size());
        System.out.println();

        for (Map.Entry m : company.entrySet()){
            System.out.println(m.getKey() + " : " +m.getValue());
        }
        System.out.println();

        ArrayList<Integer> key = new ArrayList<>(company.keySet());
        Collections.sort(key);//to sort the above keys:
        Iterator<Integer> it = key.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();

        ArrayList<String> value = new ArrayList<>(company.values());
        Collections.sort(value);// to sort the above values:
        Iterator<String> it2 = value.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }





    }
}
