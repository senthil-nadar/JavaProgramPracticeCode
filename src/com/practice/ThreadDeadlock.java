package com.practice;



public class ThreadDeadlock {

	public static void main(String []args){
		final Integer first=new Integer(1);
		final Integer second=new Integer(2);
		
		Thread t1 = new Thread(){
			public void run(){
				synchronized(first){
					System.out.println("T1 Access first");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(second){
					System.out.println("T1 Access second");
				}
				}
				
			}
		};
	
	
	
		Thread t2 = new Thread(){
			public void run(){
				synchronized(second){
					System.out.println("T2 Access Second");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(first){
					System.out.println("T2 Access first");
				}
				}
				
			}
		};
	
	
	t1.start();
	t2.start();
	
	
	}

}
