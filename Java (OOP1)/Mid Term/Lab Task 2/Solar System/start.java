import java.lang.*;

public static void main(String args[])       //main function
	
	{
		planets c1 = new planets();
		planets c2 = new planets();
		planets c3 = new planets();
		
		c1.setSequence(3);
		c1.getSequence();
		c1.setName("Earth");
		c1.getName();
		c2.setColour("Blue");
		c2.getColour();
		c3.setMoon("Yes");
		c3.getMoon();
		
		System.out.println("Number : " + c1.getSequence());
		System.out.println("Name : " + c1.getName());
		System.out.println("Colour: " + c2.getColour());
		System.out.println("Moon? : " + c3.getMoon());
		
		
	}
		