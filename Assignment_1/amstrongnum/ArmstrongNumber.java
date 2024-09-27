package org.amstrongnum;

public class ArmstrongNumber {

	public static int armstrongsum(int number, int digits) {
		if(number == 0) {	
		return 0;
	}
		int lastDigit = number % 10;
		int power = (int) Math.pow(lastDigit, digits);
		
		return power + armstrongsum(number/10,digits);
	}
	public static int countDigits(int number) {
		if(number == 0)
	{
		return 0;
		
	}
		return 1 + countDigits(number/10);
		
	}	
	public static Boolean isArmstrong(int number) {
		int digits = countDigits(number);
		int sum = armstrongsum(number,digits);
		return sum == number;
		
	}
	public static void main(String[] args) {
		int[] testcases = {153,123};
		for (int testcase : testcases) {
		boolean result =  isArmstrong(testcase);
		System.out.println("Intput: "+testcase + ",output: "+result);
		}
	}
	
}