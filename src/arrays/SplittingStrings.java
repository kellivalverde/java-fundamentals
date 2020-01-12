package arrays;

public class SplittingStrings {

	public static void main(String[] args) {
		
		//returns an array
		/* Split allows us to split a String into an array of Strings. 
		 * It accepts one argument, which is the delimiter it should 
		 * use to split the String:
		 */
		
		String source = "this, that, the other";
		String[] elements = source.split(", ");
		 
		System.out.println(elements[0]); // prints "this"
		System.out.println(elements[1]); // prints "that"
		System.out.println(elements[2]); // prints "the other"
		
		System.out.println(elements.length);
		
		
		String myName = "Sue";
		char[] letters = myName.toCharArray();
		 
		System.out.println("The first letter of my name is " + letters[0]);
		
		System.out.println(myName.indexOf('S')); //prints "0"
		System.out.println("foo".indexOf('o')); //prints "1"
		
		System.out.println("fee, fie, foe, fum".indexOf("foe")); //prints "10"
		
		
	}

}
