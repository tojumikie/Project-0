import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;


public class Customers {
	public static int offerPrice = 0;
	public static int paymentLeft = 0;
	
	//public static HashMap<String, Integer> carsForSale = new HashMap<String, Integer>();
	//carsForSale.
	//carsForSale
	
	public static void main(String[] args) {
		//firstOption();
//		String test = "this is a test";
//		try {
//			FileOutputStream fstr = new FileOutputStream("test.txt");
//			ObjectOutputStream ostr = new ObjectOutputStream(fstr);
//			ostr.writeObject(test);
//			ostr.close();
//			fstr.close();
//			System.out.println("data saved in test.txt");
//		}
//		catch(IOException io) {
//			io.printStackTrace();
//		}
	}
	
	
	public static void firstOption() {
		Scanner kb = new Scanner(System.in);
		String option;
		System.out.println("Would you like to make a buy a car or make a payment?");
		option = kb.nextLine();
		if(option.equals("buy a car"))
		{
			viewCars();
		}
		else if(option.equals("make a payment"))
		{
			customerPayment();
		}
	}
	
	public static void customerPayment() {
		Scanner kb = new Scanner(System.in);
		String decision;
		int payment;
		if (paymentLeft > 0) {
			System.out.println("Payment of $" +  paymentLeft + " remaining");
			System.out.println("Do you want to make a payment?");
			decision = kb.nextLine();
			if(decision.equals("yes"))
			{
				System.out.println("Type the payment amount as an integer");
				payment = kb.nextInt();
				//String test = "this is a test";
				try {
					FileOutputStream fstr = new FileOutputStream("test.txt");
					ObjectOutputStream ostr = new ObjectOutputStream(fstr);
					ostr.writeObject(payment);
					ostr.close();
					fstr.close();
					//System.out.println("data saved in test.txt");
				}
				catch(IOException io) {
					io.printStackTrace();
				}
				paymentLeft = paymentLeft - payment;
				System.out.println("payment left is $" + paymentLeft);
			}
		}
		else
		{
			System.out.println("There is no payment to make.");
		}
	}
	
	
	public static void viewCars() {
		Scanner kb = new Scanner(System.in);
		EmployeeLogin.insertOriginalCars();
		System.out.println("SELECT A CAR. TYPE THE NUMBER OF THE CAR");
		EmployeeLogin.showCars();
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
		case 2:
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
