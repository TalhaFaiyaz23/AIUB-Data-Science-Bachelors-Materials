import java.lang.*;



public class countries        // 4 attributes for this class

{
	private int position;
	private String name;
	private int population;
	private String continent;


	public void setPosition(int position)  //set functions for the input values.

	{
	
	this.position = position;
	
	}

	public void setName(String name)

	{
	
	this.name = name;
	
	}

	public void setPopulation(int population)

	{
	
	this.population = population;
	
	}
	
	public void setContinent(String continent)

	{
	
	this.continent = continent;
	
	}

	public int getPosition()   //get functions for retrieving back the values

	{
	
	return position;
	
	}

	public String getName()

	{
	
	return name;
	
	}

	public int getPopulation()

	{
	
	return population;
	
	}
	
	public String getContinent()

	{
	
	return continent;
	
	}

}