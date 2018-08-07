package com.practice;


//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
import java.util.Scanner;
import java.util.Arrays;
class FindDistinctElementArray {
 public int solution(int[] A) {
     // write your code in Java SE 8
     int count=0;
     Arrays.sort(A);
     for(int i=0;i<A.length-1;i++){
         if(A[i] == A[i+1])  
             count++;
     }
     return A.length - count;
 }
 
  public static void main(String args[]){
	  FindDistinctElementArray sol=new FindDistinctElementArray();
	  System.out.println("Enter the size of the array");
	  Scanner input=new Scanner(System.in);
	  int size=input.nextInt();
	  int arr[]=new int[size];
	  System.out.println("Enter the elements of the array");
	  for(int i=0;i<size;i++)
	  arr[i]=input.nextInt();
	  System.out.println("Output "+sol.solution(arr));;
	}
}