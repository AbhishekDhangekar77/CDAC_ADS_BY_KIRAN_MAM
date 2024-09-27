package org.GCD;
import java.util.Scanner;
public class GCD {
  public static int GreatestCommnDivisor(int num1, int num2){
	  if(num1==0) 
	  {
		  return num2;
	  }
	  if(num2==0)
	  {
		  return num1;
		  
	  }
	  if(num1==num2) {
		  return num1;
		  
	  }
	  if(num1>num2) {
		  return GreatestCommnDivisor(num1%num2, num2);
	  }return GreatestCommnDivisor(num1, num2%num1);
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first num1 : ");
	int num1 = sc.nextInt();
	System.out.println("Enter the second num2 : ");
	int num2 = sc.nextInt();
	System.out.println( GreatestCommnDivisor( num1, num2));
	sc.close();
}
}
