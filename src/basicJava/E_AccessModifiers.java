package basicJava;

public class E_AccessModifiers {

	
	// What is access modifier:
	
	// A Java access modifier specifies which classes can access a 
	// given class and its fields, constructors and methods or objects of the class.
	
	// There are 4 types of access modifier in java:-
	
	// Public
    // Private
    // Protected
    // Default
		
    // Public:    We can call or use within the class where it is located and from any other class which might be outside
	// 			  of the package inside same project.
	// Private:   Only we can call or use within the class where it is located.
    // Protected: Only accessible from all the class of that particular package.
	// Default:   If a class has no modifier (the default, also known as package-private), it is visible only within
	// 			  its own package.

	// another modifier is strictfp:
	// strictfp is a modifier in the Java programming language that restricts floating-point calculations to
	// ensure portability. The strictfp command was introduced into Java with the Java virtual machine (JVM) version 1.2
	protected static String practice = "this is default variable";
	
	
	public static String carName = "BMW";
	
	public static void summation() {
		
		int a = 15;
		int b= 30;
		int total = a + b;
		System.out.println(total);
		
	}
	
	protected static void doMinus() {
		
		int a = 50;
		int b = 25;
		int total = a - b;
		System.out.println(total);
		
	}
	
	private void doMultiply() {
		
		int a = 5;
		int b = 10;
		int total = a * b;
		System.out.println(total);
		
	}

	
	public static void main(String[] args) {
		
		
		
		
		E_AccessModifiers am = new E_AccessModifiers();
		am.doMultiply();
		
	}

}
