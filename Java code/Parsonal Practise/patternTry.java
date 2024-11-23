public class patternTry
{
	public static void main(String x[])
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=9;j++)
			{
				if((i>=6-j) && (j<=4+i))
				{
					System.out.print(6-j>0?6-j : j-4);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}
}