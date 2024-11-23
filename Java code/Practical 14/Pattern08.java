import java.util.*;
public class Pattern08
{
	public static void main(String x[])
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i>=(6-j))
				{
					char data = i%2==0? '*' : '#';
					System.out.print(data);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}