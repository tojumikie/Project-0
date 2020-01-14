import java.util.HashMap;
import java.util.Scanner;
import java.io.Serializable;

public class Customers {
	//public static HashMap<String, Integer> carsForSale = new HashMap<String, Integer>();
	//carsForSale.
	//carsForSale
	
	
	
	public static int offerPrice = 0;
	
	public static void viewCars() {
		Scanner kb = new Scanner(System.in);
		EmployeeLogin.insertOriginalCars();
//		System.out.println("CARS AVAILABLE. SELECT A CAR");
//		System.out.println("1. 2010 Ford Mustang GT, $8500 ");
//		System.out.println("2. 2009 Jaguar XF Supercharged, $8499");
//		System.out.println("3. 2011 Ford F-150 SuperCab, $7500");
		int selection = kb.nextInt();
		viewOffers(selection);
	}
	
	public static void viewOffers(int option) {
		//int offerPrice = 0;
		//Customers.offerPrice = 0;
		Scanner kb = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("2010 Ford Mustang GT, $8500");
			System.out.println("Would you like to make an offer?");
			if (kb.nextLine().equals("yes")) {
				System.out.println("Type the offer price as an integer");
				offerPrice = kb.nextInt();
				
			}
			else {
				//System.exit(0);
			}
			break;
		case 2:
			System.out.println("2009 Jaguar XF Supercharged, $8499");
			System.out.println("Would you like to make an offer?");
			if (kb.nextLine().equals("yes")) {
				System.out.println("Type the offer price as an integer");
				offerPrice = kb.nextInt();
			}
			else {
				//System.exit(0);
			}
			break;
		case 3:
			System.out.println("2011 Ford F-150 SuperCab, $7500");
			System.out.println("Would you like to make an offer?");
			if (kb.nextLine().equals("yes")) {
				System.out.println("Type the offer price as an integer");
				offerPrice = kb.nextInt();
			}
			else {
				//System.exit(0);
			}
			break;
		}
	}
	
	//public void 
}
