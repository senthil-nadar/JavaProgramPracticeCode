/*
Write a program to find top two maximum numbers in the given array. 
You should not use any sorting functions.
You should iterate the array only once. 
You should not use any kind of collections in java.
*/
package com.practice;

import java.util.Scanner;

public class MaxTwoNumberInArray {

	public static void main(String args[]){
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element of the array");
		for(int counter=0;counter < size; counter++)
			arr[counter]=scan.nextInt();	
		
		System.out.println("Top maximum numbers in the given array are ");
		printTopTwoMaxNumbers(arr);
		
	}
	
	public static void printTopTwoMaxNumbers(int array[]){
		int second=0,first=0;
		for(int count=0;count<array.length;count++){
			if(array[count]>first){

				if(first > second)
					second=first;
				first=array[count];
			}
		}
		System.out.println(first + " and " + second);
	}

}

