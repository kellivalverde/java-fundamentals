package loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BranchingDemo {

	public static void main(String[] args) {
		// break, continue, and return

		// example of not great code
//		boolean shouldPrint = true;
//		while(shouldPrint) {
//		  System.out.println("I should print!");
//		  break;  // infinite loop if this were not here
//		}

		// more graceful with an if statement
//		boolean shouldPrint = true;
//		if(shouldPrint) {
//		  System.out.println("I should print!");
//		}

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("What is your favorite color?");
			String favoriteColor = input.nextLine();

			if (favoriteColor.equals("Blue. No yel-- Auuuuuuuugh!")) {
				System.out.println("You're just making Monty Python references.");
				System.out.println("Get out!");
				break;
			}

			System.out.println("Your favorite color is " + favoriteColor);

		} //while loop

		
		//continue - -could solve with an if/else
		
		for(int count = 1; count <= 10; count++) {
		  if(count % 3 == 0) { /* it's a multiple of three */
		    continue;
		  }
		  System.out.println("Count is " + count);
		}
	
		for (int hours = 1; hours < 3; hours++) { //executes once
			  for (int minutes = 0; minutes < 60; minutes += 5) {  //executes until termination
			    System.out.println("The time is " + hours + ":" + minutes);
			  }
			}

		DecimalFormat paddedFormat = new DecimalFormat("00");  //controls how text is displayed
		 //NumberFormat is used for currency
		
		for (int hours = 1; hours < 3; hours++) {
		  String paddedHours = paddedFormat.format(hours);
		  for (int minutes = 0; minutes < 60; minutes += 5) {
		    String paddedMinutes = paddedFormat.format(minutes);
		    String paddedTime = paddedHours + ":" + paddedMinutes;
		    System.out.println("The time is " + paddedTime);
		  }
		}
		
		
	} // method
} // class


