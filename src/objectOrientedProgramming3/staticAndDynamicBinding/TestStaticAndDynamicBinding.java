package objectOrientedProgramming3.staticAndDynamicBinding;

public class TestStaticAndDynamicBinding {

    public static void main(String[] args) {



        ChildProperty cd = new ChildProperty();

        // these 2 methods are public-static in parents class. that's why we can get the access of it using child class name.
        // static binding.
        ChildProperty.fatherCar();
        ChildProperty.motherCar();
        // this method is final in parent class but have public modifier- so this is also Static binding
        cd.fatherTranscript();


        //these are overridden methods in child class: Dynamic Binding.
        cd.fatherHouse();
        cd.fatherWalletBalance();

        // these methods are from child class:
        cd.childBusiness();
        cd.childBusiness("Verizon","Queens,NY");//this is method overLoading
        cd.childCar();







    }

}
