package objectOrientedProgramming2.inhertance2_Interface_Abstraction;

public class TestAbstractInterface extends B_Abstraction implements A_Interface, D_Interface2 {
    // ** Key Notes** about- extend and implement in Class and Interface.
    // a class can extend only one class but an interface can extend multiple interfaces.
    // class can never be implemented. so Class=extend ; interface=implement ;

    // Difference between extend and implement: for class:
    // a class can extend only one class but can implement multiple interfaces.
    // extend gives all property access to the class. by implementing interface we must need to implement the methods.

    // Difference between extend and implement: for Interface:
    // interface can Extend multiple interfaces.
    // interface can not Implement another interface.

    // from B_Abstract class(About car)
    @Override
    public void car() {
        System.out.println("car will have the following features");
    }

    @Override
    public void electricCar() {
        System.out.println("Electric car will have solar panels on top to charge the battery");
    }

    public void carEngine() {
        System.out.println("V8");
    }


    //from A_Interface(About truck)
    @Override
    public void truckEngine() {
        System.out.println("V12");
    }

    @Override
    public void truckCapacity() {
        System.out.println("truck can tow up to 8000lb ");
    }

    // from D_Interface2(About bike)
    @Override
    public void bike() {
        System.out.println("Bike name is yamaha");
    }

    @Override
    public void bikeEngine() {
        System.out.println("1200cc");
    }

    @Override
    public void bikeSeat() {
        System.out.println("bike will have 2 seats");
    }


    public static void main(String[] args) {


    }


}
