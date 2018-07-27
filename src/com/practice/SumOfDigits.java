package com.practice;

public class SumOfDigits {
	
	int number;
	public SumOfDigits(int num) {
		// TODO Auto-generated constructor stub
	number=num;
	}

	public void sumOfDigits(){
		int num=number,sum=0,last=0;
		while(num > 0){
			last=num%10;
			sum+=last;
			num/=10;
		} 
		System.out.println("The sum of the digit entered is "+sum);
	}
	
	public static int sumUsingRecursion(int number){
		int sum=0,last=0;
		if(number <= 0)
			return 0;
		return sum=sum+(number%10)+sumUsingRecursion(number/10);
		
	}
	
	public static void main(String args[]){
		SumOfDigits test=new SumOfDigits(123456);
		test.sumOfDigits();
		System.out.println("The sum of the digit entered is "+sumUsingRecursion(123456));
	}
}
