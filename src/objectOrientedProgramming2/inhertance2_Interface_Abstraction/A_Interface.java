package objectOrientedProgramming2.inhertance2_Interface_Abstraction;

public interface A_Interface { // an interface can Extend multiple Interfaces,but can not extend class. also an interface
    // can not implement another interface

    // interface is used for any service requirement specifications.
    // interface can have public, default and private modifiers only. but for private methods, we need to declare  the body.
    // for public and default modifiers, we ca not declare the method body. in general since interface is used for specifications only,
    // we can create private methods but private methods are not useful since interface is used for future mostly.
    // protected methods are not allowed in interface.
    // we can not create constructors of interface


    private void doStuff(){
        System.out.println("this is do stuff method");
    }

    public void truckEngine();

    public void truckCapacity();

    // in interface, variables must be initialized.
     String className = "Interface ";

   //int age;


}
