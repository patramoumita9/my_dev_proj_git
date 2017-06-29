package com.java.dev;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String str = "abccdefg";
		System.out.println(lengthOfLongestSubstring(str));
	}
	
	 public static int lengthOfLongestSubstring(String str) {
	        Set<Character> setOfChars = new HashSet<>();
			int count=0, j=0;
			for(int i=0; i< str.length(); i++) {
				if(!setOfChars.contains(str.charAt(i))) {
				setOfChars.add(str.charAt(i));
				count = Math.max(count, i - j);
				}
				else {
					setOfChars.remove(str.charAt(j++));
	            }
			}
			return count;
	    }

}
