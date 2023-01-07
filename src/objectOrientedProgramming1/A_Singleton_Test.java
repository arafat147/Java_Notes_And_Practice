package objectOrientedProgramming1;

public class A_Singleton_Test {

    public static void main(String[] args) {

        A_Singleton sc = A_Singleton.getInstance();
        sc.stName = "James";
        sc.doStuff();
        A_Singleton.age = 30;
        A_Singleton.doMoreStuff();
        //A_Singleton sc = A_Singleton.getInstance();
        sc.stName="Williams";
        A_Singleton.age = 50;

        //A_Singleton sc2 = A_Singleton.getInstance();



    }

}
