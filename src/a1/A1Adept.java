package a1;

import java.util.*;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Creates a map of all items and the corresponding prices
		Map<String, Double> itemMap = new HashMap<>();
		int numVariety = scan.nextInt();
		for (int i=0; i<numVariety; i++) {
			String itemName = scan.next();
			double itemPrice = scan.nextDouble();
			itemMap.put(itemName, itemPrice);
		}
		//initialize variables to hold variables to hold the biggest and smallest values
		String biggestCust = "";
		String smallestCust = "";
		double biggestCost = 0.0;
		double smallestCost = 0.0;
		//Initializes variable to hold the total cost of all customers
		double totalCost = 0.0;
		//Calculate and display names and prices for all customers
		int numCust = scan.nextInt();
		for(int custNum=0; custNum<numCust; custNum++) {
			String firstInitial = scan.next() + " ";
			String lastName = scan.next();
			String fullName = firstInitial + lastName;
			int numDiff = scan.nextInt();
			double custTotal = 0.00;
			//Calculates the total cost of the items that particular customer bought
			for(int itemTypeNum=0; itemTypeNum<numDiff; itemTypeNum++) {
				int numItem = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = itemMap.get(itemName);
				custTotal += (numItem * itemPrice);
			}
			//Decides whether the customer can hold the title of biggest or smallest
			if(custTotal > biggestCost) {
				biggestCost = custTotal;
				biggestCust = fullName;
			}
			else if (custTotal <= smallestCost) {
				smallestCost = custTotal;
				smallestCust = fullName;
			}
			else if (smallestCost == 0.0) {
				smallestCost = custTotal;
				smallestCust = fullName;
			}
			//Adds customer total to overall total
			totalCost += custTotal;
		}
		scan.close();
		//prints output for biggest, smallest, and average
		System.out.println("Biggest: " + biggestCust + " (" + String.format("%.2f", biggestCost) + ")");
		System.out.println("Smallest: " + smallestCust + " (" + String.format("%.2f", smallestCost) + ")");
		System.out.println("Average: " + String.format("%.2f", (totalCost / numCust)));
	}
	
		
}
