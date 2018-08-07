package com.practice;

import java.util.Scanner;
class FactorCount {
    public int solution(int N) {
        // write your code in Java SE 8
        int factorCount=0;
        for(int i=1;i<=Math.ceil(Math.sqrt(N));i++){
            if(N%i==0){
            factorCount++;
            System.out.println(i+" , "+N/i);
            if(N%(N/i)==0 &&  i!=(N/i)){
                factorCount++;
                System.out.println(N/i);
            }
        }
         if(N==2)
         factorCount=2;
        }
        return factorCount;
    }
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("Enter the element");
        int element= input.nextInt();
        FactorCount sol=new FactorCount();
        System.out.println(sol.solution(element));
    }}
}