package a1;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Creates a map of all items and the corresponding prices
				Map<String, double[]> itemMap = new TreeMap<>();
				int numVariety = scan.nextInt();
				for (int i=0; i<numVariety; i++) {
					String itemName = scan.next();
					double itemPrice = scan.nextDouble();
					//Array: Name, Number of Customers buying, Number of items bought
					double[] itemAndCount = {itemPrice, 0, 0};
					itemMap.put(itemName, itemAndCount);
				}

				//Calculate and display names and prices for all customers
				int numCust = scan.nextInt();
				for(int custNum=0; custNum<numCust; custNum++) {
					String firstInitial = scan.next();
					String lastName = scan.next();
					int numDiff = scan.nextInt();
					List<String> custItems = new ArrayList<String>();
					for(int itemTypeNum=0; itemTypeNum<numDiff; itemTypeNum++) {
						int numItem = scan.nextInt();
						String itemName = scan.next();
						if (!custItems.contains(itemName)) {
							itemMap.get(itemName)[1]++;
						}
						custItems.add(itemName);
						itemMap.get(itemName)[2] += numItem;
					}
				}
				scan.close();
				//Print output
				for (Map.Entry<String,double[]> entry : itemMap.entrySet())  
		            System.out.println((((int)entry.getValue()[1] == 0) ? "No" : (int)entry.getValue()[1])
		            		+ " customers bought " + (((int)entry.getValue()[1] == 0) ? "" : (int)entry.getValue()[2] + " ")
		            		+ entry.getKey());
	}
}
