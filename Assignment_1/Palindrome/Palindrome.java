package org.Palindrome;
import java.util.Scanner;
public class Palindrome {
	public static int pali(int num,int rev)
	{
		
		if(num==0)
		{
			return rev;
		}else if(num>0)
		{
			int r=num%10;			
			rev=r+rev*10;
			
		}return pali(num/10,rev);
        		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int C=num;
		int Q=pali(num,0);
		System.out.println(Q);
		if(C==Q)
		{
			System.out.println("true");
		}else
			System.out.println("false");
		sc.close();
	}
}
