import java.lang.*;

public static void main(String args[])       //main function
	
	{
		furniture c1 = new furniture();
		furniture c2 = new furniture();
		furniture c3 = new furniture();
		
		c1.setWeight(10);
		c1.getWeight();
		c1.setName("Table");
		c1.getName();
		c2.setPrice(25000);
		c2.getPrice();
		c3.setCategory("Wood");
		c3.getCategory();
		
		System.out.println("Position : " + c1.getWeight());
		System.out.println("Name : " + c1.getName());
		System.out.println("Population: " + c2.getPrice());
		System.out.println("Continent : " + c3.getCategory());
		
		
	}
		