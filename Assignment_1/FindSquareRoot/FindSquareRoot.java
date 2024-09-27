package org.FindSquareRoot;
import java.util.Scanner;
public class FindSquareRoot {
	public static int sqrt(int num,int i){
		if (i*i==num)
		{
			return i;
		}else
		if(num==0)
		{
			return 0;
		}else 	
		if(i*i>num)
		{
			return i-1;
		}else 
		return sqrt(num,i+1);
		
	}

		public static void main (String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the number : ");
			int num=sc.nextInt();
			System.out.println(sqrt(num,1));
			sc.close();
		}
}
