package com.practice;


//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
import java.util.Scanner;
class MissingDivisors {
 public int solution(int A, int B, int K) {
     // write your code in Java SE 8
     // write your code in Java SE 8
     int countDivisors=0;
     if(A <= B)
     {
         for(int i=A;i<=B;i++){
             if(K==0) break;
             if(i%K==0)
             countDivisors++;
         }
     }
     return countDivisors;
 }
 
 public int bestSolution(int A, int B, int K){
	 return (B/K-A/K)+(A%K==0?1:0);
 }
 
 public static void main(String args[]){
	 MissingDivisors sol=new MissingDivisors();
     System.out.println("Enter the two integers A & B for the problem");
     Scanner input=new Scanner(System.in);
     int a=input.nextInt();
     int b=input.nextInt();
     System.out.println("Enter the integer K for the problem");
     int k=input.nextInt();
     System.out.println("Output "+sol.solution(a,b,k));
     System.out.println("Output "+sol.bestSolution(a,b,k));
 }
}