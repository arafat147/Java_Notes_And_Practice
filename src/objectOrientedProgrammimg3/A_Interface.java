package objectOrientedProgrammimg3;

public interface A_Interface {

    //  An interface is used for any service requirement specifications.
    // interface can have public, default and private modifiers only. but for private methods, we need to declare  the body.
    // for public and default modifiers, we ca not declare the method body. in general since interface is used for specifications only, private methods are not useful.
    private void doStuff(){
        System.out.println("this is do stuff method");
    }

    public void doAddition();

    void doMoreStuff();

}
