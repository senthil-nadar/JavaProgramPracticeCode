package com.practice;
import java.util.Scanner;

class Node {
	
	protected int data;
	protected Node pointer;

	public Node() {
		// TODO Auto-generated constructor stub
		data = 0;
		pointer = null;
	}
	
	public Node(int value, Node n){
		data = value;
		pointer=n;
	}

	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data=d;
	}
	
	public Node getPointer(){
		return pointer;
	}
	
	public void setPointer(Node n){
		pointer=n;
	}
}


class LinkedList{
	
	protected Node start;
	protected Node end;
	protected int size;
	
	public LinkedList() {
		start=null;
		end=null;
		size=0;
	}
	
	public LinkedList(Node a, Node b, int x){
		start=a;
		end=b;
		size=x;
	}
	
	//LInked list is empty
	public boolean isEmpty(){
		return start == null;
	}
	
	//Linked list is empty
	public boolean isEmtpyBySize(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
	
	
	public void addNodeAtStart(int data){

		Node newNode=new Node(data, null);
		if(size == 0)
		{
			start=newNode;
			end = start;
		} else{
			newNode.setPointer(start);
			start = newNode;
		}
		size++;//Because we will be inserting anyways once this function is called
	}
	
	public void removeNodeAtStart(){

		if(size == 0){
			//No element to delete
		} else{
			start=start.pointer;
		}
		size--;
		
	}
	
	public void addNodeAtEnd(int data){

		Node newNode=new Node(data, null);
		if(size == 0)
		{
			start=newNode;
			end = start;
		} else{
			end.setPointer(newNode);
			end = newNode;
		}
		size++;//Because we will be inserting anyways once this function is called
	}
	
	public void displayNode(){
		if(size > 0){
			System.out.println("Current element in the linked list are as follows");
		
		Node currentNode;
		currentNode=start;
		//currentNode=start.pointer;
		for(int i =0;i<size;i++){
			System.out.println(currentNode.data);

			
			if(currentNode == end){
				break;
			}
			currentNode=currentNode.pointer;
			System.out.print("->");
		}
		} else{
			System.out.println("List is Empty");
		}
	}
	
}



class TestLinkedList{
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		LinkedList list=new LinkedList();
		while(true){
			System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. check empty");
            System.out.println("4. delete element");
            System.out.println("5. Print list");  

            int choice = input.nextInt();     
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.addNodeAtStart( input.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.addNodeAtEnd( input.nextInt() );                     
                break;                         
            case 3 : 
            	System.out.println("Empty status = "+ list.isEmpty());
                break;     
            case 4 : 
            	System.out.println("Remove element at first");
            	list.removeNodeAtStart();
                break; 
            case 5 : 
            	System.out.println("Print Current list:");
            	list.displayNode();
                break;
            default : 
                System.out.println("Wrong Entry \n "+list.getSize());
                break;   
            }
		}
		
	}
}
