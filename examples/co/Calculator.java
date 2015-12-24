package com.felight.examples.co;

public class Calculator {
	public static int add(int n1, int n2){
		return n1+n2;
	}
	
	public static int calculateFactorial(int number){
		int factorial=1;
		for (int i=number;i>0;i--){
			factorial = factorial*i;
		}
		return factorial;
		
	}
	
	public static boolean checkEven(int number){
		if (number%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean checkPrime(int number){
		for (int i=2;i<number;i++){
			if(number%i==0)
				return false;
		}
		return false;
	}
	
	public static boolean checkPalindrome(int number){
		int n=number;
		int remainder,reverse=0;
		while(number>0){
			remainder=number%10;
			number = number/10;
			reverse = (reverse*10)+remainder;
		}
		if (n==reverse)
			return true;
		else
			return false;
	}
	
	public static int countDigits(int number){
		int count=0;
		while(number>0){
			number=number/10;
			count++;
		}
		return count;
	}
	
	public static int repeatDigit(int number){
		int count=0;
		int n=number;
		int temp=number;
		while(n>0){
			n = n/10;
			count++;
		}
		while (count>0){
			number=number*10;
			count--;
		}
		return number+temp;
	}
	
	public static byte findHundredthDigit(int number){
		byte remainder=0;
		for (int i=0;i<3;i++){
			remainder = (byte)(number%10);
			number = number/10;
		}
		return remainder;
	}
	
	public static boolean checkDivisibilityBy6(int number){
		if (number%6==0)
			return true;
		else
			return false;
	}
	
	public static double convertToHours(double seconds){
		return seconds/3600;
	}
	
	public static int sumOfDigits(int number){
		int sum=0, remainder=0;
		while (number>0){
			remainder = number%10;
			sum=sum+remainder;
			number=number/10;
		}
		return sum;
	}
	
	public static boolean andBooleans(boolean c1, boolean c2, boolean c3){
		return (c1&&c2&&c3);
	}
	
	public static boolean checkAscendingOrder(int num1, int num2, int num3){
		if ((num3-num2>0)&&(num2-num1>0))
			return true;
		else 
			return false;
	}
	
	public static int findLargest(int num1, int num2, int num3){
		if (num1-num2>0 && num1-num3>0)
			return num1;
		else if(num2-num1>0 && num2-num3>0)
			return num2;
		else 
			return num3;
	}
	
	public static char changeCase(char ch){
		if ((int)ch>64 && (int)ch<91)
			return (char)((int)ch+32);
		else
			return (char)((int)ch-32);
	}
	
	public static boolean checkDigit(char digit){
		if ((int)digit>=48 && (int)digit<=57)
			return true;
		else
			return false;
	}
	
}
