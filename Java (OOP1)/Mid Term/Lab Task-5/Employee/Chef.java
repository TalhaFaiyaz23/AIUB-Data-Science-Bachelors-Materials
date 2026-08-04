import java.lang.*;

public class Chef extends Employee
{
	private int cookingExperience;
	
	public Chef()
	{
		
	}
	public Chef(String name, int id, double salary, int cookingExperience)
	{
		super(name,id,salary);
		this.cookingExperience=cookingExperience;
	}
	public void setCookingExperience(int cookingExperience)
	{
		this.cookingExperience=cookingExperience;
	}
	public int cookingExperience()
	{
		return cookingExperience;
	}
	public void details()
	{
		super.details();
		System.out.println("Cooking Experience(years): "+cookingExperience+"\n");
	}
}