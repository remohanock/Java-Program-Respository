package com.felight.testquestions;

import java.util.*;

class Ternary {
	private static Scanner num;

	public static void check2ndLowest(int num1, int num2, int num3) {
		System.out.println((((num1<num2)&&(num2<num3))||((num1>num2)&&(num2>num3)))? num2:(((num1<num3)&&(num1>num2))||((num1<num2)&&(num1>num3)))? num1:num3);
	}
	
	public static void main(String[] args) {
		boolean check = true;
		while (check){
			try{
				check = false;
				System.out.println("Enter 3 numbers pressing enter after each number.");
				num = new Scanner(System.in);
				int number1 = num.nextInt();
				int number2 = num.nextInt();
				int number3 = num.nextInt();
				System.out.println("The second lowest number is:");
				check2ndLowest(number1, number2, number3);
			}catch(Exception ex) {
				System.out.println("Please enter numbers only");
				check = true;
			}
		}
	}
}