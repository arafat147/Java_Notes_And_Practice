package objectOrientedProgramming1;

public class B_Encapsulation_Test {

    public static void main(String[] args) {
        B_Encapsulation obj = new B_Encapsulation();

        obj.setMobileBrand("iPhone");// for calling the variables, we need to set the value first then get the value.
        System.out.println(obj.getMobileBrand());

        obj.setScreenSize(6);
        System.out.println(obj.getScreenSize());

        obj.setCarName("Tesla");
        System.out.println(obj.getCarName());



    }
}
