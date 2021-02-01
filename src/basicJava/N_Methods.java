package basicJava;

public class N_Methods {
    //method is a block of code that only executes when it is called.
    // method mainly have 2 types: void and return: and they both can be parameterized and non-parameterized
    // return type: parameterized:
    public static int doAddition(int a , int b){
        int total = a + b;
        System.out.println("total is " + total);
        return total;
    }
    //return type: non parameterized:
    public static int doSummation(){
        int a = 50;
        int b = 80;
        int total = b - a;
        System.out.println(total);
        return total;

    }
    // void : parameterized:
    public static void doMultiply(int a, int b){
        int total = a*b;
        //System.out.println(total);
    }
    //void: non-parameterized:
    public static void doDivision(){
        int a = 50;
        int b = 10;
        int total = a/b;
        System.out.println(total);
    }


    public static void main(String[] args) {

//        N_Methods.doAddition(15,25);//to see what this method is returning, we need to print it.
//        System.out.println(N_Methods.doAddition(15,25));//now we can see in the console what it's returning. in this case it will return total;
//
//        System.out.println(doSummation());//we can only print return type methods. void methods cant be put inside the sout because it does not return anything.
//
//        N_Methods.doMultiply(10,5);
//        N_Methods.doDivision();

        System.out.println(N_Methods.doSummation());

    }
}
