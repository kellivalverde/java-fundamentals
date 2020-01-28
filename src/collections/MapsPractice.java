package collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

	public static void main(String[] args) {

		/*
		 * Create a map for a restaurant’s menu with the menu items and prices (use
		 * double) for the items as entries. Stretch: Use BigDecimal and its String
		 * constructor rather than a double for prices. *
		 */

		Map<String, BigDecimal> menu = new HashMap<String, BigDecimal>();

		menu.put("Spaghetti", new BigDecimal("8.97"));
		menu.put("Lasagna", new BigDecimal("10.98"));
		menu.put("Pizza", new BigDecimal("15.50"));
		menu.put("Cesar Salad", new BigDecimal("7.00"));
		menu.put("Kale Salad", new BigDecimal("7.00"));

		System.out.println("The price of spaghetti is " + menu.get("Spaghetti"));

		System.out.println(menu.size() + " items are on the menu.");

		menu.put("Champagne", new BigDecimal("200.00"));

		BigDecimal priceChampagne = menu.get("Champagne"); // getting the key
		System.out.println("The price of Champagne is " + priceChampagne);

		menu.put("Vintage Wine", new BigDecimal("175.00"));

		BigDecimal priceWine = menu.get("Vintage Wine"); // getting the key
		System.out.println("The price of Vintage Wine is " + priceWine);

		System.out.println("Menu contains champagne = " + menu.containsKey("Champagne"));

		boolean price = menu.containsValue("13.50"); // getting the value
		System.out.println("It is " + price + " that the smeared price was $13.50.");

		menu.remove("Kale Salad");
		System.out.println("Kale Salad is no longer available");
		
		menu.clear();
		System.out.println(menu);
		
		
	}

	private static void isEmpty() {
		// TODO Auto-generated method stub
		
	}

}