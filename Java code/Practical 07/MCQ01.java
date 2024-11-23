// Problem 

import java.util.*;
public class MCQ01
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int a = 10, b = 5, c = 1, result;
		result = a-++c-++b; // 10-(2)-(6)  = 2 
          	//      result = a-(2)-(6)    
         	//       result = 10-2=8
         	//       result = 8-6
        	//        result = 2 
	    	System.out.println (result);

	}
}