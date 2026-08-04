import java.lang.*;

public static void main(String args[])       //main function
	
	{
		employee c1 = new employee();
		employee c2 = new employee();
		employee c3 = new employee();
		
		c1.setPosition(1);
		c1.getPosition();
		c1.setName("Mahmudul Hassan");
		c1.getName();
		c2.setSalary(100000);
		c2.getSalary();
		c3.setDepartment("Sales");
		c3.getDepartment();
		
		System.out.println("Position : " + c1.getPosition());
		System.out.println("Name : " + c1.getName());
		System.out.println("Salary: " + c2.getSalary());
		System.out.println("Department : " + c3.getDepartment());
		
		
	}
		