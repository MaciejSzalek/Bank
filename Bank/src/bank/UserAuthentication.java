package bank;

import java.util.Scanner;

public class UserAuthentication {
	
	private static Scanner scanner;
	private static String scannerLogin;
	private static String scannerPassword;
	
	public static void loginUser(User user) {
		scanner = new Scanner(System.in);
		
		System.out.println("Enter login: ");
		scannerLogin = scanner.nextLine();
		
		System.out.println("Enter password: ");
		scannerPassword = scanner.nextLine();
		
		do {
			if(scannerLogin.equals(user.getLogin()) == false || 
					scannerPassword.equals(user.getPassword()) == false) {
				
				System.out.println("Incorect login or password !!!");
				
				System.out.println("Enter login: ");
				scannerLogin = scanner.nextLine();
				
				System.out.println("Enter password: ");
				scannerPassword = scanner.nextLine();
				
			
			}else if(scannerLogin.equals(user.getLogin()) == true && 
					scannerPassword.equals(user.getPassword()) == true) {
				
				user.setLogStatus(true);
				System.out.println("User " + "\"" + user.getLogin() + "\"" + " logged");
				break;
			}
			
		}while(true);
	}
}
