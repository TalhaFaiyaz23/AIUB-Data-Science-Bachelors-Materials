import java.lang.*;

public class Tiger extends Animal
{
	private String location;
	
	public Tiger()
	{
		
	}
	public Tiger(String animalType, int age, double dangerRating, String location)
	{
		super(animalType,age,dangerRating);
		this.location=location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	
	public String getLocation()
	{
		return location;
	}
	public void details()
	{
		super.details();
		System.out.println("Location: "+location+"\n");
	}
}