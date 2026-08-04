import java.lang.*;

public abstract class Account implements OpAccount
{
	private int accnb;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty for Account");
	}
	
	public Account(int accnb,double balance)
	{
		this.accnb=accnb;
		this.balance=balance;
		System.out.println("Pera for Account");
	}
	
	public void setAccnb(int accnb)
	{
		this.accnb=accnb;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public int getAccnb()
	{
		return accnb;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposite(int amnt)
	{
		if(amnt>0)
		{
			balance+=amnt;
		}
		else
		{
			System.out.println("Check Balance");
		}
		
	}
	
	public void withdraw(int amnt)
	{
		if(balance>=amnt && amnt>0)
		{
			balance-=amnt;
		}
		else
		{
			System.out.println("Check Amount");
		}
		
	}
	
	public abstract void details();
	
	
}