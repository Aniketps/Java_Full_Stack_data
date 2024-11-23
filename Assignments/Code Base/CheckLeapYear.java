// Checking if a given year is leap year or not 


import java.util.*;
public class CheckLeapYear
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int y;
		System.out.print("Year : ");
		y = sc.nextInt();
		if((y%4)==0){
			System.out.println(y+ " leap year");
		}else if((y%400)==0){
			if((y%100)==0){
				System.out.println(y+ " leap year");
			}
		}else{
			System.out.println(y+" not a leap year");	
		}
	}
}