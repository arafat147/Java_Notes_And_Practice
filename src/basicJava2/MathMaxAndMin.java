package basicJava2;

public class MathMaxAndMin {

    public static int biggestNumber(){
        int a = 30;
        int b = 40;
        int c = 50;
        return (Math.max(Math.max(a,b),c));
    }

    public static int smallestNumber(){
        int a = 30;
        int b = 40;
        int c = 50;
        return (Math.min(Math.min(a,b),c));
    }

    public static void main(String[] args) {

        System.out.println(MathMaxAndMin.biggestNumber());
        System.out.println(MathMaxAndMin.smallestNumber());

    }
}
