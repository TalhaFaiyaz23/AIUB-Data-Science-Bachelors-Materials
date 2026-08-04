import java.lang.*;

public class Customer implements OpCustomer
{
	private String name;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty for customer");
	}
	
	public Customer(String name,int size)//size
	{
		this.name=name;
		acc=new Account[size];
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
	
	public void insertAccount(Account a)
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==null)
			{
				acc[i]=a;
				break;
			}
		}
	}
	
	public void deleteAccount(Account a)//a3
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==a)
			{
				acc[i]=null;
				break;
			}
		}
	}
	
	public void updateAccount(Account a,double balance)
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==a)
			{
				acc[i].setBalance(balance);
				break;
			}
		}
	}
	
	public void details()
	{
		System.out.println("Name: "+name);
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]!=null)
			{
				acc[i].details();
			}
			else
			{
				System.out.println("Index Null");
			}
		}
	}
	
	
}