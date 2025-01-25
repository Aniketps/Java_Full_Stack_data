import java.util.*;

public class name
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		String data = printFunc();
		System.out.println(data);
	}

	protected static String printFun()
	{
		int d1 = 12;
		double d2 = 12.12515;
		float d3 = 12;
		String d4 = ani.printFunc();
		char d5 = 'A';
		
		return d4;
	}
}

class ani extends name
{
	protected static String printFunc()
	{
		int d1 = 12;
		double d2 = 12.12515;
		float d3 = 12;
		String d4 = printFun();
		char d5 = 'A';
		
		return d4;
	}
}