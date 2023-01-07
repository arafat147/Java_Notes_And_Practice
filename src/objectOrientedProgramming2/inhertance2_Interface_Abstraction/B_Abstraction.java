package objectOrientedProgramming2.inhertance2_Interface_Abstraction;

public abstract class B_Abstraction {

    //Abstraction : is the process of hiding certain details and showing only essential information to the user.
    //Abstraction can be achieved with either abstract classes or interfaces. in OOP, abstraction
    //is a process of hiding the implementation details from the user, only the functionality will be provided to the user

    //Abstract class:
    //If a class has at least one abstract method, then the class must be declared abstract.
    //If a class is declared abstract, it cannot be instantiated.
    //To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
    //If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

    //Abstract method: can only be used in an abstract class, and it does not have a body.

    public abstract void car();

    public abstract void electricCar();

    public void carEngine(){
        System.out.println("V6 engine");
    }

    // variables: variables can not be abstract in java
    String name = "alex";
    int age;





}
