package com.java.dev;

import java.util.HashMap;
import java.util.Map;

public class RepeatCountOfEveryCharacter {

	public static void main(String[] args) {
		String[] strs = {"word1word3word2","word4word8word2",
				"word5word7word2","word6word4word9"};
		repeatOfWords(strs);
	}

	private static void repeatOfWords(String[] strs) {
		int count = 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<strs.length; i++) {
			for(int j=4; j<strs[i].length(); j=j+5) {
				String str = strs[i];
				if(Character.isDigit(str.charAt(j))){
					if(map.containsKey(str.charAt(j))) {
					map.put(str.charAt(j), map.get(str.charAt(j))+1);
					}
					else
						map.put(str.charAt(j), 1);
				}
			}
		}
		for(Character c : map.keySet()) {
			System.out.println("word" + c + " " + map.get(c));
		}
	}

}
