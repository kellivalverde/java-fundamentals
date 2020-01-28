package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
					//v "diamond operator" 
		ArrayList<String> giantWords = new ArrayList<String>();  //array list declared here - only needs to do once
	
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
		 
		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");

		
		
		//autoboxing 
		ArrayList<Integer> answers = new ArrayList<Integer>();
		int ultimateAnswer = 42;
		answers.add(ultimateAnswer);
		answers.add(86);
		 
		System.out.println("The answers are: " + answers);
		 
		Integer asIntegerObject = ultimateAnswer;
		System.out.println("The ultimate answer is " + asIntegerObject);
		
		//size method
//		
//		if(giantWords.length == 0) {
//			  System.out.println("I'm empty!");
//			}
//		ArrayList<Integer> answers = new ArrayList<Integer>();
//		System.out.println("Are you out of answers? " + answers.isEmpty());
//		
		
	//Contains?
	
		ArrayList<String> myTools1 = new ArrayList<String>();
		myTools1.add("hammer");
		myTools1.add("shovel");
		myTools1.add("wrench");
		 
		if(myTools1.contains("hammer")) {
		  System.out.println("I have a hammer!");
		}
		
		
	// where?
		ArrayList<String> myTools = new ArrayList<String>();
		myTools.add("hammer");
		myTools.add("shovel");
		myTools.add("wrench");
		 
		System.out.println("Shovel is element " + myTools.indexOf("shovel"));
		
		//Order is important
		
		
		ArrayList<String> giantWords2 = new ArrayList<String>();
		giantWords2.add("fee");
		giantWords2.add("fie");
		giantWords2.add("foe");
	// ?		System.out.println(myList);
		
		
 // enhanced for loop
		
		ArrayList<String> giantWords3 = new ArrayList<String>();
		giantWords3.add("fee");
		giantWords3.add("fie");
		giantWords3.add(0 , "foe");

		
		giantWords3.remove(0);
		giantWords3.remove("fie");
		
		for(String word: giantWords3) {
		  System.out.print(word + "! ");
		}
		System.out.println();
		
		
	}

}
