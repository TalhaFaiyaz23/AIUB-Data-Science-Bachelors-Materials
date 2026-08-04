import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new FixedAccount(111,30000,5);
		Account a2=new SavingAccount(222,74321,7.5F);
		
		FixedAccount f1=new FixedAccount(333,5332,7);
		
		a1.deposite(50000);
		a1.withdraw(40000);
		
		Customer c1=new Customer("Naruto",5);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(f1);
		c1.updateAccount(f1,2794810);
		
		
		c1.details();
	}
}