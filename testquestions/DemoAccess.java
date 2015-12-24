package com.felight.testquestions;

class DemoAccess {
	public int demoAccess = 100;
	private static int demoAccessPvt = 100;
	public static int getAccessPvt(){
		return demoAccessPvt;
	}
	public static void setAccessPvt(int num){
		demoAccessPvt = num;
	}
}

class TestDemoAccess {
	public static void main(String[] args) {
		DemoAccess firstObj = new DemoAccess();
		System.out.println("demoAccess: "+firstObj.demoAccess);
		DemoAccess secObj = new DemoAccess();
		secObj.demoAccess = 200;
		System.out.println("firstObj.demoAccess: "+firstObj.demoAccess + " and "+ "secObj.demoAccess: "+secObj.demoAccess);
		System.out.println("demoAccess private value is: "+DemoAccess.getAccessPvt());
		DemoAccess.setAccessPvt(200);
		System.out.println("Private demoAccess: "+DemoAccess.getAccessPvt());
	}
}