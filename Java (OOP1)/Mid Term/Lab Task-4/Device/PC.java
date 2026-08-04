import java.lang.*;

public class PC extends Device
{
	private String Monitor;
	
	public PC()
	{
		
	}
	public PC(int id,String model,double price,String Monitor)
	{
		super(id,model,price);
		this.Monitor=Monitor;
	}	
	public void setMonitor(String Monitor)
	{
		this.Monitor=Monitor;
	}
	public String getMonitor()
	{
		return Monitor;
	}
	public void details()
	{
		super.details();
		System.out.println("Monitor: "+Monitor);
	}
}