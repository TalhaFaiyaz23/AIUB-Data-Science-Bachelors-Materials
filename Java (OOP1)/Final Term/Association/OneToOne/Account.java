import java.lang.*;

public class Account
{
	private int accnb;
	private double bal;
	
	public Account()
	
	{
		System.out.println("Empty for Account");
	}
	
	public Account(int accnb, double bal)
	{
		this.accnb=accnb;
		this.bal=bal;
	}
	
	public void setAccount(int accnb)
	{
		this.accnb=accnb;
	}
	public int getAccount()
	{
		return accnb;
	}	
	public void setBalance(int bal)
	{
		this.bal=bal;
	}
	public double getBalance()
	{
		return bal;
	}
	
	public void details()
	{
		System.out.println("Account Number : "+accnb+"\n"+"Balance :"+bal);
	}
}