package objectOrientedProgramming1;

public class A_Singleton {
    // Singleton: if any java class is allowed to create only one object, such type of class is called singleton class
    // Example: Runtime class ,BusinessDelegate class, ServiceLocator class
    // Advantage of Singleton class: to improve memory utilization. meaning -
    // suppose we have 100 member who wants an object for this singleton class. so rather than creating 100 object for each member,
    // we can create one object and distribute it to all. that way the memory utilization will be done as well as the performance.

    // How to create our own singleton class.
    // 1. making our constructor private.
    // 2. creating a private static singleton class object
    // 3. create a public static singleton class getInstance() method to return the object.

     String stName = "Alex";
     static int age = 25;

//    private A_Singleton(){
//
//    }
//
//
//
//    private static A_Singleton obj = new A_Singleton();
//
//    public static A_Singleton getInstance(){
//        return obj;
//    }

    private A_Singleton(){

    }
    private static A_Singleton obj = new A_Singleton();
    public static A_Singleton getInstance(){
        return obj;
    }






    public  void doStuff(){
        int a = 10;
        int b= 20;
        int total = a+b;
        System.out.println(total);
    }

    public static void doMoreStuff(){
        System.out.println("laskjdhflkjasd");
    }

    public static void main(String[] args) {
        //A_Singleton obj2 = new A_Singleton("James williams");
    }

}
