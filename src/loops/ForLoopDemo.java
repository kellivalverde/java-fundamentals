package loops;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {

//		int count = 1; 								//where we are starting
//		
//		while(count <= 10) { 						// where we are going (loop's condition)
//		  System.out.println("Count is " + count);  // how we get there
//		  count++;
//		}

		// part before the semi-colon runs before the loop (called initialization
		// expression)
		// This is analogous to how we initialized count before our while loop:

		for (int count = 1; count <= 10; count++) { // holds all on one line

			System.out.println("Count is " + count);
		}
		
// new example -- not recommended - better for while loop
//		Scanner input = new Scanner(System.in);
//
//		for (String r = "foo"; !r.equals("quit"); r = input.nextLine()) {
//			System.out.println("What should I do?");
//		}
//
//		System.out.println("Ok, I quit!");

		
		// String traversal where we print one letter at a time "O-h-i-o"
		Scanner input = new Scanner(System.in);
	
		String name = "Ohio";
		
		for(int i = 0; i < name.length(); i++){
		System.out.println(name.charAt(i));  //index
		}
		
		//reverse the string "oihO"
		
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		
		for(int i=0; i<=20; i+=5){
			System.out.print(i + ", ");
			}
		
		
		
	}	
}

