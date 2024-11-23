import java.util.*;
public class Pattern10trick01
{
	public static void main(String x[])
	{
		System.out.println("j<=4+i");
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=9; j++)
			{
				if(j<=4+i)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			for(int j = 1; j<=9; j++)
			{
				if(j<=4+i)
				{
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
}