package basicJava;

public class D_StaticAndNonStaticVariableAndMethod {
	// reference: https://www.youtube.com/watch?v=Nw7NyvuwOTM

	//https://www.geeksforgeeks.org/difference-between-static-and-non-static-variables-in-java/#:~:text=Static%20variables%20reduce%20the%20amount%20of%20memory%20used%20by%20a%20program.&text=Static%20variables%20are%20shared%20among,that%20instance%20of%20a%20class.&text=Non%20static%20variable%20is%20like,only%20instance%20of%20a%20class.
	String name = "alex";

	int x = 10;

	//static variables:
	static int id = 25;

	public static int age = 25;

	static String stName = "Alex";

	public static void car() {
		id = 35; // static global variables are accessible inside static methods
		String name = "sadjfha";

		System.out.println("Car has 4 wheels");
		int i = 0;
	}

	public void doStuff(){
		System.out.println(id);// static global variables are accessible inside non static methods
		System.out.println(x);// non static global variables are accessible inside non static methods.
		System.out.println(name);
	}


	/**
	 * Static is a keyword in java to give access to the class to call certain methods and variables.
	 *
	 * static variables and methods can be called by class name.
	 *
	 *
	 * if a variable is static and defined as static String stName = "Alex"; the variable can be accessible from other classes
	 * just by the class name but not from other packages of the project.
	 *
	 * but if the variable is declared as public static int age = 25; it can be accessible by other packeges of the same project by class name.
	 *
	 * to check the examples, follow this main method and the Test class of test package
	 * @param args
	 */
	//non static variables:
	double salary = 5000.50;
	public char shirtSize= 'M';

	public void electricCar() {
		System.out.println("Electric car is more efficient than gasoline cars");
		D_StaticAndNonStaticVariableAndMethod snsv = new D_StaticAndNonStaticVariableAndMethod();//to call global variable inside a method:
		System.out.println("printed Shirt size is " + snsv.shirtSize);
//		D_StaticAndNonStaticVariableAndMethod.age = 30;// re assigning values of static global variable:
//		System.out.println("Re assigned age is " + D_StaticAndNonStaticVariableAndMethod.age);

	}

	/**
	 * non static variables and methods needs to be called by creating an object of the class.
	 * after creating an object of the class, we can call it by object name.
	 *
	 * if a non static variable is given public access modifier, it can be called from other packages of the same project
	 * otherwise in default it can onle be accessed within the same package.
	 *
	 * @param args
	 */

	public static void main(String[] args) {

		//calling static variable and methods:
		System.out.println(D_StaticAndNonStaticVariableAndMethod.stName);
		//System.out.println(D_StaticAndNonStaticVariableAndMethod.age);
		D_StaticAndNonStaticVariableAndMethod.car();

		//calling non static variable and methods
		D_StaticAndNonStaticVariableAndMethod sv = new D_StaticAndNonStaticVariableAndMethod();
		System.out.println(sv.salary);
		sv.electricCar();


	}

}
