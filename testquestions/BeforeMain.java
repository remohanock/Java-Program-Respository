package com.felight.testquestions;

class BeforeMain {
	static {
		System.out.println("First thing to be printed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method!");
	}
}

/*

Output:

E:\Felight\Core Java\Test>java BeforeMain
First thing to be printed
Main method!

*/