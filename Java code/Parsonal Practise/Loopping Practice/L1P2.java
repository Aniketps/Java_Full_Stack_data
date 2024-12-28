// Q2. WAP to print the following pattern?

public class L1P2
{
	public static void main(String ...x)
	{
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<9; j++)
			{
				if(j >= 4-i && i+4 >= j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
