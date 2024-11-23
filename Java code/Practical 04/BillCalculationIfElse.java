// WAP to compute the electricity meter unit and per rate and calculate its
// total bill if bill is greater than 2000 then give discount of 10% 
// otherwise there is no discount using if else

import java.util.*;
public class BillCalculationIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int unit, unitRate, bill;
		System.out.print("Enter unit : ");
		unit = Ani.nextInt();
		System.out.print("Enter unit Rate: ");
		unitRate = Ani.nextInt();
		bill = unit*unitRate;
		if(bill>=2000)
		{
			bill = bill - ((bill*10)/100);
			System.out.println("The bill is : " + bill);
		}else{
			System.out.println("The bill is : " + bill);
		}
	}
}