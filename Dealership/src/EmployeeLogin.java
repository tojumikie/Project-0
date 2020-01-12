import java.util.Scanner;

public class EmployeeLogin {
	
//	int price = 0;
//	price = Customers.offerPrice;
//	
	public static void main(String[] args) {
		int price;
		price = Customers.offerPrice;
		//System.out.println(price);
	}
	
	public static void Offers() {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("offer for " + Customers.offerPrice);
		System.out.println("Do you want to accept the offer");
		if (kb.nextLine().equals("yes")) {
			System.out.println("offer accepted");
		}
		else {
			//System.exit(0);
		}
	}
}
