import java.util.*;

class Product
{
	private int ID;
	private String Name;
	private int Price;

	// Set product data 
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name = Name;
	}
	void setPrice(int Price)
	{
		this.Price = Price;
	}
	
	// Send data for calculation
	int getID()
	{
		return ID;
	}
	String getName()
	{
		return Name;
	}
	int getPrice()
	{
		return Price;
	}
}