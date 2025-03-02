/*

3. Electricity Bill Calculation
Create a Customer class with fields customerName, customerID, and unitsConsumed. Add a method to calculate the bill amount based on units consumed (slab rates).
Explanation: Implement a tiered billing system with logic for each slab.

*/
import java.util.*;

class ElectricityBill
{
	public static void main(String ...a)
	{
		Customer customer = new Customer();
		System.out.println("All Data Set");
		customer.calBill();
		customer.getBill();
	}
}