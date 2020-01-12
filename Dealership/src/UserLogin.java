import java.util.Scanner;

public class UserLogin {
	
	public static String[][] accountArray = new String[2][2];
	public String username;
	public String password;
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		//accountArray[0][0] = "tojumikie";
		//accountArray[0][1] = "12345678";
		//System.out.println(accountArray[0][0]);
		//System.out.println(accountArray[0][1]);
	}
	public void register (){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the username");
		String user = kb.nextLine();
		System.out.println("Enter the password");
		String pass = kb.nextLine();
		accountArray[0][0] = user;
		accountArray[0][1] = pass;
	}
	public void login() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the username");
		String user = kb.nextLine();
		System.out.println("Enter the password");
		String pass = kb.nextLine();
	}
}