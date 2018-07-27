package com.practice;

public class SingleTonClassTest {
	
	private SingleTonClassTest(){
		
	}
	
	
	private static SingleTonClassTest objectSingleTon;
	public int x;
	
	static
	{
		objectSingleTon = new SingleTonClassTest();
	}

	public static SingleTonClassTest getObject(){
		return objectSingleTon;
	}
	

}


class TestSingleTonClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonClassTest x= SingleTonClassTest.getObject();
		x.x=1;
		SingleTonClassTest y= SingleTonClassTest.getObject();
		System.out.println(y.x);
		y.x=5;
		System.out.println(x.x);
	}
}