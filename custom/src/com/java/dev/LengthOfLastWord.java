package com.java.dev;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = " abc  ";
		System.out.println(lengthOfLastWord(str));
	}

	private static int lengthOfLastWord(String s) {
		StringBuilder stb = new StringBuilder(s);
		if(s.isEmpty())
			return 0;
		for(int i=stb.length()-1; i>=0; i-- ) {
		if(stb.charAt(i)==' ' && i!=stb.length()-1){
			return (stb.length()-1) - i;
		}
		else if(stb.charAt(i)==' '){
			stb = stb.deleteCharAt(i);
		}
		}
		return stb.length();
	}

}
