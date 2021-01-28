package objectOrientedProgramming1;

public class B_Encapsulation {
    // Encapsulation :Encapsulation in Java is a mechanism of wrapping the data. so that it can not be accessed directly from other class.
    // advantage: A class can have total control over what is stored in its fields.


    private String mobileBrand;
    private int screenSize;

    //getter method: return type:
    public String getMobileBrand(){
        return mobileBrand;
    }
    //setter method: non return type:
    public void setMobileBrand(String mobileBrand){
        this.mobileBrand = mobileBrand;
    }



    public int getScreenSize(){
        return screenSize;
    }
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

}
