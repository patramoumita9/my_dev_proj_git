package com.java.dev;

public class ImplementStrStr {

	public static void main(String[] args) {
		String s = "moumita";
		String str = "mita";
		System.out.println(strStr(s,str));
	}

	 public static int strStr(String haystack, String needle) {
		 if(haystack.length()==0)
			 return 0;
		 else if(haystack.contains(needle)){
			return haystack.indexOf(needle);
		 }
		 else
	     return -1;   
	}
}
