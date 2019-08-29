package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		String output = "";
		int numCust = scan.nextInt();
		for(int custNum = 0; custNum < numCust; custNum++) {
			String firstInitial = scan.next().substring(0,1) + ". ";
			String lastName = scan.next() + ": ";			
			int numDiff = scan.nextInt();
			double custTotal = 0.0;
			for(int itemTypeNum = 0; itemTypeNum < numDiff; itemTypeNum++) {
				int numItem = scan.nextInt();
				scan.next();
				double itemPrice = scan.nextDouble();
				custTotal += (numItem * itemPrice);

			}
			//Displays customer information to an output			
			System.out.println(firstInitial + lastName + String.format("%.2f", custTotal));
		}
		scan.close();
		//displays output
	}
}
