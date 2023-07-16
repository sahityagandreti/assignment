
public class Account {
	private int account;
	private int openedDate;
	private double balance;
	
	public int length;
	
	public Account() {
	}
	public Account(int account, int openedDate, double balance) {
		
		this.account = account;
		this.openedDate = openedDate;
		this.balance = balance;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(int openedDate) {
		this.openedDate = openedDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
