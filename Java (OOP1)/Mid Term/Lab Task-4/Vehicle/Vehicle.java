import java.lang.*;

public class Vehicle
{
	private int id;
	private String color;
	private double price;
	
	public Vehicle()
	{
		
	}
	public Vehicle(int id,String color, double price)
	{
		this.id=id;
		this.color=color;
		this.price=price;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setPrice(double price)
	{
		this.price=price;		
	}
	public int getID()
	{
		return id;
	}
	public String getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}
	public void details()
	{
		System.out.println("ID: "+id+"\n"+"Color: "+color+"\n"+"Price: $"+price);
	}
}