// There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, 
// that is JAR can contain maximum N candies when JAR is full. At any point of 
// time. JAR can have M number of Candies where M<=N. Candies are served to 
// the customers. JAR is never remain empty as when last k candies are left. JAR 
// if refilled with new candies in such a way that JAR get full. 
// Write a code to implement above scenario. Display JAR at counter with 
// available number of candies. Input should be the number of candies one 
// customer can order at point of time. Update the JAR after each purchase and 
// display JAR at Counter. 
// Output should give number of Candies sold and updated number of Candies in 
// JAR. 
// If Input is more than candies in JAR  return: INVALID INPUT


import java.util.*;
public class CandieJar
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int N = 50, k = 10, order;
		System.out.println("Jar size "+N+" candies and minimum candies "+k+"\n");
		int sold = 0;
		while(true){
			System.out.print("Order candies : ");
			order = sc.nextInt();
			if(order <= 0){
				System.out.println("Invalid input");
			}else{
				if(N>=order){
					N = N - order;
				}else{
					N = order - N;
				}
				if(k<=N){
					sold = sold + order;
					System.out.println("\nAvaliable candies : " + N);
					System.out.println("Sold candies : " + sold);
				}else{
					sold = sold + order;
					N = 50;
					System.out.println("\n	Jar filled");
					System.out.println("Avaliable candies : " + N);
					System.out.println("Sold candies : " + sold);
				}
			}
		}
		
	}
}