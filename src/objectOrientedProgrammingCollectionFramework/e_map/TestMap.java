package objectOrientedProgrammingCollectionFramework.e_map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    //key,value
    public static void main(String[] args) {
        HashMap<Integer, String> st = new HashMap<>();
        st.put(1,"Alex");
        st.put(2,"tom");
        st.put(3,"william");
        st.put(4,"james");

        System.out.println(st);
        System.out.println(st.get(2));

        for (Map.Entry<Integer, String> m : st.entrySet()){
            System.out.println("Key is: "+m.getKey() +" and Value is: " + m.getValue());
        }


    }

}
