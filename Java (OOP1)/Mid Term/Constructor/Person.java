import java.lang.*;



public class Person         // 3 attributes for this class

{
	private int id;
	private String name;
	private int age;
	
	public Person()  //Constrtuctor
	
	{
			System.out.println("weije");
	}
	
	public Person(int id, String name, int age)
	
	{
			this.id = id;
			this.name = name;
			this.age = age;
			
		
	}


public void setId(int id)  //set functions for the input values.

{
	
	this.id = id;
	
}

public void setName(String name)

{
	
	this.name = name;
	
}

public void setAge(int age)

{
	
	this.age = age;
	
}

public int getId()   //get functions for retrieving back the values

{
	
	return id;
	
}

public String getName()

{
	
	return name;
	
}

public int getAge()

{
	
	return age;
	
}

	
	public static void main(String args[])       //main function
	{
		Person p1 = new Person();
		p1.setId(111);
		p1.getId();
		
		System.out.println("Output of" + p1.getId());
		System.out.println("Output of" + p1.getName());
		
		Person p2 = new Person();
		p2.setName("Naruto");
		p2.setAge(23);
		
		System.out.println("Output of" + p2.getName());
		System.out.println("Output of" + p2.getAge());
		
		Person p3 = new Person(222, "Itachi", 322);
		
	}
	

}
		