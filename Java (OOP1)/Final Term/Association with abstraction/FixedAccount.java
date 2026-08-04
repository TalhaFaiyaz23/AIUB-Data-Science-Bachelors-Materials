import java.lang.*;

public class FixedAccount extends Account
{
	private int year;
	
	public FixedAccount()
	{
		System.out.println("Empty for Fixed");
	}
	
	public FixedAccount(int accnb,double balance,int year)
	{
		super(accnb,balance);
		this.year=year;
		System.out.println("Para. for Fixed");
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void details()
	{
		System.out.println("Accnb: "+getAccnb() +"\n"+"Balance:"+getBalance()+"\n"+"Year: "+year);
	}
	
	
}