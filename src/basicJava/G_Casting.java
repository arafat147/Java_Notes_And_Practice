package basicJava;

public class G_Casting {

	public static void main(String[] args) {
		
		int age = 30;
		double newAge = (double) age;
		System.out.println(newAge);
		
		double salary = 6500.99;
		int newSalary = (int) salary;
		System.out.println(newSalary);
		
		String ssn = "123456";
		int newSsn = Integer.parseInt(ssn);
		System.out.println(newSsn);
		
		int newSsn2 = Integer.valueOf(ssn);
		System.out.println(newSsn2);

		int rollNumber= 12;
		double newNumber = (double)rollNumber;
		System.out.println(newNumber);

		double mobilePrice = 1200.99;
		int newMobilePrice = (int) mobilePrice;
		System.out.println(newMobilePrice);
		

	}

}
