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
		String offerDecision;
		
		System.out.println("offer for " + Customers.offerPrice);
		System.out.println("Do you want to accept the offer");
		offerDecision = kb.nextLine();
		if (offerDecision.equals("yes")) {
			System.out.println("offer accepted");
		}
		else if (offerDecision.equals("no")) {
			System.out.println("The offer has not been accepted");
		}
	}
}