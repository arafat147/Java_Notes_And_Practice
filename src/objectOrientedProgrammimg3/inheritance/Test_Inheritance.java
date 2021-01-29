package objectOrientedProgrammimg3.inheritance;

public class Test_Inheritance {

    public static void main(String[] args) {

        // Bmw extends VehicleSpecification: example of multi level inheritance.
        Bmw b1 = new Bmw();
        b1.start(); // this will call the method from bmw class cz this method is over ridden from the parent class.
        b1.stop(); // this is from parent class.
        b1.engine(); // from parent class.
        b1.cruiseControl();// Bmw
        b1.laneDeparture();// Bmw
        b1.theftSafety();
        System.out.println("####################");
        // VehicleSpecification extends TransportAuthority: example of single level inheritance.
        VehicleSpecification v1 = new VehicleSpecification();
        v1.carBlueprint();// from its parent class - TransportAuthority.
        v1.busBlueprint();// from its parent class - TransportAuthority.
        v1.start();
        v1.stop();


    }



}
