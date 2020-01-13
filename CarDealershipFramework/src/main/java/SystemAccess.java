import java.util.Scanner;

public class SystemAccess {

	public static void main(String[] args) {
//		int price = 10000;
//		int months = 0;
//		int monthlyPayment = 0;
//		
//		months = 60;
//		monthlyPayment = price / months;
//		System.out.println(monthlyPayment);
		calculateMonthlyPayment();
	}
	public static void calculateMonthlyPayment() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of the offer?");
		int price = kb.nextInt();
		System.out.println("What is the loan term in months?");
		int months = kb.nextInt();
		int monthlyPayment = price / months;
		System.out.println("The monthly payment is " + monthlyPayment);
	}
}