import java.lang.*;



public class employee        // 4 attributes for this class

{
	private int position;
	private String name;
	private int salary;
	private String department;


	public void setPosition(int position)  //set functions for the input values.

	{
	
	this.position = position;
	
	}

	public void setName(String name)

	{
	
	this.name = name;
	
	}

	public void setSalary(int salary)

	{
	
	this.salary = salary;
	
	}
	
	public void setDepartment(String department)

	{
	
	this.department = department;
	
	}

	public int getPosition()   //get functions for retrieving back the values

	{
	
	return position;
	
	}

	public String getName()

	{
	
	return name;
	
	}

	public int getSalary()

	{
	
	return salary;
	
	}
	
	public String getDepartment()

	{
	
	return department;
	
	}

}