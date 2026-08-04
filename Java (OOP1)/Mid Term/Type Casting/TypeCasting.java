import java.lang.*;

public class TypeCasting	

{
	
	public static void main(String args[])
	{
		char c = 'B';  // Implicit Value Typecasting
		int i = 24246;
		
		System.out.println(" Before Implicit char c :" + c);
		
		i = c;
		
		System.out.println(" After Implicit char c :" + i);
		
		int j = 120;  // Explicit Value Typecasting
		char d = 'A';
		
		System.out.println(" Before Explicit char d :" + d);
		
		j = (char)d;
		
		System.out.println(" After Explicit char j :" + j);
	}
	
}
		
		