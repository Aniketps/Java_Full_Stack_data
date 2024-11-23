import java.util.*;

public class functionTry
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printTable(num);
		
	}
	
	public static String printTable(int num)
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i*num);
		}
		return "Done";
	}
}