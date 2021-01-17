package javaMentoring;

public class Casting {
	
	
	static String stName = "Williams";
	
	private static int zipcode = 11421;
	
	
	public static void demoMethod() {
		System.out.println("this is a static method");
	}
	
	double tvsize = 65.5;
	

	public static void main(String[] args) {
		
		int age = 25;
		double newAge = (double) age;
		System.out.println(newAge);
		
		double fee = 500.75;
		int newFee = (int) fee;
		System.out.println(newFee);

		//static - keyword
		
		Casting.stName = "James";
		
		System.out.println(Casting.stName);
		Casting.demoMethod();
		
		Casting cs = new Casting();
		
		
		
		
		System.out.println(cs.tvsize);
		
		Casting.zipcode = 11069;
		
	}

}
