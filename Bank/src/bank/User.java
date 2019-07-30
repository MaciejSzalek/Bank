package bank;

import java.math.BigDecimal;

public class User {
	
	private static String login;
	private static String password;
	private static BigDecimal account;
	private static boolean logStatus;
	
	public User(String login, String password, BigDecimal account, boolean logStatus) {
		this.login = login;
		this.password = password;
		this.account = account;
		this.logStatus = logStatus;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public BigDecimal getAccount() {
		return account;
	}
	
	public boolean getLogStatus() {
		return logStatus;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAccount(BigDecimal account) {
		this.account = account;
	}
	
	public void setLogStatus(boolean logStatus) {
		this.logStatus = logStatus;
	}
	
}
