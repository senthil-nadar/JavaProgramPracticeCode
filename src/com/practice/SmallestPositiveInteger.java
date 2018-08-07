/*
 Find the smallest positive integer from the given list of array.
 if only negative number exists in the array or all large number exist then 1 is the smallest positive integer
 if array has 1,2,1,3,4 then 5 is the smallest positive integer in this case
 */

package com.practice;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
import java.util.Scanner;
import java.util.Arrays;
class SmallestPositiveInteger {
 public int solution(int[] A) {
     // write your code in Java SE 
     int smallestPositive=1,first=1;
     Arrays.sort(A);
     for (int index=0;index< A.length;index++){
         if(smallestPositive > A[index] && A[index] > 0 & first == 1)
             smallestPositive = A[index];
         else if(smallestPositive == A[index]){
             smallestPositive++;
             first=0;
         }
     }
     return smallestPositive;
 }
 
 public static void main(String args[])
 {
     Scanner s = new Scanner(System.in);
     System.out.print("Enter no. of elements you want in array:");
     int n = s.nextInt();
     int A[] = new int[n];
     System.out.println("Enter all the elements:");
     for(int i = 0; i < n; i++)
     {
         A[i] = s.nextInt();
     }
     SmallestPositiveInteger mySolution=new SmallestPositiveInteger();
     //int[] A={1,2,3,4,5};
     System.out.println(mySolution.solution(A));
 }
}