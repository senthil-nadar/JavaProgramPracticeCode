package com.practice;


import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
class DominatorElementInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
    int dominatorIndex=-1;
    HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
    for(int i=0;i<A.length;i++){
        if(hashmap.containsKey(A[i])){
            hashmap.put(A[i],hashmap.get(A[i])+1);
            if(hashmap.get(A[i]) > A.length/2)
                dominatorIndex=i;
        }else{
            hashmap.put(A[i],1);
        }
    }
    return dominatorIndex;
        
    }
    
    public static void main(String args[]){
    	DominatorElementInArray sol=new DominatorElementInArray();
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