package loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhileLoopPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Prompt user for a message to display 5 times
		System.out.println("Enter a message");
		String message = input.nextLine();
		
		int count = 1;
		
		while(count <= 5){
		System.out.println(message);
		
		count ++;  //increment count
		}	
		
		input.close();
		
		
//Guessing game
		
		System.out.println("Please guess a number between 1 and 10: \n (You have 4 guesses)");

		Scanner input1 = new Scanner(System.in); // input1 because input was used above

		int numGuess = input1.nextInt(); // holds the info from the user
		int guessAttempts = 0;
		int secretNum = ThreadLocalRandom.current().nextInt(1, 11); // did 11 instead of 10 --> inclusive of 10
				//could use (int)(Math.random()* 10+1);
		
		// would show me the secretNum so I know it's working:
		// System.out.println(secretNum);

		// loop

		do {
			if (numGuess == secretNum) {
				System.out.println("Yay! That's correct! You win!");
				break;
			} else if (numGuess == 0) {
				System.out.println("Sorry, that's no good. Please guess a number between 1 and 10:");
				numGuess = input1.nextInt();
			} else if (numGuess == -1) {
				System.exit(numGuess); // kills the program
				System.out.println("Game over.");
			} else if (numGuess < secretNum) {
				System.out.println("Try a higher number.");
				numGuess = input1.nextInt();
			} else if (numGuess > secretNum) {
				System.out.println("Try a lower number.");
				numGuess = input1.nextInt();
			}
			guessAttempts += 1;

		} while (guessAttempts < 3); // condition - can be tested for true "while this is true"

		System.out.println("No more attempts. You are done.");

		input1.close();
		
	}

}
