import java.lang.*;

public class Manager extends Employee
{
	private int managingExperience;
	
		public Manager()
	{
		
	}
	public Manager(String name, int id, double salary, int managingExperience)
	{	
		super(name,id,salary);
		this.managingExperience=managingExperience;
	}
	public void setManagingExperience(int managingExperience)
	{
		this.managingExperience=managingExperience;
	}
	public int getManagingExperience()
	{
		return managingExperience;
	}
	public void details()
	{
		super.details();
		System.out.println("Managing Experience(years): "+managingExperience+"\n");
	}
}