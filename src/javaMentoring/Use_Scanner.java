package javaMentoring;

import java.util.Scanner;

public class Use_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age please! ");
		int age = sc.nextInt();
		System.out.println("your age is " + age);
		
		
		System.out.println("Enter your name please!");
		String name = sc.nextLine();
		System.out.println("your name is " + name);
		
		sc.close();
		

	}

}
