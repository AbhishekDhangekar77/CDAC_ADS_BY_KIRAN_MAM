package org.factorial;
import java.util.Scanner;
public class factorialNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:  ");
	int number = sc.nextInt();
	System.out.println("Enter a number2: ");
	int number2 = sc.nextInt();
	System.out.println(factorial(number));//is the method called to compute the factorial
	System.out.println(factorial(number2));
	sc.close();
}

private static int  factorial(int n) {
	if (n == 0)return 1;//factor of zero is 1
	return n*factorial(n-1);
//	factorial(5) → returns 5 * factorial(4)
//	factorial(4) → returns 4 * factorial(3)
//	factorial(3) → returns 3 * factorial(2)
//	factorial(2) → returns 2 * factorial(1)
//	factorial(1) → returns 1 * factorial(0)
//	factorial(0) → returns 1 (base case)
//	5 * 4 * 3 * 2 * 1 = 120
	
	//int fact = 1;
	
	
//	for(int i = 1; i <= n; i++) {
//		fact *= i;//fatc
//	}
//	return fact;
}
}
// Time Complexity: O(n)
//Space complexity: O(1)