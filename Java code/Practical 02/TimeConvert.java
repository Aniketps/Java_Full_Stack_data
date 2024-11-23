// Write a java program to convert seconds to hours, minutes and seconds

import java.util.*;
public class TimeConvert
{
	public static void main(String x[])
	{
		Scanner Ani = new Scanner(System.in);
		int Seconds, Rhours, Rminutes, Rseconds;
		System.out.println("Enter Seconds");
		Seconds = Ani.nextInt();
		Rminutes =  (Seconds/60)%60;
		Rhours = (Seconds/60)/60;
		Rseconds = (Seconds%60)%60;
		System.out.println("The time is :"+Rhours+"H:"+Rminutes+"Min:"+Rseconds+"Sec");
	}
}