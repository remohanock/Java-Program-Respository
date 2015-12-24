package com.felight.testquestions;

import java.util.*;

class PrimitiveDatatypes {
		int num1;
		float num2;
		char char1;
		double num3;
		byte num4;
		boolean status;
		long num5;
}

class TestPrimitive{
	static Scanner scan;
	static int integer;
	static double dble;
	static float flt;
	static byte byt;
	static long lng;
	static short shrt;
	static boolean bln;

	public static void main(String[] args){
	//Question no.1:
		PrimitiveDatatypes checker = new PrimitiveDatatypes();
		System.out.println("The default values of:");
		System.out.println("int is: "+ checker.num1);
		System.out.println("float is: "+checker.num2);
		System.out.println("double is: "+ checker.num3);
		System.out.println("char is: "+ checker.char1);
		System.out.println("byte is: "+ checker.num4);
		System.out.println("boolean is: "+ checker.status);
		System.out.println("long is: "+checker.num5);
		System.out.println("\nThe minimum value for integer is: "+Integer.MIN_VALUE);
		System.out.println("The maximum value for integer is: "+ Integer.MAX_VALUE);
		System.out.println("The minimum value for float is: "+Float.MIN_VALUE);
		System.out.println("The maximum value for float is: "+ Float.MAX_VALUE);
		System.out.println("The minimum value for byte is: "+ Byte.MIN_VALUE);
		System.out.println("The maximum value for byte is: "+ Byte.MAX_VALUE);
		System.out.println("The minimum value for long is: "+Long.MIN_VALUE);
		System.out.println("The maximum value for long is: "+ Long.MAX_VALUE);
		System.out.println("The minimum value for double is: "+Double.MIN_VALUE);
		System.out.println("The maximum value for double is: "+ Double.MAX_VALUE);
		System.out.println("\n-End of question #1-");
		
		//Question no.2:
		
		System.out.println("\nQuestion #2");
		boolean check = true;
		while (check){
			try {
				check = false;
				System.out.println("\nPlease enter values for:");
				scan = new Scanner(System.in);
				System.out.print("Integer: ");
				integer = scan.nextInt();
				System.out.print("Double: ");
				dble = scan.nextDouble();
				System.out.print("Float: ");
				flt = scan.nextFloat();
				System.out.print("Byte: ");
				byt = scan.nextByte();
				System.out.print("Long: ");
				lng = scan.nextLong();
				System.out.print("Short: ");
				shrt = scan.nextShort();
				System.out.print("Boolean: ");
				bln = scan.nextBoolean();
				System.out.println("\n-End of question #2-");
			}catch (Exception ex){
				System.out.println("\nPlease enter valid input values!");
				check = true;
			}
		}
	}
}