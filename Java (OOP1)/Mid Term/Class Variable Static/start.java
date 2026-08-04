import java.lang.*;

public class start {
	
	public static void main(String[] args)

	{ 
		account a1 = new account();
		account a2 = new account(111,2124,5.5F);
		account a3 = new account(222,134314,9.5F);
		
		account a4 = new account(); // Empty Constructor
		
		a1.details();
		a2.details();
		a3.details();
		
		
	}
	
	static{  //it only works outside a static class, not within another static class.
		
		System.out.println("I am a CSE Engineer");
	}
	
	

}