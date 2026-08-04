import java.lang.*;



public class Student        // 3 attributes for this class

{
	private int id;
	private String name;
	private double CGPA;
	private String address;


	public void setId(int id)  //set functions for the input values.

	{
	
	this.id = id;
	
	}

	public void setName(String name)

	{
	
	this.name = name;
	
	}

	public void setAddress(String address)

	{
	
	this.address = address;
	
	}
	
	public void setCGPA(float CGPA)

	{
	
	this.CGPA = CGPA;
	
	}

	public int getId()   //get functions for retrieving back the values

	{
	
	return id;
	
	}

	public String getName()

	{
	
	return name;
	
	}

	public String getAddress()

	{
	
	return address;
	
	}
	
	public double getCGPA()

	{
	
	return CGPA;
	
	}

	
	public static void main(String args[])       //main function
	
	{
		Student p1 = new Student();
		p1.setId(25-62983-2);
		p1.getId();
		p1.setCGPA(3N);
		p1.getCGPA();
		p1.setName("Naruto");
		p1.getName();
		p1.setAddress("Iqbal Road");
		p1.getAddress();
		
		System.out.println("ID : " + p1.getId());
		System.out.println("Name : " + p1.getName());
		System.out.println("CGPA : " + p1.getCGPA());
		System.out.println("CGPA : " + p1.getAddress());
		
		
	}
	

}		
		