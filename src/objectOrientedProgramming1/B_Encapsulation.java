package objectOrientedProgramming1;

public class B_Encapsulation {
    // Encapsulation :Encapsulation in Java is a mechanism of wrapping the data -
    // so that it can not be accessed directly from other class.
    // advantage: A class can have total control over what is stored in its fields.

    //variable:
    private String mobileBrand;

    //getter method: return type and non parameterized
    public String getMobileBrand(){
        return mobileBrand;
    }
    //setter method: non return type and parameterized
    public void setMobileBrand(String mobileBrand){
        this.mobileBrand = mobileBrand;
    }


    //variable:
    private int screenSize;
    //getter method: return type and non parameterized
    public int getScreenSize(){
        return screenSize;
    }
    //setter method: non return type and parameterized
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }



    //variable:
    private String carName;
    //getter method: return type and non parameterized
    public String getCarName(){
        return carName;
    }
    //setter method: non return type and parameterized
    public void setCarName(String carName){
        this.carName = carName;
    }


    //Practice:
    private String carBrand;


    public String getCarBrand(){
        return carBrand;
    }
    public void setCarBrand(String carBrand){
        this.carBrand = carBrand;
    }

    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    private double salary;
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    private String carEngine;
    public String getCarEngine(){
        return carEngine;
    }
    public void setCarEngine(String name){
        this.carEngine=name;
    }

}
