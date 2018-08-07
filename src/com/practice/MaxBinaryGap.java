package com.practice;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
import java.util.Scanner;
class MaxBinaryGap {
 
 public int solution(int N) {
	 int maxBinaryGap=0;
	 boolean found=false;
	 int count=0;
	 while(N>0){
		 if(N%2!=0){
			 if(count > maxBinaryGap && found)
				 maxBinaryGap=count;
			found=true;
			count=0;		 
		 }else
			 count++;
		 N/=2;
	 }
	 return maxBinaryGap;
}
 
 public static void main(String args[]){
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the integer");
     int  number= input.nextInt();
     MaxBinaryGap instanceOfSolution = new MaxBinaryGap();
     int binary=instanceOfSolution.solution(number);
     System.out.println(binary);
 }
 

}