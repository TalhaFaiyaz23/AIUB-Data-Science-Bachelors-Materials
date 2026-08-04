import java.lang.*;

public class Customer
{
	private String name;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty Cons. for Customer");
	}
	
	public Customer(String name,int size)
	{
		this.name=name;
		acc=new Account[size];
		System.out.println("Pera Cons. for Customer");
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
	
	public void deleteAccount(Account a)//a=a2
	{
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]==a)
			{
				acc[i]=null;
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
		}
	}
	
}