import java.lang.*;



public class planets        // 4 attributes for this class

{
	private int sequence;
	private String name;
	private String colour;
	private String moon;


	public void setSequence(int sequence)  //set functions for the input values.

	{
	
	this.sequence = sequence;
	
	}

	public void setName(String name)

	{
	
	this.name = name;
	
	}

	public void setColour(String  colour)

	{
	
	this.colour = colour;
	
	}
	
	public void setMoon(String moon)

	{
	
	this.moon = moon;
	
	}

	public int getSequence()   //get functions for retrieving back the values

	{
	
	return sequence;
	
	}

	public String getName()

	{
	
	return name;
	
	}

	public String getColour()

	{
	
	return colour;
	
	}
	
	public String getMoon()

	{
	
	return moon;
	
	}

}