import java.lang.*;

public class Animal
{
	private String animalType;
	private int age;
	private double dangerRating;
	
	public Animal()
	{
		
	}
	public Animal(String animalType, int age, double dangerRating)
	{
		this.animalType=animalType;
		this.age=age;
		this.dangerRating=dangerRating;
	}
	public void setAnimalType(String animalType)
	{
		this.animalType=animalType;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setDangerRating(double dangerRating)
	{
		this.dangerRating=dangerRating;
	}
	public String getAnimalType()
	{
		return animalType;
	}
	public int getAge()
	{
		return age;
	}
	public double getDangerRating()
	{
		return dangerRating;
	}
	public void details()
	{
		System.out.println("Animal Type: "+animalType+"\n"+"Age: "+age+"\n"+"Danger Rating: "+dangerRating+"/10");
	}
}