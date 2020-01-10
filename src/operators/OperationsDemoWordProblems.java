package operators;

public class OperationsDemoWordProblems {


	
	public static void main(String[] args) {
		
		// Lisa is cooking muffins. 
		//The recipe calls for 7 cups of sugar. She has already put in 2 cups. 
		//How many more cups does she need to put in?
		
		int cupsNeeded = 7;
		int cupsAdded = 2;
		
		System.out.println(cupsNeeded - cupsAdded);

		//At a restaurant, Mike and his three friends (4 total) decided to divide the bill evenly. 
		//If each person paid $13 then what was the total bill?
		
		int friendBill = 13;
		int friendNumber = 4;
		
		System.out.println(friendBill * friendNumber);
		
		//or
		// Can import NumberFormat for currency from Java... How?
		
		double portionPaid = 13.00;
		double total;
		int numPeople = 4;
		
		total =portionPaid * numPeople;
		
		System.out.println("Total bill is: " + total);
		
		//How many packages of diapers can you buy with $40 if one package costs $8
		
		int diaperMoney = 40;
		int diaperCost = 8;
		
		System.out.println(diaperMoney / diaperCost);
		
		//Last Friday Trevon had 29. Over the weekend he received some more.He now has 41. How much did he receive?
		
		int moneyFriday = 29;
		int moneyNow = 41;
		
		System.out.println(moneyNow - moneyFriday);
		
		//Last week Julia ran 30 miles more than Pranav. 
		//Julia ran 47 miles. How many miles did Pranav run?

		int milesJulia = 47;
		int milesPravan = -30;
				
		System.out.println(milesJulia + milesPravan);

		//How many boxes of envelopes can you buy with $12 if one box costs $3?  12/3=4
		
		int envelopeMoney = 12;
		int envelopeCost = 3;
				
		System.out.println(envelopeMoney / envelopeCost);
		
		//After paying 5.12 for a salad, Norachai has 27.10. How much money did he have before buying the salad?
		
		double saladCost = 5.12;
		double moneyAfter = 27.10;
				
		System.out.println(saladCost + moneyAfter);
		
		//331 students went on a field trip. 
		//Six buses were filled and 7 students traveled in cars. 
		//How many students were in each bus?
		
		int studentsTotal = 331;
		int studentsCars = 7;
		int buses = 6;
		System.out.println((studentsTotal - studentsCars) / buses);
		
		//Aliyah had 24 to spend on seven pencils. 
		//After buying them she had 10.
		//How much did each pencil cost?
		
		int moneyTotal = 24; 
		int moneyLeft = 10;
		int pencils = 7;
		System.out.println((moneyTotal - moneyLeft) / pencils);
		
		//The sum of three consecutive numbers is 72. 
		// Print these numbers consecutively to the console.
		
		int a = 72/3;
		
		System.out.println(a+1);
		System.out.println(a);
		System.out.println(a-1);
		
		//decreament
		int b = (72/3)+1;
		System.out.println(b);
		System.out.println(--b);
		System.out.println(--b);

		//OR
		
		int sum = 72;
		int middle = sum/3;
		int min = middle - 1;
		int max = middle + 1;
		
		System.out.println("Min: " + min);
		System.out.println("Middle: " + middle);
		System.out.println("Max: " + max);
			
		
		// The sum of three consecutive even numbers is 48. 
		// What is the smallest of these numbers?
		
		int sumB = 48;
		int c = (sumB/3);
		System.out.println("Smallest number: " + (c-2));
				
		//Maria has boxes. She buys seven more. 
		//A week later, half of her boxes are destroyed in a fire, leaving her with 22 boxes. 
		//With how many did she start?
		
		int boxesLeft = 22;
		int boxesStart = (boxesLeft*2);
		
		System.out.println(boxesStart);
		
		
		
	}

}
