import java.lang.*;

public class SavingAccount extends Account
{
	public float ir;
	
	public SavingAccount()
	{
		System.out.println("Empty for SavingAccount");
	}
	
	public SavingAccount(int accnb,double balance,float ir)
	{
		super(accnb,balance);
		this.ir=ir;
		System.out.println("Para for SavingAccount");
	}
	
	public void setIr(float ir)
	{
		this.ir=ir;
	}
	
	public float getIr()
	{
		return ir;
	}
	
	public void details()
	{
		System.out.println("Accnb: "+getAccnb() +"\n"+"Balance:"+getBalance()+"\n"+"Ir: "+ir);
	}
}