package objectOrientedProgramming2.inheritance;

public class Test_Inheritance {

    public static void main(String[] args) {

        // VehicleSpecification extends TransportAuthority: example of single level inheritance.
        VehicleSpecification v1 = new VehicleSpecification();
        v1.carBlueprint();// from its parent class - TransportAuthority.
        v1.busBlueprint();// from its parent class - TransportAuthority.
        v1.start(); // from VehicleSpecification
        v1.stop(); // from VehicleSpecification
        System.out.println("###################");

        // Bmw extends VehicleSpecification: example of multi level inheritance.
        Bmw b1 = new Bmw();
        b1.start(); // this will call the method from bmw class cz this method is over ridden from the parent class.
        b1.stop(); // this is from parent class.
        b1.engine(); // from parent class.
        b1.cruiseControl();// Bmw
        b1.laneDeparture();// Bmw
        b1.theftSafety(); // Bmw
        b1.carBlueprint(); // from TransportAuthority class.
        System.out.println("####################");

        // Mercedes extends VehicleSpecification: example of Hierarchical inheritance.
        // both Mercedes and Bmw extends their same parent class VehicleSpecification.
        Mercedes m1 = new Mercedes();
        m1.start();// this will call the method from Mercedes class cz this method is over ridden from the parent class.
        m1.autoPilot(); // Mercedes
        m1.carBlueprint(); // from TransportAuthority class.

        System.out.println("###################");
        // To understand static binding and dynamic binding, follow this link :
        // https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/


        // **Type Casting**> Top casting
        // a parent class can refer to child class object.
        // only over ridden methods of child class and parent class methods will be accessible. if parent class extends another class,
        // like here, VehicleSpecification extends TransportAuthority class, then in that case, we can call the property inherited by
        // VehicleSpecification class in here.
        VehicleSpecification vs = new Bmw();
        vs.start(); // this is a over ridden method. so when it's called it will print the over ridden method which is inside bmw.
        vs.stop(); // from VehicleSpecification class.
        vs.carBlueprint(); // from TransportAuthority class bcz it is extended by VehicleSpecification.

        //**> Down Casting:
        // when a child class refers to the parent class object , it's called down casting.
        // although the below code is perfectly casted but it will give us exception. bcz child class can not refer to parent class object.
        Bmw b2 =(Bmw) new VehicleSpecification();
        b2.cruiseControl();//this will compile but in runtime it will give exception.


    }



}
