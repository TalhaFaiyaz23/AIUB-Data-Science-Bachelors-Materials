import java.lang.*;

public class Car extends Vehicle
{
	private String carType;
	
	public Car()
	{
		
	}
	public Car(int id,String color,double price,String carType)
	{
		super(id,color,price);
		this.carType=carType;
	}	
	public void setCarType(String carType)
	{
		this.carType=carType;
	}
	public String getCarType()
	{
		return carType;
	}
	public void Display()
	{
		super.details();
		System.out.println("Car Type: "+carType);
	}
}