import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,246476);
		
		Customer c1=new Customer("Itachi",a1);
		c1.details();
	}
}