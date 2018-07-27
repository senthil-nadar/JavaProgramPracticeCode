package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
 
	int number;
	public PerfectNumber(int num) {
		// TODO Auto-generated constructor stub
		number=num;
	}
	
	public boolean IsPerfectNumber(){
		ArrayList<Integer> divisorList=new ArrayList<Integer>();
		for(int count=1;count<=Math.sqrt((int)(number));count++){
			if(number%count == 0){
				divisorList.add(count);
				System.out.println(count);
				if(count == number/count)
					continue;
				divisorList.add(number/count);

				System.out.println(number/count);
			}}
			int sum=0;
			for (int temp : divisorList){
				sum+=temp;
			}
			return (sum/2 == number);
	}
	
	public boolean roshanPerfectNumber()
	{
		int sum = 0;
		for (int i = 1; i <= Math.sqrt((int)(number)); i++)
		{
			if (number % i == 0) {
				int j = number / i;
				sum += i;
				if (j != i && j != number) {
					sum += j;
				}
			}
		}
		return false;
	}
	

}

class TestPerfectNumber{
	public static void main(String args[]){
		do{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to test for perfect number");
		int value=input.nextInt();
		PerfectNumber pn=new PerfectNumber(value);
		boolean test= pn.IsPerfectNumber();
		System.out.println("Given number is a perfect number: "+test);
		}while(true);
	}
}