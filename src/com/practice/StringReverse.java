package com.practice;
import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new  Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str=input.next();
		StringBuilder sbStr=new StringBuilder(str);
		System.out.println("Using stringbuilder inbuild function, The reverse of the given string "+str+" is "+sbStr.reverse());
		
		
		
		int strLength=str.length()-1;
		int start=0;
		char ch;
		char characters[] =str.toCharArray();
		while(strLength > start){
			ch=characters[start];
			characters[start]=characters[strLength];
			characters[strLength]=ch;
			strLength--;
			start++;
		}

		System.out.println("Using another Character array logic, The reverse of the given string "+str+" is "+new String(characters));
		for(int i=0;i<characters.length;i++)
			System.out.print(characters[i]);
		
		String reverse="";
		for(strLength=str.length()-1;strLength>=0;strLength--){
			reverse+=str.charAt(strLength);
		}
		System.out.println();
		System.out.println("Using another string logic, The reverse of the given string "+str+" is "+reverse);
		
		
		System.out.println("Using recurrsion logic, The reverse of the given string "+str+" is "+stringReverse(str));
		System.out.println("Using roshan recurrsion logic, The reverse of the given string "+str+" is "+roshRev(str));

		System.out.println("Enter a number");
		int number=input.nextInt();
		System.out.println("The reverse of the given Number "+number+" is "+reverseNumber(number));

	}
	
	public static String stringReverse(String original){
		int strLength=original.length();
		String reverse="";
		if(strLength == 1)
			return original;
		else{
		char last=original.charAt(strLength-1);
		reverse=last+stringReverse(original.substring(0, strLength-1));
		return reverse;
		}
	}
	
	public static String roshRev(String str)
	{
		int len = str.length();
		String r = "";
		if (len == 1)
			return str;
		char lastChar = str.charAt(len-1);
		String newStr = str.substring(0, len-1);
		r = lastChar + roshRev(newStr);
		return r;
	}
	
	public static int reverseNumber(int number){
		int reverse=0,last=0;
		while(number > 0){
			last=number%10;
			reverse=reverse*10+last;
			number/=10;
		}
		return reverse;
	}
	
	 

}
