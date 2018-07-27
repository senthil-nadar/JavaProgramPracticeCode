package com.practice;

public class AllSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]={23,354,45,12,34,233,6,234,456,34,2,90};
		System.out.println("Before sorting");
		for(int x : numbers)
			System.out.println(x);
		//selectionSort(numbers);
		//bubbleSort(numbers);
		insertionSort(numbers);
		for(int x : numbers)
			System.out.println(x);
	}
	
	public static void selectionSort(int[] numbers){

		for(int outer=0;outer<numbers.length;outer++){
			int smallest=numbers[outer];
			for(int inner=outer+1;inner<numbers.length;inner++){
				
				if(numbers[inner] < smallest){
					numbers[outer]=numbers[inner];
					numbers[inner]=smallest;
					smallest=numbers[outer];
				}
			}
		}
		System.out.println("After selection sorting");
	}

	
	public static void bubbleSort(int[] numbers){

		for(int outer=0;outer<numbers.length;outer++){
			System.out.println("After iteration "+outer);
			for(int inner=0;inner<numbers.length-1;inner++){
				
				if(numbers[inner] > numbers[inner+1]){
					int temp=numbers[inner];
					numbers[inner]=numbers[inner+1];
					numbers[inner+1]=temp;
				}
			}
		}
		System.out.println("After bubble sorting");
	}
	
	public static void insertionSort(int[] numbers){

		for(int outer=1;outer<numbers.length;outer++){
			
			for(int inner=0;inner<outer;inner++){
				//int temp=numbers[outer];
				if(numbers[inner] > numbers[outer]){
					int temp=numbers[outer];	
					numbers[outer] = numbers[inner];
					numbers[inner]=temp;
				}
			}
		}
		System.out.println("After bubble sorting");
	}
}
