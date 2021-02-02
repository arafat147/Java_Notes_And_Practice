package javaMentoring2;

public class Encapsulation {

    public String name = "alex";

    private String carBrand;
    private int quantity;


    //getter : is return type but non parameterized:
   //   private String carBrand;

    public int getQuantity(){
        return quantity;
    }

    //setter : is non return type but parameterized:
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
