package arrays;

import java.util.Scanner;

public class VacationSpots {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many favorite vacation spots do you have?");
		int favorites = input.nextInt();
		
		String[] vacaSpots = new String[favorites];
		// String[] vacaSpots = new String[4];
		
		System.out.println("What are they?");
		
//		vacaSpots[0] = input.nextLine();
//		vacaSpots[1] = input.nextLine();
//		vacaSpots[2] = input.nextLine();
//		vacaSpots[3] = input.nextLine();

		for(int i=0; i<vacaSpots.length; i++) {
			vacaSpots[i] = input.next(); // user input determines array
		}
		
		
		System.out.println(vacaSpots[0]);
		System.out.println(vacaSpots[vacaSpots.length-1]);  //reads last spot
	}

}
