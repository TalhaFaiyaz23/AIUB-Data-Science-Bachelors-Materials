import java.lang.*;

public static void main(String args[])       //main function
	
	{
		electronics c1 = new electronics();
		electronics c2 = new electronics();
		electronics c3 = new electronics();
		
		c1.setPosition(1);
		c1.getPosition();
		c1.setName("Mobile");
		c1.getName();
		c2.setPrice(50000);
		c2.getPrice();
		c3.setCategory("Light Weight");
		c3.getCategory();
		
		System.out.println("Position : " + c1.getPosition());
		System.out.println("Name : " + c1.getName());
		System.out.println("Population: " + c2.getPrice());
		System.out.println("Continent : " + c3.getCategory());
		
		
	}
		