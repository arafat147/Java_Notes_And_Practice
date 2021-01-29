package objectOrientedProgrammimg3.inheritance;

public class Bmw extends VehicleSpecification { // let's say this is the child class and extending the parent class VehicleSpecification.

        // Inheritance is a mechanism in which one class acquires the property of another class.
        // It is useful for code re usability: reuse attributes and methods of an existing class when you create a new class.
        // Here, Bmw is child class and since it's extending VehicleSpecification Class, so this is the parent class.

    public void start() {

        // This is called method overriding. we are over riding the start method of parent class.
        // But when we will run this method, it will print this method body. this is the rule for over riding.
        // When a child class over rides the parent class methods, then the child class method will get executed.

        System.out.println("BMW -- has auto start");
    }

    public void theftSafety(){
        System.out.println("Bmw -- theft safety feature");
    }

    public void laneDeparture(){
        System.out.println("Bmw -- lane departure feature");
    }

    public void cruiseControl(){
        System.out.println("Bmw -- cruise control system");
    }




    // these 2 examples are method over loading. we can use same method name but with different arguments.
    public void doStuff(){
        System.out.println(5+5);
    }
    public void doStuff(int age){
        System.out.println("age is " + age);
    }

}
