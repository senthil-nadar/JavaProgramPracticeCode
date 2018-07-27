package com.practice;

import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to check for Armstrong or not ");
		int input=scan.nextInt();
		checkArmstrongNumberOrNot(input);

	}
	
	public static void checkArmstrongNumberOrNot(int number){
		int num=number,sum=0,last=0,digits=1;
		
		while((num=num/10) > 0) digits++;
		num=number;
		while(num > 0){
			last=num%10;
			sum+=Math.pow(last,digits);
			num/=10;
			System.out.println(sum);
		} 
		if(number == sum)
			System.out.println(number+" is an Armstrong number");
		else
			System.out.println(number+" is not a Armstrong number");
	}
}
