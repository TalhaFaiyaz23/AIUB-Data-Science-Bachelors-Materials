import java.lang.*;

public class Customer
{
	private String name;
	private Account acc;
	
	public Customer()
	
	{
		System.out.println("Empty for Customer");
	}
	
	public Customer(String name, Account acc)
	{
		this.name=name;
		this.acc=acc;
		System.out.println("Pera for Customer");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}	
	public void setAccount(Account acc)
	{
		this.acc=acc;
		
	}
	public Account getAccount()
	{
		return acc;
	}
	
	public void details()
	{
		System.out.println("Name : "+name+"\n");
		acc.details();
	}
}