package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindCommonElementInTwoArray {

	HashMap<Character,Integer> hashMap;
	
	public FindCommonElementInTwoArray(){
		hashMap=new HashMap<Character,Integer>();
	}
	
	public static void main(String args[]){
		char[] charArrayOne={'a','b','c','d','e','j','m','p'};
		char[] charArrayTwo={'r','a','k','l','c','z'};
		FindCommonElementInTwoArray test= new FindCommonElementInTwoArray();
		test.removeDuplicate(charArrayOne);
		test.findCommonElements(charArrayTwo);
		test.printHashMap();
	}

	public HashMap<Character,Integer> removeDuplicate(char[] ch){	
		for(char letter : ch){
			if(hashMap.containsKey(letter)){
				continue;
			} else{
				hashMap.put(letter, 1);
			}
		}
		
		return hashMap;
	}
	
	public void emptyTheHashMap(){
		hashMap.clear();
	}
	
	public HashMap<Character,Integer> findCommonElements(char ch[]){
		
		for(char letter : ch){
			if(hashMap.containsKey(letter)){
				//hashMap.put(letter, hashMap.get(letter)+1);
				System.out.println("Common element : "+letter);
			} else{
				hashMap.put(letter, 1);
			}
		}
		
		return hashMap;
	}
	
	public void printHashMap(){
		Map<Character,Integer> sorted= new TreeMap<Character, Integer>(hashMap);
		for(HashMap.Entry<Character,Integer> temp : sorted.entrySet()){
			System.out.println("Key : "+temp.getKey()+" Value : "+temp.getValue());
		}
	}
}
