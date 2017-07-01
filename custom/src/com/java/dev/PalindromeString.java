package com.java.dev;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "121";
		int left = 0, right = str.length()-1;
		boolean check = false;
		while(left<right) {
		if(str.charAt(left)==str.charAt(right)){
			left = left + 1;
			right = right - 1;
		}
		else {
			check = true;
			System.out.println("It is not palindrome");
			break;
		}
	  }
		if(!check){
			System.out.println("It is Palindrome");
		}
	}

}
