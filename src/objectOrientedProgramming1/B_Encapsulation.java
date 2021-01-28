package objectOrientedProgramming1;

public class B_Encapsulation {
    // Encapsulation :

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
