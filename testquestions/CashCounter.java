package com.felight.testquestions;

import java.util.Scanner;

class CashCounter{
	public static int calculate(int num1, int num2, String ch){
		int result=0,remainder=0;
		switch (ch){
			case "+": result = num1+num2;
					break;
			case "-": result = num1-num2;
					break;
			case "*": result = num1*num2;
					break;
			case "/": result = num1/num2;
					  remainder = num1%num2;
					  System.out.println("Remainder = "+ remainder);
					  break;
		}
		return result;
	}
}

class TestCashCounter {
	private static Scanner scan;
	private static int justChecking;

	public static void main(String[] args) {
		boolean check = true;
		int result=0;
		while(check){
			check = false;
			try{
				scan = new Scanner(System.in);
				System.out.print("Enter the first number: ");
				int num1 = scan.nextInt();
				System.out.print("Enter the second number: ");
				int num2 = scan.nextInt();
				System.out.print("Enter the operator: ");
				String ch = scan.next();
				if (ch=="/")
					setJustChecking(num1/num2);
				result = CashCounter.calculate(num1, num2, ch);
				System.out.println(result + "(" +num1+""+ ch +""+num2+" = "+result+")");
			} catch (ArithmeticException ex){
				System.out.println("\nEnter a non zero number to divide... Please enter again");
				check = true;
			} catch (Exception ex){
				System.out.println("Please enter valid inputs only.. Enter again..");
				check = true;
			}
		}
		
	}

	public static int getJustChecking() {
		return justChecking;
	}

	public static void setJustChecking(int justChecking) {
		TestCashCounter.justChecking = justChecking;
	}
}	