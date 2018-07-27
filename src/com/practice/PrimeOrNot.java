package com.practice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		do{
		System.out.println("Entert the number to test prime or not");
		int number=scan.nextInt();
		checkAndPrintPrimeOrNot(number);
	}while(true);
		}
	
	public static void checkAndPrintPrimeOrNot(int number){
		boolean isPrime=true;
		for(int counter=2;counter<=Math.sqrt(number);counter++){
			if(number%counter == 0){
				isPrime=false;
				System.out.println(number+" is not a prime number");
				break;
			}
		}
		
		if(isPrime)
			System.out.println(number+" is prime number");
	}

}
