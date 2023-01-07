package basicJava;

import java.util.Scanner;

public class I_Scanner {

	public static void useScanner(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Your name is " + name);
		System.out.println("Thanks for entering your name. now please enter your age ");
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
	}
	public static void scanner(){

		System.out.println("enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("your name is " + name + " and your age is " + age);
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name = sc.nextLine();
//		System.out.println("your name is " + name);

//		I_Scanner.useScanner();
		I_Scanner.scanner();
		
	}



}
