package org.FibonacciSeries;
import java.util.*;
public class FibonacciSeries {
 public static void printfibonacci(int n) {
 	int num1 = 0 ,num2 = 1;
 if (n >= 1 ) {
	 System.out.print(num1);

 }
if (n >= 2) {
 System.out.print(num2);
}
for (int i =  3; i <= n; i++) {
	int nextNum = num1 + num2;
	System.out.print( " " + nextNum);
num1 = num2;
num2 = nextNum;

}
System.out.println();
 }
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	  System.out.print("Fibonacci series for n = 5: ");
      printfibonacci(5);
      
      System.out.print("Fibonacci series for n = 8: ");
      printfibonacci(8);
      
      System.out.print("Enter the value of n: ");
      int n = scanner.nextInt();
      System.out.print("Fibonacci series for n = " + n + ": ");
      printfibonacci(n);
      
      scanner.close();
  }
}
//time complexity is O(n)
// space complexity is O(1)
 
 

