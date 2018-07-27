package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class SearchDuplicateCharacter {

	String str;

	public SearchDuplicateCharacter() {
		str = "";
	}

	public SearchDuplicateCharacter(String strLine) {
		str = strLine;
	}

	public void findDuplicateAndCount() {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int count = str.length() - 1; count >= 0; count--) {
			char letter = str.charAt(count);
			// System.out.println(letter);
			if (map.containsKey(letter)) {
				map.put(letter, (map.get(letter)) + 1);
			} else {
				map.put(letter, 1);
			}
		}

		for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Character Repeated " + entry.getKey() + "Character count " + entry.getValue());
			}
		}

	}

}

class TestSearchDuplicateCharacter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string to find repeated character and its count:");
		String strLine = input.nextLine();
		SearchDuplicateCharacter line = new SearchDuplicateCharacter(strLine);
		line.findDuplicateAndCount();
	}

}