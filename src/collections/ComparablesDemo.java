package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablesDemo {

	public static void main(String[] args) {

		String a = "A";
		String b = "B";

		System.out.println(a.compareTo(b)); // prints -1
		// Compares two strings lexicographically. Built in functionality of String

		String c = "C";
		String d = "C";

		System.out.println(c.compareTo(d));// prints 0

		String e = "E";
		String f = "F";

		System.out.println(f.compareTo(e));// prints 1

		// ---------------------------------------

		// use for names

		ArrayList<String> names = new ArrayList<>();

		names.add("Zack");
		names.add("Lynn");
		names.add("Alan");

		// System.out.println(names); // prints in order of how they were added to the
		// ArrayList

		// to sort...

		Collections.sort(names);

		System.out.println(names);

	}

}
