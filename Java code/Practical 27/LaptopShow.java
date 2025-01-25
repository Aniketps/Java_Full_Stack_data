// WAP to create POJO class name as Laptop with field id, name ,price and ramspace,harddiskspace etc and input the details of laptop and display it

import java.util.*;
public class LaptopShow
{
	public static void main(String ...x)
	{
		Scanner sc = new Scanner(System.in);
		Laptop laptop = new Laptop();
		Shop shop = new Shop();
		
		System.out.print("What is laptop id: ");
		int id = sc.nextInt();
		laptop.setID(id);
		
		System.out.print("What is laptop name: ");
		String Name = sc.next();
		laptop.setName(Name);
		
		System.out.print("What is laptop price: ");
		int Price = sc.nextInt();
		laptop.setPrice(Price);

		System.out.print("What is laptop RAM: ");
		int RAM = sc.nextInt();
		laptop.setRAM(RAM);

		System.out.print("What is laptop ROM: ");
		String ROM = sc.next();
		laptop.setROM(ROM);

		shop.setLaptop(laptop);
		shop.getLaptop(laptop);
		
	}
}

class Shop{
	private Laptop laptop;
	
	void setLaptop(Laptop laptop)
	{
		laptop = laptop;
	}
	void getLaptop(Laptop laptop)
	{
		System.out.println("Laptop ID is : "+laptop.getID());
		System.out.println("Laptop Name is : "+laptop.getName());
		System.out.println("Laptop Price is : "+laptop.getPrice());
		System.out.println("Laptop RAM is : "+laptop.getRAM());
		System.out.println("Laptop ROM is : "+laptop.getROM());
	}
}

class Laptop
{
	private int ID;
	private String Name;
	private int Price;
	private int RAM;
	private String ROM;

	void setID(int id)
	{
		ID = id;
	}
	public int getID()
	{
		return ID;
	}
	
	void setName(String name)
	{
		Name = name;
	}
	public String getName()
	{
		return Name;
	}

	void setPrice(int price)
	{
		Price = price;
	}
	public int getPrice()
	{
		return Price;
	}

	void setRAM(int ram)
	{
		RAM = ram;
	}
	public int getRAM()
	{
		return RAM;
	}
	
	void setROM(String rom)
	{
		ROM = rom;
	}
	public String getROM()
	{
		return ROM;
	}
}