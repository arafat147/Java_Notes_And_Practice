package basicJava;

public class A_Class {
	
	
	
	
	public static void main(String [] args) {
		
		D_StaticAndNonStaticVariableAndMethod.age= 25;
		
	}
	
	
	//What is A class?
	
	//Class is a blueprint to create objects.
	
	//A class can only have public , abstract or finally access modifier.
	//It can not be private or Protected because -
	
	
	
	//IF A CLASS IS PRIVATE :-
	//it can not be able to interact with real time objects.
	//If a top level class is private, it will be completely useless. 
	//ONLY INNER OR NESTED CLASS CAN BE PRIVATE NOT THE TOP LEVEL CLASS.
	
	//IF A CLASS IS Protected :-
	//As of the meaning of protected, a top level class cannot be protected because then it will not have access to the real time objects as well.
	//Inner classes or nested classes can be protected but not the top level class.
	
	//Refference: https://www.youtube.com/watch?v=AqwHLcGuZiQ
	
	// What is Wrapper class in java?
	// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
	// Sometimes you must use wrapper classes, for example when working with Collection objects, 
	// such as ArrayList, where primitive types cannot be used 
	
}
