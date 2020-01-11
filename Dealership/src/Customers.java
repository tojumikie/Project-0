import java.util.Scanner;

public class Customers {
	
	public static void viewCars() {
		Scanner kb = new Scanner(System.in);
		System.out.println("CARS AVAILABLE. SELECT A CAR");
		System.out.println("1. 2010 Ford Mustang GT, $8500 ");
		System.out.println("2. 2009 Jaguar XF Supercharged, $8499");
		System.out.println("3. 2011 Ford F-150 SuperCab, $7500");
		int selection = kb.nextInt();
		viewOffers(selection);
	}
	
	public static void viewOffers(int option) {
		Scanner kb = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("2010 Ford Mustang GT, $8500");
			System.out.println("Would you like to make an offer?");
			if (kb.nextLine().equals("yes")) {
				System.out.println("Type the offer price as an integer");
			}
			else {
				
			}
			break;
		case 2:
			System.out.println("2009 Jaguar XF Supercharged, $8499");
			System.out.println("Would you like to make an offer?");
			break;
		case 3:
			System.out.println("2011 Ford F-150 SuperCab, $7500");
			System.out.println("Would you like to make an offer?");
			break;
		}
	}
	
	//public void 
}
