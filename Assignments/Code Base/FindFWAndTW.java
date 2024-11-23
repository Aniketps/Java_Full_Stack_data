// An automobile company manufactures both a two wheeler (TW) and a four 
// wheeler (FW). A company manager wants to make the production of both 
// types of vehicle according to the given data below: 
// • 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v 
// • 2nd data, Total number of wheels = W 
// The task is to find how many two-wheelers as well as four-wheelers need to 
// manufacture as per the given data.


import java.util.*;
public class FindFWAndTW
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int V, W;
		System.out.print("Enter Vehible count : ");
		V = sc.nextInt();
		System.out.print("Enter Wheels count : ");
		W = sc.nextInt();
		int x, y;
		if(2<=W)
		{
			if(W%2==0)
			{
				if(V<W)
				{
					y = ((4 * V)-W)/2;
					x = V - y;
					System.out.println("TW : "+ y);
					System.out.println("FW : "+ x);
				}else{
					System.out.println("Vehicles cant be higher than Wheels");
				}
			}else{
				System.out.println("Single wheel not allowed");
			}
		}else{
			System.out.println("Vehicle must be more than or equal to 2");
		}
	}
}