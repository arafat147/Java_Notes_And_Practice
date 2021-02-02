package javaMentoring2;

public abstract class Parent extends GrandParent {

    public void parentCar(){
        System.out.println("Parent has 4 cars");
    }

    public void parentBalance(){
        System.out.println("1 million dollars");
    }

    public abstract void parentAccNum();

    private String ssn = "123456789";
}
