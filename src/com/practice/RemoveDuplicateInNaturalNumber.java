package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicateInNaturalNumber {
	
	public  static void main(String args[]){
		
		List<Integer> myList = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int counter=1;
		System.out.println("Enter the Nth natural number:");
		int number=input.nextInt();
		while(counter<=number){
			myList.add(counter);
			counter++;
		}
		System.out.println("Enter the duplicate number:");
		int duplicate=input.nextInt();
		myList.add(duplicate);
		int output =findDuplicate(myList,number);
		System.out.println("The duplicate number entered is " + output);
		
		
	}
	
	public static int findDuplicate(List<Integer> list, int number){
		int sum=0;
		for (int num : list){
			sum+=num;
		}
		return (sum - (number*(number+1)/2));
	}

}
