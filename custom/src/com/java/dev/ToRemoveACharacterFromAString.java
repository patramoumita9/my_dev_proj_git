package com.java.dev;

public class ToRemoveACharacterFromAString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Moumitam");
		char ch = 'm';
		boolean check = false;
		for(int i = 0; i<str.length(); i++) {
			char c= str.charAt(i);
			if(c==ch) {
				str.deleteCharAt(i);
				check = true;
			}
		}
		if(check)
		System.out.println("After removing the character "+str);
		else 
			System.out.println("The character is not found in this string");
	}

}
