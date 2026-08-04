import java.lang.*;

public class Device
{
	private int id;
	private String model;
	private double price;
	
	public Device()
	{
		
	}
	public Device(int id,String model, double price)
	{
		this.id=id;
		this.model=model;
		this.price=price;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setPrice(double price)
	{
		this.price=price;		
	}
	public int getID()
	{
		return id;
	}
	public String getModel()
	{
		return model;
	}
	public double getPrice()
	{
		return price;
	}
	public void details()
	{
		System.out.println("ID: "+id+"\n"+"Model: "+model+"\n"+"Price: $"+price);
	}
}