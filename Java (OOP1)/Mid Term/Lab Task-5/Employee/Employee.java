import java.lang.*;

public class Employee
{
	private String name;
	private int id;
	private double salary;
	
	public Employee()
	{
		
	}
	public Employee(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public void details()
	{
		System.out.println("Name: "+name+"\n"+"ID: "+id+"\n"+"Salary: "+salary+"BDT");
	}
}