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
		
		do{
			if(!logStatusUser(user, scannerLogin, scannerPassword)) {
				System.out.println("Incorrect login or password !!!");
				System.out.println("Enter login: ");
				scannerLogin = scanner.nextLine();
				System.out.println("Enter password: ");
				scannerPassword = scanner.nextLine();
			}else{
				System.out.println("User " + "\"" + user.getLogin() + "\"" + " logged");
				break;
			}
		}while(true);
	}

	 public static boolean logStatusUser(User user, String login, String password){
		if(login.equals(user.getLogin()) && password.equals(user.getPassword())){
			user.setLogStatus(true);
			return true;
		}
		return false;
	}
}
