// Write a java program to input month number and print total number of days in 
// month using switch...case. java program to find total number of days in a month 
// using switch...case. Logic to print number of days in a month 
// using switch...case in java programming.


import java.util.*;
public class FindDaysInMonth
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int numM;		
		System.out.print("Enter month number: ");
		numM = sc.nextInt();
		switch(numM)
		{
			case 1:
				System.out.println("Total days in month 31");
				break;
			case 2:
				System.out.println("Total days in leap year 28 and in common 29");
				break;
			case 3:
				System.out.println("Total days in month 31");
				break;
			case 4:
				System.out.println("Total days in month 30");
				break;
			case 5:
				System.out.println("Total days in month 31");
				break;
			case 6:
				System.out.println("Total days in month 30");
				break;
			case 7:
				System.out.println("Total days in month 31");
				break;
			case 8:
				System.out.println("Total days in month 31");
				break;
			case 9:
				System.out.println("Total days in month 30");
				break;
			case 10:
				System.out.println("Total days in month 31");
				break;
			case 11:
				System.out.println("Total days in month 30");
				break;
			case 12:
				System.out.println("Total days in month 31");
				break;
			default:
				System.out.println("invalid data");				
		}
	}
}