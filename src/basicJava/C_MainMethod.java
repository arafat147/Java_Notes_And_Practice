package basicJava;

public class C_MainMethod {
	
	//explanation of main method-
	
		//First- 
		/**
		 * whether we have the main method or not, or whether we have the main method according to the requirements or not, these 
		 * things will not be checked by the compiler. it will compile, which is the first part of running a program. so, after the compiler,
		 * comes  JVM . and it will be responsible for checking the main
		 * method. 
		 */
		//and Second-
		/**
		 * when jvm can not find the main method it will give us an exception such As : (Main method not found in class basicJava.TestClass1,
		 * please define the main method as: public static void main(String[] args). it means that jvm did not find the main method! )
		 * 
		 */
		
		
		//Why main method is called "main"?
		/**
		 * because this is the name which is configured inside JVM as "main". we can change the name of the main method 
		 * but it should be changed from JVM or JDK.
		 * 
		 */
		
		//why main method is public?
		/**
		 * first of all public is the access modifier. the reason it must be public for the main mrthod is
		 * because jvm always looks for the main method in a class and it runs or executes whatever conditions are inside the main method only,
		 * so to run or execute the main method from ANYWHERE by the JVM it is and must be given the public access modifier.
		 * 
		 */
		
		//why main method is static?
		/**
		 * firstly, if main method was not static, then as per rule of calling a non static method, we have to create an object of the class first.
		 * and we can call a static method by giving the ClassName.extension( here extension lets say is the object of this class)
		 * here's an example of a static and then a non-static method with its calling process:
		 * 
		 * public static void doExtension(){
		 * int age = 55;
		 * sysout(age);
		 * }
		 * 
		 * public void extension(){
		 * String name = "Alex";
		 * System.out.println(name);
		 * }
		 * 
		 * public static void main(String[]args){
		 * 
		 * MainMethod obj = new MainMethod();//we created this object to call the extension method.
		 * obj.extension;
		 * 
		 * MainMethod.doExtension;// since doExtension is a static method we could call it by it's classname.object name syntax
		 * 
		 * }
		 * 
		 * That's why - main() method is always static, so that the compiler and JVM can call it without the creation of an object. 
		 *
		 */
		
		//why main method is void?
		/**
		 * first we have to see who is calling the main method?- JVM right?. so if i call main method then i can expect some values and i can use 
		 * those values to the rest of the program but if main method return something to jvm , what will it do with that? nothing..
		 * thats why main method will not return anything to the JVM and this is the reason its VOID type.
		 * 
		 * */
		
		//(String [] args) ?
		/**
		 * 
		 * this is just a command line arguments meaning we are giving the main method a command.
		 * 
		 */
		//#Refference link - https://www.youtube.com/watch?v=by58arnoV4c.
		

	public static void main(String[] args) {
		
	}

}
