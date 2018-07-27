package com.practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MaxRepeatedWordInAFile {

	HashMap<String, Integer> strMap;
	
	public MaxRepeatedWordInAFile(){
	strMap=new HashMap<String,Integer>();	
	}

	public void readFileContent(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String temp[] = line.split(" ");
				for(String word : temp){
					if(strMap.containsKey(word)){
						strMap.put(word, strMap.get(word)+1);
					}else{
						strMap.put(word, 1);
					}
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printDuplicateWords(){
		for(HashMap.Entry<String,Integer> temp: strMap.entrySet()){
			if(temp.getValue() > 1){
				System.out.println("Word : "+temp.getKey()+"   Count : "+temp.getValue());
			}
		}
	}
	
	public void printMaximumRepeated(){
		int max=0;String key = null;
		for(HashMap.Entry<String,Integer> temp: strMap.entrySet()){
			if(temp.getValue() > max){
				max=temp.getValue();
				key=temp.getKey();
			}
		}
		System.out.println("MaxRepeated word : "+ key +" Count "+max);
	}

}

class TestMaxRepeatedWordInAFile{
	
	public static void main(String args[]){
		MaxRepeatedWordInAFile test=new MaxRepeatedWordInAFile();
		test.readFileContent("C:\\xampp\\htdocs\\fileInput.txt");
		test.printDuplicateWords();
		test.printMaximumRepeated();
	}
}