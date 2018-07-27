// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
package com.practice;

public class FibonacciSeries {

	public FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){
		int start=0,next=1;
		System.out.println("Enter the fibonacci series limit till what term you need");
		int limit=15;
		int arr[]=new int[15];
		int count=0;
		//arr[0]=0;
		while(limit > count){
			arr[count]=start;
			start=next;
			next=arr[count]+next;
			count++;
		}
				
		System.out.println("Output:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
