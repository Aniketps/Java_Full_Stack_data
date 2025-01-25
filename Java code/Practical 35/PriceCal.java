import java.util.*;

class PriceCal
{
	int calculate(Product product[])
	{
		int total = 0;
		for(int i = 0; i<product.length; i++)
		{
			total = total + product[i].getPrice();
		}
		return total;
	}
}