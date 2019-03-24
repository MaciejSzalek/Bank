package bank;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	
	//user details
	private static String userLogin = "1111";
	private static String userPassword = "qwerty";
	private static Integer userAccount = 10000;
	private static boolean logStatus = false;
	
	private static int menuItem;
	private static Scanner scanner;
	

	public static void main(String[] args) {
		
		User user = new User(userLogin, userPassword, userAccount , logStatus);
		
		do {
			if(user.getLogStatus() == false) {
				UserAuthentication.loginUser(user);
				
			}else if(user.getLogStatus() == true){
				try {
					do {
						System.out.println("Menu: (select item from 1 to 4)");
						System.out.println(
								"1: Payment IN" 
								+ "\n2: Payment OUT"
								+ "\n3: Account balance"
								+ "\n4: LOGOUT");
						
						scanner = new Scanner(System.in);
						menuItem = scanner.nextInt();
						
						switch(menuItem) {
							case 1:
								AccountOperation.setPaymentIn(user);
								break;	
							case 2:
								AccountOperation.setPaymentOut(user);
								break;
							case 3:
								AccountOperation.getAccountBalance(user);
								break;
							case 4:
								user.setLogStatus(false);
								System.out.println("User LOGOUT !!! ");
								break;
						}
					}while (user.getLogStatus() == true);
					
				}catch (InputMismatchException e) {
					System.out.println("Enter only integer !!! ");
				}
			}
		}while(true);
		
	}
}
