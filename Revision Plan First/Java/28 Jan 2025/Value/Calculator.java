/*

Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.

*/

import java.util.*;

class Calculator
{
	public static void main(String ...a)
	{
		Add add = new Add();
		add.setValue(10, 20);
		System.out.println("Add is : "+add.getAdd());
		
		Mul mul = new Mul();
		mul.setValue(10, 2);
		System.out.println("Mul is : "+mul.getMul());
		
		Div div = new Div();
		div.setValue(14, 7);
		System.out.println("Div is : "+div.getDiv());
	}
}