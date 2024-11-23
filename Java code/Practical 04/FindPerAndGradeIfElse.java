// Write a java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer
// Calculate percentage and grade according to following using if else

import java.util.*;
public class FindPerAndGradeIfElse
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int phy, che,bio,math,comp;
		float perc;
		String grade = "";
		System.out.print("Enter Marks of Physics : ");
		phy = Ani.nextInt();
		System.out.print("Enter Marks of Chemistry: ");
		che = Ani.nextInt();
		System.out.print("Enter Marks of Biology: ");
		bio = Ani.nextInt();
		System.out.print("Enter Marks of Mathematics : ");
		math = Ani.nextInt();
		System.out.print("Enter Marks of Computer: ");
		comp = Ani.nextInt();
		perc = (phy + che + bio + math + comp)/ 5;
		if(perc >= 90 && perc < 100)
		{
			grade = "Grade A";
		}
		if(perc >= 80 && perc < 90)
		{
			grade = "Grade B";
		}
		if(perc >= 70 && perc < 80)
		{
			grade = "Grade C";
		}
		if(perc >= 60 && perc < 70)
		{
			grade = "Grade D";
		}
		if(perc >= 40 && perc < 60)
		{
			grade = "Grade E";
		}
		if(perc < 40)
		{
			grade = "Grade F";
		}
		System.out.println(perc + "% and grade is " + grade);
	}
}