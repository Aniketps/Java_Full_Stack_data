class Product
{

	private int id;
	private String Name;
	private int Price;

	void setId(int Id)
	{
		id = Id;
	}
	public int getId()
	{
		return id;
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

}

class Shop
{
	private Product prod;

	void getProduct(Product p)
	{
		prod = p;
		
		System.out.println("Product Id is :        "+ prod.getId());
		System.out.println("Product Name is : "+ prod.getName());
		System.out.println("Product Price is :  "+ prod.getPrice());
	}
}

public class AddProductToShow
{
	public static void main(String ...x)
	{
		Product prod = new Product();	
		Shop shop = new Shop();

		prod.setId(10);
		prod.setName("ABC");
		prod.setPrice(100);

		shop.getProduct(prod);
	}
}