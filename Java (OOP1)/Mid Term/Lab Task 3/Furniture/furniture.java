import java.lang.*;



public class furniture        // 4 attributes for this class

{
	private int weight;
	private String name;
	private int price;
	private String category;
	
	public electronics(int weight, String name, int price , String category)  //Constrtuctor
	
	{
			this.weight = weight;
			this.name = name;
			this.price = price;
			this.category = category;
		
	}


	public void setWeight(int weight)  //set functions for the input values.

	{
	
	this.weight = weight;
	
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

	public int getWeight()   //get functions for retrieving back the values

	{
	
	return weight;
	
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