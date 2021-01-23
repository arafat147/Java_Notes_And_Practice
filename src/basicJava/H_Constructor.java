package basicJava;

public class H_Constructor {
	
	
//	public  H_Constructor() {
//		
//	}
	
	int age;
	double height;

	
	
	public H_Constructor(String name) {
		
		System.out.println("Student name is " + name);
		
	}
	
	
	public H_Constructor (String address, String zipCode) {
		
		System.out.println("Address is " + address + " and zip code is " + zipCode);
		
	}
	
	
	
	public H_Constructor (int newAge, double newHeight) {
		
		this.age = newAge;
		this.height = newHeight;
		
		System.out.println("Student age is " + this.age + " and student's height is " + this.height);
		
	}
	
	public static int doAddition() {
		
		int a = 10;
		int b= 5;
		
		return b;
		
	}
	
	public static void main(String[] args) {
	
//		H_Constructor obj1 = new H_Constructor("Alexa");
//
//		H_Constructor obj2 = new H_Constructor("Queens, NY", "11377");
//
//		H_Constructor obj3 = new H_Constructor(25, 6.5);

		System.out.println(H_Constructor.doAddition());;


	}

}
