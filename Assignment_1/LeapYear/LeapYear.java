package org.LeapYear;
import java.util.Scanner;
public class LeapYear {
	public static void main (String args[])
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Year: ");
	int num=sc.nextInt();

	boolean  W=(num%100==0)?((num%400==0)?true:false):((num%4==0)?true:false);
	System.out.println(W);
	sc.close();
	}
}
