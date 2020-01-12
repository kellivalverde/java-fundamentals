package arrays;

public class ClassRoster {

	public static void main(String[] args) {
		
		String [] rosterNames = {"Kelli", "Ian", "MeiLing"};
		double [] gpaValues = { 3.75, 3.5, 4.0};
		
		for (int i = 0; i < rosterNames.length; i++) {
			System.out.println("I know three people named " + rosterNames[i]);
		}

		for (int i = 0; i < gpaValues.length; i++) {
			System.out.println("Their GPAs are " + gpaValues[i]);
		}
	}

}
