package strings;

import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		
		int numberOfMaids = 7;
		int numberOfMops = 7;

		if (numberOfMaids == numberOfMops) {
			System.out.println("They might get it clear in half a year.");
		}

		String shoeDescription = "Their shoes were clean and neat";

		if (shoeDescription.equals("Their shoes were clean and neat")) {
			System.out.println("This is odd, because, you know,");
			System.out.println("They hadn't any feet.");
		}

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a color, please.");
		String response = input.nextLine();

		if (response.toLowerCase().equals("red")) {
			System.out.println("Roses can be red. Also, lilies.");
		}

		// exploring substrings

		String name = "Columbus Ohio";
		System.out.println(name.substring(0, 8)); // prints Columbus
		System.out.println(name.substring(9)); // prints Ohio
		System.out.println(name.contains("ohio")); // prints false because of case

		System.out.println(name.indexOf("Ohio")); // prints 9 because it starts 9 characters into the string

		// Ask the user for her first name and last name. Use the length() method to tell her which is longer.
		
				
				System.out.println("What is your first and last name, please?");
				
				String firstName = input.next();
				String lastName = input.next();
				
				int firstNameLength = firstName.length();
				int lastNameLength = lastName.length();
				
				System.out.println("Hello, " + firstName + " " + lastName + "!");
				
				if (firstNameLength > lastNameLength) {
					System.out.println("Your fist name is longer.");
			}	else {
				System.out.println("Your last name is longer.");
					
				input.close();
				}
	}
}
