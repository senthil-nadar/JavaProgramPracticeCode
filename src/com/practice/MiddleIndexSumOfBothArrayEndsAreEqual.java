package com.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class MiddleIndexSumOfBothArrayEndsAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int input= value.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the elements of the array");
		for(int counter=0;counter<input;counter++){
			arr.add(value.nextInt());
		}
		int test=middleIndexSumEqual(arr);
		if(test != 0)
			System.out.println("MiddleIndex exist and index is " +test);
		else
			System.out.println("MiddleIndex does not exist");
	}

	public static int middleIndexSumEqual(ArrayList<Integer> array){
		int leftTotal, rightTotal,leftPointer,rightPointer;
		leftTotal=rightTotal=leftPointer=0;
		rightPointer=array.size()-1;
		while(true){
			if(leftPointer > rightPointer)
				break;
			if(leftTotal > rightTotal){
				rightTotal+=array.get(rightPointer);
				rightPointer--;
			}else{
				leftTotal+=array.get(leftPointer);
				leftPointer++;
			}
		}
		if(leftTotal == rightTotal)
			return leftPointer;
		else
			return 0;
		
	}
}
