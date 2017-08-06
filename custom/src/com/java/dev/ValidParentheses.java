package com.java.dev;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "())";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		 boolean check = false;
		 Stack<Character> stack = new Stack<>();
		 for(int i=0; i<s.length(); i++) {
			 if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				 stack.push(s.charAt(i));
			 else if(!stack.isEmpty() && s.charAt(i)==')' && stack.peek()=='(')
				 stack.pop();
			 else if(!stack.isEmpty() && s.charAt(i)=='}' && stack.peek()=='{')
				 stack.pop();
			 else if(!stack.isEmpty() && s.charAt(i)==']' && stack.peek()=='[')
				 stack.pop();
			 else
				 return false;
		 }
     	return stack.isEmpty();
    }

}
