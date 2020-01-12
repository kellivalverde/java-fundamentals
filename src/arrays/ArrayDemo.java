package arrays;

public class ArrayDemo {

	public static void main(String[] args) {

//		int[] cupValues = new int[5];
//		cupValues[0] = 42;
//		cupValues[1] = 86;
//		cupValues[2] = 23;
//		cupValues[3] = 8;
//		cupValues[4] = 91;

		// or declare like this
		
		int[] cupValues = { 42, 86, 23, 8, 91 }; //initializer list

		
//		System.out.println(cupValues[0]); // prints "42"
//		System.out.println(cupValues[1]); // prints "86"
//		System.out.println(cupValues[2]); // prints "23"
//		System.out.println(cupValues[3]); // prints "8"
//		System.out.println(cupValues[4]); // prints "91"
//	

		// more efficient as a for loop. i = variable for index here
		// iterates thru array
		for (int i = 0; i < cupValues.length; i++) {
			System.out.println("The value at poition " + i + " is " + cupValues[i]);
		}

		int[] cupValue2 = { 100, 200, 300, 400, 500};
		
		int[] cupValues2 = new int[5];
		int numberOfCups = cupValues2.length;
		System.out.println(numberOfCups); // prints "5"

		// updated length to 2
		cupValues2 = new int[2];
		System.out.println(cupValues2.length); // prints "2"

	}

}
