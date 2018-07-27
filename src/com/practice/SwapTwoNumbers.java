package com.practice;


public class SwapTwoNumbers {

	int first,second;
	public SwapTwoNumbers() {
		// TODO Auto-generated constructor stub
		first=second=0;
	}
	
	public SwapTwoNumbers(int x,int y){
		first=x;
		second=y;
	}
	
	public void swapTwoNumbers(){
		System.out.println("Before swapping : first "+first+" second "+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After swapping : first "+first+" second "+second);
	}
	
	public static void main(String str[]){
		SwapTwoNumbers test=new SwapTwoNumbers(54,78);
		test.swapTwoNumbers();
	}

}
