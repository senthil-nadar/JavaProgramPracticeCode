package com.practice;

import java.util.Scanner;
class DiscIntersecting {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N=A.length;
            int C[]=new int[N];
    int a, S=0, t=0;

    // Mark left and middle of disks
    for (int i=0; i<N; i++) {
        C[i] = -1;
        a = A[i];
        if (a>=i) {
            C[0]++;
        } else {
            C[i-a]++;
        }
    }
    // Sum of left side of disks at location
    for (int i=0; i<N; i++) {
        t += C[i];
        C[i] = t;
    }
    // Count pairs, right side only:
    // 1. overlaps based on disk size
    // 2. overlaps based on disks but not centers
    for (int i=0; i<N; i++) {
        a = A[i];
        S += ((a<N-i) ? a: N-i-1);
        if (i != N-1) {
          S += C[((a<N-i) ? i+a: N-1)];
        }
        if (S>10000000) return -1;
    }
    return S;
    }
    
      public static void main(String args[]){
    	  DiscIntersecting sol=new DiscIntersecting();
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