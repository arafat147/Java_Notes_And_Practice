package objectOrientedProgramming3.staticAndDynamicBinding;

public class ParentProperty {

    //if a parent class methods are static,final or private then child class can not override them.

    static void fatherCar() {
        System.out.println("father has a BMW car");
    }

    public static void motherCar() {
        System.out.println("mother has a Mercedes car");
    }

    private void fatherAccount() {
        System.out.println("father account number is - ACC10253654 ");
    }

    public final void fatherTranscript() {
        System.out.println("fathers Transcript is not accessible");
    }


    public void fatherHouse() {
        System.out.println("father has 4 houses");
    }

    public void fatherWalletBalance() {
        System.out.println("father's balance is 10,000 dollars.");
    }


}
