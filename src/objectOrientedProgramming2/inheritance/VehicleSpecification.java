package objectOrientedProgramming2.inheritance;

public class VehicleSpecification extends TransportAuthority{ //let's say this is the parent class. and it's extending grand parent class TransportAuthority.

    public  void start(){
        System.out.println("Vehicle -- start method");
    }
    public void stop(){
        System.out.println("Vehicle -- stop method");
    }
    public void brake(){
        System.out.println("Vehicle -- brake method");
    }
    public void engine(){
        System.out.println("Vehicle -- engine method");
    }

}
