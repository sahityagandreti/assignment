
public class Test 
{
    public static void main(String[] args)
    {
    	Bank b=new Bank("icici","Hyd",new Account[10]);
    	b.addAccount(new Account(26351248,9/7/2001,90000.00));
    	b.addAccount(new Account(37164818,10/7/2002,40000.00));
    	b.addAccount(new Account(47358195,11/7/2003,50000.00));
    	b.addAccount(new Account(36487145,4/7/2004,60000.00));
    	b.showAccounts();
    	System.out.println(b.transaction("withdraw",36487145, 50));
    	
    	
    	
    	
    	
    }
}
