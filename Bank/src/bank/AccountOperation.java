package bank;

import java.util.Scanner;

public class AccountOperation {
	
	private static Scanner scanner;
	private static Integer value = 0;
		
	public static void setPaymentIn(User user) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enter deposit declaration: ");
		value = scanner.nextInt();
		
		if(value <= 0 ) {
			System.out.println("The deposit declaration must be greater than \"0\" pln ");
			
		}else {
			Integer account = user.getAccount() + value;
			user.setAccount(account);
			System.out.println("Account balance after operation: " + user.getAccount() + " pln");
		}
	}
	
	public static void setPaymentOut(User user) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enter payment out value: ");
		value = scanner.nextInt();
		
		if(value > user.getAccount()) {
			System.out.println("The payment out declaration is greater than the account balance ");
			
		}else if(value <= 0){
			System.out.println("The payment out declaration must be greater than \"0\" pln ");
			
		}else {
			Integer account = user.getAccount() - value;
			user.setAccount(account);
			System.out.println("Account balance after operation: " + user.getAccount() + " pln");
			
		}	
	}
	
	public static void getAccountBalance(User user) {
		System.out.println("Account balance: " + user.getAccount() + " pln");
	}
	
}
