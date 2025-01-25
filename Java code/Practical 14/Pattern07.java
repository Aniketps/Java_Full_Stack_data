import java.util.*;
public class Pattern07
{
	public static void main(String x[])
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i>=j)
				{
					char data = j%2==0? '#' : '*';
					System.out.print(data);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}