import java.lang.*;

public class Cat extends Animal
{
	private String pettable;
	
	public Cat()
	{
		
	}
	public Cat(String animalType, int age, double dangerRating, String pettable)
	{
		super(animalType,age,dangerRating);
		this.pettable=pettable;
	}
	public void setPettable(String pettable)
	{
		this.pettable=pettable;
	}
	
	public String getPettable()
	{
		return pettable;
	}
	public void details()
	{
		super.details();
		System.out.println("Is it pettable?: "+pettable+"\n");
	}
}