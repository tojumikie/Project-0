import java.util.ArrayList;
import java.util.Scanner;

public class UserLogin {
	//ArrayList<String> user = new
	public static String[][] accountArray = new String[2][2];
	public String username;
	public String password;
	static ArrayList<String> user = new ArrayList<String>();
	static ArrayList<String> pass = new ArrayList<String>();
	
	public static void main(String[] args)
	{
//		Scanner kb = new Scanner(System.in);
//		String u;
//		String p;
//		String u;
//		String p;
//		//accountArray[0][0] = "tojumikie";
//		//accountArray[0][1] = "12345678";
//		//System.out.println(accountArray[0][0]);
//		//System.out.println(accountArray[0][1]);
//		ArrayList<String> user = new ArrayList<String>();
//		ArrayList<String> pass = new ArrayList<String>();
//		System.out.println("Type in the username you would like to use");
//		u = kb.nextLine();
//		System.out.println(u);
//		System.out.println("Type in the password you would like to use");
//		p = kb.nextLine();
//		System.out.println(p);
//		user.add(u);
//		pass.add(p);
//		System.out.println("Enter the username");
//		u = kb.nextLine();
//		System.out.println("Enter the password");
//		p = kb.nextLine();
//		if(user.contains(u) && pass.contains(p)) {
//			System.out.println("Account found. Logging in");
//		}
//		else {
//			System.out.println("Unable to log in. Username or password "
//					+ "is incorrect");
//		}
		UserMenu();
	}
	public static void UserMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to register or log in?");
		String response = kb.nextLine();
		//System.out.println(response);
		
		if(response.equalsIgnoreCase("register"))
		{
			register_v2();
		}
		else if(response.equalsIgnoreCase("log in"))
		{
			//System.out.println("ok");
			login_v2();
		}
		
	}
	public static void register_v2() {
		Scanner kb = new Scanner(System.in);
		String u;
		String p;
		//accountArray[0][0] = "tojumikie";
		//accountArray[0][1] = "12345678";
		//System.out.println(accountArray[0][0]);
		//System.out.println(accountArray[0][1]);
		
		System.out.println("Type in the username you would like to use");
		u = kb.nextLine();
		System.out.println(u);
		System.out.println("Type in the password you would like to use");
		p = kb.nextLine();
		System.out.println(p);
		user.add(u);
		pass.add(p);
	}
	
	public static void register (){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the username");
		String user = kb.nextLine();
		System.out.println("Enter the password");
		String pass = kb.nextLine();
		accountArray[0][0] = user;
		accountArray[0][1] = pass;
	}
	
	public static void login_v2() {
		Scanner kb = new Scanner(System.in);
		String u;
		String p;
//		String u;
//		String p;
//		//accountArray[0][0] = "tojumikie";
//		//accountArray[0][1] = "12345678";
//		//System.out.println(accountArray[0][0]);
//		//System.out.println(accountArray[0][1]);
//		ArrayList<String> user = new ArrayList<String>();
//		ArrayList<String> pass = new ArrayList<String>();
//		System.out.println("Type in the username you would like to use");
//		u = kb.nextLine();
//		System.out.println(u);
//		System.out.println("Type in the password you would like to use");
//		p = kb.nextLine();
//		System.out.println(p);
//		user.add(u);
//		pass.add(p);
		System.out.println("Enter the username");
		u = kb.nextLine();
		System.out.println("Enter the password");
		p = kb.nextLine();
		if(user.contains(u) && pass.contains(p)) {
			System.out.println("Account found. Logging in");
		}
		else {
			System.out.println("Unable to log in. Username or password "
					+ "is incorrect");
		}
	}
	
	public void login() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the username");
		String user = kb.nextLine();
		System.out.println("Enter the password");
		String pass = kb.nextLine();
	}
}