package com.felight.testquestions;

class Continue {
	public static void main(String[] args){
		int sum=0;
		byte count=0;
		for(int i=0; i<=100;i++){
			if (i%2==0)
				continue;
			sum+=i;
			count++;
		}
		System.out.println("The sum of odd numbers till 100 is: "+sum);
		System.out.println("The average of sum of odd numbers till 100 is: "+ (sum/count));
	}
}