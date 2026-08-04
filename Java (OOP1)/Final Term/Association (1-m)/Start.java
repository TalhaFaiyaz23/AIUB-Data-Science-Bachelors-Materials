import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,450245);
		Account a2=new Account(222,5413098);
		Account a3=new Account(333,896245);
		
		Customer c1=new Customer("Itachi",5);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		
		c1.deleteAccount(a2);
		
		c1.details();
		
		
	}
}