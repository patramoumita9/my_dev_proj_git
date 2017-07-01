package com.java.dev;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 11111;
		int temp = number,r=0, sum = 0;;
		while(number>0) {
			r = number%10;
			sum = sum*10+r;
			number=number/10;
		}
			if(temp==sum)
				System.out.println("It is palindrome");
			else 
				System.out.println("Not a palindrome");
	}

}
