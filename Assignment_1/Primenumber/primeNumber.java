package org.Primenumber;
import java.util.Scanner;
public class primeNumber {
public static boolean isPrime(int num) {
	if (num <= 1) {
		return false;
	}
	//Squre Root(sqrt(num))  checking if a number num is prime, you want to determine
	//whether there are any divisors of num other than 1 and itself.
    for(int i = 2;i <= Math.sqrt(num); i++) {// it check if the number is divisible by any values.
    	if (num % i == 0) {
    		return false;
    	}
    }
	return true;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println(" first number is prime or not ? "+ isPrime(29));
	
	System.out.println(" second number is prime or not ? "+ isPrime(15));
    System.out.println("Enter the number: ");	
     int num = sc.nextInt();
     System.out.println("Is " + num + " prime? "+ isPrime(num));
     sc.close();
	}
}
//Time complexity is O(sqrt(n));
//space complexity is O(1);