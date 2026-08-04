import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Manager M1 = new Manager("Sheikh Mahmud", 275, 65000, 7);
		M1.details();
		
		Chef C1 = new Chef("Sunil Shetty", 987, 32600.66, 15);
		C1.details();
	}
}