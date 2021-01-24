package basicJava2;

import org.w3c.dom.ls.LSOutput;

public class UseTryCatch {

    public static int division(int a, int b){
        int total = 0;
        try{
            total = a/b;
            System.out.println("result is " + total);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("this is arithmetic error");
        }
        return total;
    }

    public static void main(String[] args) {
        UseTryCatch.division(5,0);
    }

}
