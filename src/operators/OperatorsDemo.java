package operators;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		
		System.out.println(a+b);
		
		//+ can be used for concatenation (connecting 2 pieces of string data)
		System.out.println("a + b is " + (a+b));
		System.out.println("a-b is " + (a-b));
		
		//integer division (no fractions)
		System.out.println(a/b);
		//this is like asking how many times does a go into b, which is 0
		
		//cast a double for real division
		System.out.println((double) a/b);
		
		System.out.println(b%a); //a goes into b once and 5 is left over
		
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a<=b);
		
		//conditional AND
		System.out.println((a<b) && (b>10));
		System.out.println((a>b) || (b>10));
		
		
		
		//translating English into Java
		
		// Jessica is 23 years old.
		int jessicaAge = 23;
		 
		// Sam is 47.
		int samAge = 47;
		 
		// Jessica is younger than Sam.
		System.out.println(jessicaAge < samAge);
		
		
	}

}
