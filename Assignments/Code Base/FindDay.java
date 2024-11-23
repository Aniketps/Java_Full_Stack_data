// Write a java program to input week number(1-7) and print day of week name 
// using switch case. java program to find week day name using switch case. How to 
// find day name of week using switch case in java programming.


import java.util.*;
public class FindDay
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int numD;		
		System.out.print("Enter day number: ");
		numD = sc.nextInt();
		switch(numD)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("invalid data");				
		}
	}
}