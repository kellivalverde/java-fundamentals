package conditionals;

public class ConditionalsDemo {

	public static void main(String[] args) {

		int hoursOfSleep = 24; // was 42. changed.
		if (hoursOfSleep >= 8) {
			System.out.println("You are likely to feel more rested.");
			System.out.println("Isn' that nice?");
		}
		
		if (hoursOfSleep == 42) {  // does not render because it's not longer true.
			  System.out.println("He used 42 again, didn't he?");
			 }

		int heightInInches = 73;
		 
		if(heightInInches >= 60) {
		  System.out.println("You are tall enough to ride");
		}
//
//		int heightInInches = 42;
//		 
//		if(heightInInches >= 60) {
//		  System.out.println("You are tall enough to ride");
//		}	
//  can't render this because 42<60
		
		//adding else
		
		int heightInInchesB = 42;
		 
		if(heightInInchesB >= 60) {
		  System.out.println("You are tall enough to ride.");
		} else {
		  System.out.println("I'm sorry, too short.");
		}
	
// adding else if
		
		int heightInInchesC = 42;
		if(heightInInchesC >= 60) {
			  System.out.println("You are tall enough to ride.");
			} else if(heightInInchesC >= 30) {
			  System.out.println("Try the teacups. They look fun.");
			} else {
			  System.out.println("I'm sorry, too short.");
			}
		
// switch/case
		
		String ageGroup = "youngster";
		 
		switch (ageGroup) {
		case "adult":
		    System.out.println("You can ride the rollercoaster!");
		case "youngster":
		    System.out.println("The teacups are fun.");
		    break;
		default:
		    System.out.println("Oh, you must be a toddler. Toddle on!");
		}
		
		
	
	
	}

}
