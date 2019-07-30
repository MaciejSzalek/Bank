package bank;

import java.math.BigDecimal;

public class AccountOperation {

	public static BigDecimal getAccountBalance(User user) {
		System.out.println("Account balance: " + user.getAccount() + " pln");
		return user.getAccount();
	}

	public static User setPaymentIn(User user, BigDecimal value){
		if(value.signum() <= 0){
			System.out.println("The deposit declaration must be greater than \"0\" pln");
			return null;
		}else{
			user.setAccount(user.getAccount().add(value));
			System.out.println("Account balance after operation: " + user.getAccount() + " pln");
			return user;
		}
	}
	
	public static User setPaymentOut(User user, BigDecimal value) {
		if(value.compareTo(user.getAccount()) == 1) {
			System.out.println("The payment out declaration is greater than the account balance ");
			return null;
			
		}else if(value.signum() <= 0){
			System.out.println("The payment out declaration must be greater than \"0\" pln ");
			return null;

		}else {
			BigDecimal account = user.getAccount().subtract(value);
			user.setAccount(account);
			System.out.println("Account balance after operation: " + user.getAccount() + " pln");
			return user;
		}	
	}
}
