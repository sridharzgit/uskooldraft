package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "AAAAABAAAAADDCCKKK";
		char[] ch = abc.toCharArray();
		Palindrome p = new Palindrome();
		Map m = p.getCoutOfLetters(ch);
		System.out.println(m);
		if (p.checkPolyByCount(m)) {
			System.out.println("the given String can be formed as polyndrome");
		} else {
			System.out.println("the given String can not be formed as polyndrome");
		}
	}

	public boolean checkPalindrome(char[] ch) {
		int endIndex = ch.length - 1;
		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[endIndex]) {
				return false;
			}
			endIndex = endIndex - 1;
		}

		return true;
	}

	public Map<Character, Integer> getCoutOfLetters(char[] ch) {
		Map<Character, Integer> map = new HashMap();
		for (int i = 0; i < ch.length; i++) {
			Character key = new Character(ch[i]);
			if (map.containsKey(key)) {
				int currentCount = map.get(key);
				map.replace(key, currentCount + 1);
			} else {
				map.put(key, 1);
			}
		}
		return map;
	}

	public boolean checkPolyByCount(Map<Character, Integer> map) {
		Collection<Integer> count = new ArrayList<>(map.values());
		Iterator<Integer> it = count.iterator();
		int numOfOdd = 0;
		while (it.hasNext()) {
			int value = it.next();
			if (value % 2 == 1) {
				numOfOdd++;
			}
			System.out.println(value%2);

		}
		if (numOfOdd == 1) {
			return true;
		}
		return false;

	}

}
