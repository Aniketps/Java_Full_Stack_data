// Q3. Write a java program to swap to first two digit & last two digit of a number.

import java.util.*;

class SwapDigits
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int lastTwo = num%100;
		int temp = num;
		int Zeros = 1;
		while(temp>0)
		{
			Zeros = Zeros*10;
			temp = temp/10;
		}
		if(Zeros <= 1000)
		{
			System.out.println("Enter 4 digits");
			System.exit(0);
		}
		int middleRemain = (num%(Zeros/100))/100;
		int FirstTwo = (num/(Zeros/100));
		int newCopy = (FirstTwo+(middleRemain*100))+(lastTwo*(Zeros/100));
		System.out.println("The final is : "+newCopy);
	}
}