package userinput;

import java.util.Scanner;

public class NamePromptApp {

	public static void main(String[] args) {

							//	1st exercise:	
							//		Scanner input = new Scanner(System.in);
							//
							//		System.out.println("What is your name?");
							//		String name = input.nextLine();
							//		System.out.println("Hello, " + name);
							//
							//		System.out.println("What is your age?");
							//		int age = input.nextInt();
							//
							//		input.close();
		
		// Demo
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter street address:");
		 
		int houseNumber = input.nextInt();
		String street = input.nextLine(); // instead of next(); which only reads to next space.
		 
		System.out.println("house number is " + houseNumber);
		System.out.println("street is " + street);
		
		input.close();
		
		
	}

}