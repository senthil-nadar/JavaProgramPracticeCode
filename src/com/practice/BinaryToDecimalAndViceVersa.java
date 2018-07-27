package com.practice;

import java.util.Scanner;

public class BinaryToDecimalAndViceVersa {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);

		boolean flag=true;
		do{
			System.out.println("Enter a number\n");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
    		int choice=input.nextInt();
			switch(choice){
			
			case 1:
				System.out.println("Enter a decimal number to convert it to binary:");
				int decimal=input.nextInt();
				System.out.println("The binary equivalent of "+decimal+" is "+decimalToBinary(decimal));
				break;
			case 2:
				System.out.println("Enter a decimal number to convert it to binary:");
				int binary=input.nextInt();
				System.out.println("The binary equivalent of "+binary+" is "+binaryToDecimal(binary));
				break;
				
			default:
				flag=false;
				break;
			}
	
		}while(flag);
	}
	
	public static int decimalToBinary(int number){
		
		int binary=0,last=0,multiply=0,loop=0;
		boolean negative=false;
		if(number == 0){
			return 0;
		}else{
				 if(number < 0){
						negative=true;
						number=number*-1;
						}
			loop=number;
			while(loop%2 == 0){
				multiply++;
				loop/=2;
			}
			loop=1;
		while(number > 0){
			last=number%2;
			binary=binary*10+last;
			number=number/2;
			loop*=10;
		}
		while(multiply > 0 ){
			binary*=10;
			multiply--;
		}
		if(negative)
			binary=loop+binary;
		return binary;
		}
	}
	public static int binaryToDecimal(int number){
	int num=number,decimal=0,last=0;
	double count=0;
	while(num>0){
		last=num%10;
		decimal=(int) (decimal+last*Math.pow(2,count++));
		num/=10;
		System.out.println(decimal);
		}
	return decimal;
	}
	
}
