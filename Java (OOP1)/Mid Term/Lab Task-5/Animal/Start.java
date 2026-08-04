import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Tiger T1 = new Tiger("Wild",4,10F,"Sundarban");
		T1.details();
		
		Cat C1 = new Cat("Domesticated",2,1.5F,"Yes");
		C1.details();
	}
}