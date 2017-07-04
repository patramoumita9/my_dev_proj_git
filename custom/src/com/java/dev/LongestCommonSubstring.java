package com.java.dev;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String[] strs = {"abca","aba","aaab"};
		System.out.println(longestCommonSubstring(strs));
	}

	private static String longestCommonSubstring(String[] strs) {
		 String str = "";
			if(strs.length==1)
				return strs[0];
			for(int i=0; i<strs.length-1; i++) {
				if(strs[i].length() < strs[i+1].length()) {
					str = strs[i];
				}
				else{
					str = strs[i+1];
				}
			}
			for(int i=0; i<strs.length; i++) {
				while(strs[i].indexOf(str)!=0){
					if(str.length()==1){
						str = "";
					}
					else 
					str = str.substring(0, str.length()-1);
				}
			}
			return str;
	}
}
