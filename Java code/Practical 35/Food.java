import java.util.*;

class Food
{
	// Instance variables to stare food data
	private int ID;
	private String Name;
	private int Price;

	// Set Data to instance variables 
	void setID(int ID)
	{
		this.ID = ID;
	}
	void setName(String Name)
	{
		this.Name =Name;
	}
	void setPrice(int Price)
	{
		this.Price = Price;
	}

	// Send data to place where it needs
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