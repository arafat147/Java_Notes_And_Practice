package test;

import basicJava.D_StaticAndNonStaticVariableAndMethod;
import basicJava.E_AccessModifiers;
import basicJava2.UseEnum;

public class Test {
	
	
	

	public static void main(String[] args) {
		
				
		D_StaticAndNonStaticVariableAndMethod obj = new D_StaticAndNonStaticVariableAndMethod();
		System.out.println(obj.age);
		
		D_StaticAndNonStaticVariableAndMethod.car();
		
		
		//System.out.println(D_StaticAndNonStaticVariableAndMethod.age); //this variable is from the D_StaticVariableAndMethod class 
		
		// we are able to call this variable cz it has public and static keywords. 
		// meaning public static variables are accessible from different packages of the same class.
		
		// non static variables access:
		
		// D_StaticVariableAndMethod sv = new D_StaticVariableAndMethod();
		// non static variables can be accessed from the same package only.
		
		D_StaticAndNonStaticVariableAndMethod sv = new D_StaticAndNonStaticVariableAndMethod();
		
		
		// but since in the class D_StaticVariableAndMethod , char shirtSize is pulbic, it is accissible from other packages. like here:
		System.out.println(sv.shirtSize);// this variable came from the basic java package class D_StaticVariableAndMethod



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
