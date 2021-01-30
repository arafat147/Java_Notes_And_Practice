package objectOrientedProgramming2.inheritance;

public class Mercedes extends VehicleSpecification { //lets say this is another child class and its also extending the same parent VehicleSpecification class.
    // Example of Hierarchical : both mercedes and bmw class is extending their same parent class VehicleSpecification.

    public void start(){
        System.out.println("Mercedes -- car start");
    }

    public void stop(){
        System.out.println("Mercedes -- auto stop feature");
    }

    public void ledLights(){
        System.out.println("Mercedes -- Smart led features");
    }

    public void autoPilot(){
        System.out.println("Mercedes -- Auto pilot feature");
    }

}
