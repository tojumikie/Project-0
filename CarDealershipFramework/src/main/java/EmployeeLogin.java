import java.util.HashMap;
import java.util.Scanner;

public class EmployeeLogin {
	public static HashMap<String, Integer> carsForSale = new HashMap<String, Integer>();
	
	
	//	int price = 0;
//	price = Customers.offerPrice;
//	
	public static void main(String[] args) {
		//int price;
		//price = Customers.offerPrice;
		//System.out.println(price);
		//insertOriginalCars();
		//showCars();
		//addCars();
		//showCars();
	}
	
	public static void viewPayments() {
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
	
	public static void Offers() {
		Scanner kb = new Scanner(System.in);
		String offerDecision;
		
		System.out.println("offer for " + Customers.offerPrice);
		System.out.println("Do you want to accept the offer");
		offerDecision = kb.nextLine();
		if (offerDecision.equals("yes")) {
			System.out.println("Offer Accepted, vehicle has been sold.");
			Customers.paymentLeft = Customers.offerPrice;
		}
		else if (offerDecision.equals("no")) {
			System.out.println("The offer has not been accepted");
		}
	}
	
	public static void insertOriginalCars() {
		carsForSale.put("2010 Ford Mustang GT", 8500);
		carsForSale.put("2009 Jaguar XF Supercharged", 8499);
		carsForSale.put("2011 Ford F-150 SuperCab", 7500);
//		for(String name : carsForSale.keySet()) {
//			String key = name.toString();
//			String value = carsForSale.get(name).toString();
//			System.out.println(key + ", $" + value);
//		}
	}
	
	public static void showCars() {
		int i = 1;
		for(String name : carsForSale.keySet()) {
			String key = name.toString();
			String value = carsForSale.get(name).toString();
			System.out.println(i + " " + key + ", $" + value);
			i++;
		}
	}
	
	public static void addCars() {
		Scanner kb = new Scanner(System.in);
//		carsForSale.put("2010 Ford Mustang GT", 8500);
//		carsForSale.put("2009 Jaguar XF Supercharged", 8499);
//		carsForSale.put("2011 Ford F-150 SuperCab", 7500);
		//System.out.println(carsForSale);
//		for(String name : carsForSale.keySet()) {
//			String key = name.toString();
//			String value = carsForSale.get(name).toString();
//			System.out.println(key + ", $" + value);
//		}
		String decision;
		String carName;
		int carPrice;
		System.out.println("Do you wish to add or remove a car to the lot?");
		decision = kb.nextLine();
		if(decision.equals("add")) {
			//System.out.println("add");
			System.out.println("Type in the name of the car that you would like to add.");
			carName = kb.nextLine();
			System.out.println("Type in the price of the car that you would like to add.");
			carPrice = kb.nextInt();
			carsForSale.put(carName, carPrice);
		}
		else if(decision.equals("remove")) {
			//System.out.println("remove");
			System.out.println("Type in the name of the car that you would like to remove.");
			carName = kb.nextLine();
			carsForSale.remove(carName);
			//showCars();
		}
	}
}