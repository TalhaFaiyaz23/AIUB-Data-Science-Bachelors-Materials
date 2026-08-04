import java.lang.*;

public class Account 
{
	private int acc_nb;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty for Account");
	}
	
	public Account(int acc_nb,double balance)
	{
		this.acc_nb=acc_nb;
		this.balance=balance;
		System.out.println("Pera for Account");
	}
	
	public void setAccnb(int acc_nb)
	{
		this.acc_nb=acc_nb;
	}
	
	public int getAccNb()
	{
		return acc_nb;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void details()
	{
		System.out.println("AccNb: "+acc_nb+"\n"+"Balance: "+balance);
	}
	
	
	
}