package javaMentoring;

public class Use_Constructor {
	
	public String name = "james";
	
	public Use_Constructor(String stName) {
		
		System.out.println("student name is " + stName);
		
		}
	
	public Use_Constructor(String address , String zipcode) {
		
		System.out.println("student address is " + address + " and student's zipcode is " + zipcode);
		
		}
	
	double wheelSize = 21.5;
	int engine = 4;
	float torque = 125.0124f;
	
	public Use_Constructor(double newWheelSize, int newEngine , float newTorque) {
		
		this.wheelSize = newWheelSize;
		this.engine = newEngine;
		this.torque = newTorque;
		
		System.out.println("wheel size is " + this.wheelSize + " , engine is " + this.engine + " and torque is " + this.torque);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Use_Constructor uc = new Use_Constructor("Alexa");
		
		Use_Constructor uc2 = new Use_Constructor("Manhattan", "10023");
		
		Use_Constructor uc3 = new Use_Constructor(19.5, 6, 200.98885f);
		
	}
	

}
