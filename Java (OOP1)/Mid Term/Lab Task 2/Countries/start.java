import java.lang.*;

public static void main(String args[])       //main function
	
	{
		countries c1 = new countries();
		countries c2 = new countries();
		countries c3 = new countries();
		
		c1.setPosition(1);
		c1.getPosition();
		c1.setName("Bangladesh");
		c1.getName();
		c2.setPopulation(1800000000);
		c2.getPopulation();
		c3.setContinent("Asia");
		c3.getContinent();
		
		System.out.println("Position : " + c1.getPosition());
		System.out.println("Name : " + c1.getName());
		System.out.println("Population: " + c2.getPopulation());
		System.out.println("Continent : " + c3.getContinent());
		
		
	}
		