import java.lang.*;

public class Constructor2{
	
	private int id;
	private String name;  // since there is not "static", so name is Instance variable. It shares different memory.For accessing instance variable, you will need an object.
	
	private static float discount;  // discount is a class variable, every object of this class shares same memory. If you want to access class variable , you need class name.
	
	public Constructor2(){}
	public Constructor2(int i, String n, float discount){}
	
	public void setID(int id){}
	public void calculation(int x)
		
		{
			if(x > 100)
			{
				double z;       // z is a local variable inside if. You cannot access this outside the {}.
				z= x*discount;
				
				
			} System.out.println(z);
			
		}
		
	public void calculated(int y)
	
			{
				for(int j = 0; j<y; j++)
					
					{
						double total;
						total = j+y;
						System.out.println(total);
					}
					
			}
			
}