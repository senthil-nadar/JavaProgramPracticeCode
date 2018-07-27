package com.practice;
import java.util.Scanner;

public class NodeWithHeadOnly {

	protected int data;
	protected NodeWithHeadOnly pointer;
	public NodeWithHeadOnly() {
		// TODO Auto-generated constructor stub
		data = 0;
		pointer = null;
	}

	public NodeWithHeadOnly(int value, NodeWithHeadOnly n){
		data = value;
		pointer=n;
	}

	public int getData(){
		return data;
	}
	
	public void setData(int d){
		data=d;
	}
	
	public NodeWithHeadOnly getPointer(){
		return pointer;
	}
	
	public void setPointer(NodeWithHeadOnly n){
		pointer=n;
	}
}





class LinkedListWithHeadOnly{
	
	protected NodeWithHeadOnly start;
	
	public LinkedListWithHeadOnly() {
		start=null;
	}
	
	public LinkedListWithHeadOnly(NodeWithHeadOnly a){
		start=a;

	}
	
	//LInked list is empty
	public boolean isEmpty(){
		return start == null;
	}
	

	
	
	public void addNodeAtStart(int data){

		NodeWithHeadOnly newNode=new NodeWithHeadOnly(data, null);
		if(start == null)
		{
			start=newNode;
		} else{
			newNode.setPointer(start);
			start = newNode;
		}
	}
	
	public void removeNodeAtStart(){
		
		if(start == null){
			//No element to delete
			System.out.println("Nothing present to delete");
		} else{
			NodeWithHeadOnly newNode;
			newNode=start;
			start=start.pointer;
			newNode=null;
		}
		
	}
	
	public void addNodeAtEnd(int data){

		NodeWithHeadOnly newNode=new NodeWithHeadOnly(data, null);
		if(start == null)
		{
			start=newNode;
		} else{
			NodeWithHeadOnly currentNode=start;
			while(true){

				if(currentNode.pointer == null)
					break;
				currentNode = currentNode.pointer;
			}


			currentNode.setPointer(newNode);
			currentNode=newNode;
		}

	}
	
	public void reverseLinkedList(){
		NodeWithHeadOnly prevNode, currNode, nextNode;
		prevNode=null;
		currNode=start;
		nextNode=start.pointer;
		while(true){

			currNode.pointer=prevNode;
			//prevNode.pointer=null;
			prevNode=currNode;
			currNode=nextNode;
			if(nextNode == null)
				break;
			nextNode=nextNode.pointer;
			
		}
		//start=null;
		//start.setPointer(prevNode);
		start=prevNode;

	}
	
	public void displayNode(){
		if(start != null){
			System.out.println("Current element in the linked list are as follows");
		
		NodeWithHeadOnly currentNode;
		currentNode=start;
		//currentNode=start.pointer;
		while(currentNode != null){
			System.out.println(currentNode.data);
			if(currentNode == null)
				break;
			currentNode=currentNode.pointer;
			System.out.print("->");
		}
		} else{
			System.out.println("List is Empty");
		}
	}
	
}



class TestLinkedListHeadOnly{
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		LinkedListWithHeadOnly list=new LinkedListWithHeadOnly();
		while(true){
			System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. check empty");
            System.out.println("4. delete element");
            System.out.println("5. Print list"); 
            System.out.println("6. Linked list elements are reversed"); 

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
            case 6 : 
            	System.out.println("Reversed Current list");
            	list.reverseLinkedList();
            	break;
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
		}
		
	}
}
