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
}
