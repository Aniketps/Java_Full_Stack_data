import java.util.*;

class Customer
{
	private int ID;
	private String Name;
	private int UnitConsumed;
	private int UnitRate;

	Customer()
	{
		UnitRate = 15;
		Name = "Anike Pardeshi";
		UnitConsumed = 20;
		ID = 12;
	}
	int Total;
	
	void calBill()
	{
		Total = UnitConsumed*UnitRate;
		System.out.println("Bill Calculated");
	}
	void getBill()
	{	
		System.out.println("Total bill is "+Total);
		System.out.println("Till January 31, 2025");
		System.out.println("After January 31, 2025 will be "+((Total*110)/100));
	}
}