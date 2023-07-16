
public class Bank extends SavingsAccount {
	private String bankName;
	private String branchName;
	private Account [] accounts;
	private int index=0;
	public Bank () {}
	public Bank(String bankName, String branchName, Account[] accounts) 
	{
		this.bankName = bankName;
		this.branchName = branchName;
		this.accounts = accounts;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public boolean addAccount(Account account)
	{
		if(index <10)
		{
			accounts[index++]=account;
		
			return true;
		}
		throw new RuntimeException("No more accounts can be added");
	}
	public void showAccounts()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Account Number:"+accounts[i].getAccount());
			System.out.println("Opened Date:"+accounts[i].getOpenedDate());
			System.out.println("Balance:"+accounts[i].getBalance());
		}
	}
	public boolean transaction(String type,int accountNo,double amount)
	{
		if(type=="Deposit")
		{
			for(int i=0;i<index;i++)
			{
				if(accounts[i].getAccount()==accountNo)
				{
					accounts[i].setBalance(accounts[i].getBalance()+amount);
					return true;
				}
			}
		}
		if(type=="withdraw")
		{
			SavingsAccount s=new SavingsAccount();
			for(int i=0;i<=index;i++)
			{
				if(accounts[i].getAccount()==accountNo)
				{
					if(accounts[i].getBalance()>=s.getMinimumDepositAmount())
					{
						accounts[i].setBalance(accounts[i].getBalance()-amount);
						return true;
					}
					throw new InsufficientBalanceException("Insufficient Balance");
				}
				
			}
		}
		return false;
	}
}
