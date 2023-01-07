package basicJava2;

import org.w3c.dom.ls.LSOutput;

public class UseTryCatch {

    public static void division(int a, int b){
        int total;
        try{
            total = a/b;
            System.out.println("result is " + total);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("this is arithmetic error");
        }

    }

    public static void main(String[] args) {
        UseTryCatch.division(5,0);
        System.out.println();

    }

}
