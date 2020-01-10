package strings;

import java.util.Scanner;

public class StringsPractice {

	public static void main(String[] args) {

		// Ask user for a password that is 8 characters long and contains the word "code"

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter a username that is at least  8 characters long and" + "has the word \"code\" in it.");
		
		String userName = input.nextLine();

		if (userName.length() < 8) {
			System.out.println("Too short. Please enter at least 8 characters");

			userName = input.nextLine();
		}

		if (!userName.contains("code")) {
			System.out.println("Sorry, please add the word \"code\" to your username.");

			userName = input.nextLine();
		}
		System.out.println("Welcome, " + userName);

		input.close();
		// end
	}

}
