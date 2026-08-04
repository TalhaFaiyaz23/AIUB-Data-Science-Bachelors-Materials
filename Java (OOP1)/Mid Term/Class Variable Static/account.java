import java.lang.*;

public class account{
	
	private int accnb;
	private double balance;
	private static float ir; //static variable for objects
	
	public account()
	{
		System.out.println("Empty for account");
	}
	
	public account(int accnb, double balance, float ir)
	{
		this.accnb = accnb;
		this.balance = balance;
		this.ir = ir;
		
		System.out.println("Pera for account");
	
	}

	public void setAccnb(int accnb)
	{
		this.accnb = accnb;
	}
	
	public int getAccnb()
	{
		return accnb;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setIr(float ir)
	{
		this.ir = ir;
	}
	
	public float getIr()
	{
		return ir;
	}
	
	public void details()
	
	{
		System.out.println("Accnb: " + accnb +"\n" + "Balance: " + balance + "\n" + "Interest Rate :" + ir) ;

	}
	
	static{  //staticblock starts at first
		
		System.out.println("I am a Student");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
}