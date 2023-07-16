
public class SavingsAccount extends Account{
	
	double minimumDepositAmount;
	int noOfTransactionsPerDay;
	public SavingsAccount() {}
	public SavingsAccount(double minimumDepositAmount, int noOfTransactionsPerDay,int account, int openedDate, double balance) {
		super( account,  openedDate,balance);
		this.minimumDepositAmount = validateminimumDepositAmount(minimumDepositAmount); 
		
		this.noOfTransactionsPerDay = validatenoOfTransactionsPerDay(noOfTransactionsPerDay);
	}
	
	private int validatenoOfTransactionsPerDay(int noOfTransactionsPerDay) {
		if(noOfTransactionsPerDay<=100) {
			return noOfTransactionsPerDay;
		}	
		throw new RuntimeException("Cannot Transact");
		}
	private double validateminimumDepositAmount(double minimumDepositAmount) {
		if(minimumDepositAmount>50) {
			return minimumDepositAmount;
		}
		
		throw new RuntimeException("Cannot Deposit");
		}
	public double getMinimumDepositAmount() {
		return minimumDepositAmount;
	}
	public void setMinimumDepositAmount(double minimumDepositAmount) {
		this.minimumDepositAmount = minimumDepositAmount;
	}
	
	public int getNoOfTransactionsPerDay() {
		return noOfTransactionsPerDay;
	}
	public void setNoOfTransactionsPerDay(int noOfTransactionsPerDay) {
		this.noOfTransactionsPerDay = noOfTransactionsPerDay;
	}
	

		
	}
	
