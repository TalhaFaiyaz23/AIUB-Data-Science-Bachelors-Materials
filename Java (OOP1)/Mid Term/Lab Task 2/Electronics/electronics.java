import java.lang.*;



public class electronics        // 4 attributes for this class

{
	private int position;
	private String name;
	private int price;
	private String category;


	public void setPosition(int position)  //set functions for the input values.

	{
	
	this.position = position;
	
	}

	public void setName(String name)

	{
	
	this.name = name;
	
	}

	public void setPrice(int price)

	{
	
	this.price = price;
	
	}
	
	public void setCategory(String category)

	{
	
	this.category = category;
	
	}

	public int getPosition()   //get functions for retrieving back the values

	{
	
	return position;
	
	}

	public String getName()

	{
	
	return name;
	
	}

	public int getPrice()

	{
	
	return price;
	
	}
	
	public String getCategory()

	{
	
	return category;
	
	}

}