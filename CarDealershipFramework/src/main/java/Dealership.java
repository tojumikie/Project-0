import java.util.Scanner;

public class Dealership {
	
	public static void runUserSelection(int selection) {
		switch(selection) {
		case 1:
			Customers Customers = new Customers();
			Customers.viewCars();
			break;
		case 2:
			UserLogin UserLogin = new UserLogin();
			//UserLogin.register();
			UserLogin.UserMenu();
			break;
		case 3:
			EmployeeLogin EmployeeLogin = new EmployeeLogin();
			EmployeeLogin.Offers();
			break;
		case 4:
			SystemAccess SystemAccess = new SystemAccess();
			break;
		case 5:
			System.out.println("exiting program");
			break;
		}
//		int selection = 0;
//		Scanner kb = new Scanner(System.in);
//		System.out.println("WELCOME TO THE CAR LOT");
//		System.out.println("select an option.");
//		System.out.println("");
//		System.out.println("MENU");
//		System.out.println("1. customers");
//		System.out.println("2. users");
//		System.out.println("3. employees");
//		System.out.println("4. system");
//		System.out.println("5. exit program");
//		selection = kb.nextInt();
//		return selection;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//Customers customers = new Customers();
		int selection = 0;
		//Scanner kb = new Scanner(System.in);
		
		do {
				System.out.println("WELCOME TO THE CAR LOT");
				System.out.println("select an option.");
				System.out.println("");
				System.out.println("MENU");
				System.out.println("1. customers");
				System.out.println("2. users");
				System.out.println("3. employees");
				System.out.println("4. system");
				System.out.println("5. exit program");
				
				selection = kb.nextInt();
				runUserSelection(selection);
		} while(selection != 5);
		
//		int options = 0;
//		while (options != 5)
//		{
//			options = Menu();
//			switch (options) {
//			case 1:
//				//System.out.println("testing 1");
//				Customers.viewCars();
//				break;
//			case 2:
//				System.out.println("testing 2");
//				break;
//			case 3:
//				System.out.println("testing 3");
//				break;
//			case 4:
//				System.out.println("testing 4");
//				break;
//			case 5:
//				System.exit(0);
//				break;
//			}
//		switch (options) {
//		case 1:
//			//System.out.println("testing 1");
//			break;
//		case 2:
//			//System.out.println("testing 2");
//			break;
		}
//		Scanner kb = new Scanner(System.in);
//		int option = 0;
//		while (option != 5)
//		System.out.println("WELCOME TO THE CAR LOT");
//		System.out.println("");
//		System.out.println("MENU");
//		System.out.println("1. customers");
//		System.out.println("2. users");
//		System.out.println("3. employees");
//		System.out.println("4. system");
//		System.out.println("5. exit program");
	}