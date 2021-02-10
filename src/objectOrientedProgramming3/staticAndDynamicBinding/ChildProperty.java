package objectOrientedProgramming3.staticAndDynamicBinding;

public class ChildProperty extends ParentProperty {
    //reference: https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/

    // Static Binding means that - if a method in parent class static,final or private then child class can not override that method.
    // and compiler already knows that- that method in parent class is fixed, that's why here we could not override
    // fatherCar() ,motherCar(), fatherTranscript(), fatherAccount()  methods.
    // this type binding is also known as Compile time binding because compiler already knows that these methods are fixed and won't
    // be overridden.



//    public void fatherCar(){
//
//    }

//    public void motherCar(){
//
//    }

//    public final void fatherTranscript(){
//
//    }

//    private void fatherAccount(){
//        //this method is private so child class will not acquire this method anyway.
//    }

//**********************************************************************************************************************

    //Dynamic binding: In Dynamic binding compiler does not decide the method to be called.
    //Overriding is a perfect example of dynamic binding . it happens during the runtime.
    //During compilation, the compiler has no idea as to which print has to be called since compiler goes only by
    //referencing variable not by type of object and therefore the binding would be delayed to runtime and therefore
    //the corresponding version of print will be called based on type of object.

    public void fatherWalletBalance() {
        System.out.println("Child inherits fathers balance");
    }
    public void fatherHouse(){
        System.out.println("Child has father's house now");
    }


    public void childCar() {
        System.out.println("child have an Audi car");
    }

    public void childBusiness() {
        System.out.println("Child has his/her own business");
    }
    //this is called method overLoading:
    public void childBusiness(String businessName, String businessAddress) {
        System.out.println("child's business name is " + businessName + " and address is " + businessAddress);
    }
    public void doStuff(){
        System.out.println("djkasghh");
    }

}
