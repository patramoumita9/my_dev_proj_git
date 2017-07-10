package com.java.dev;

public class PlusOne {

	public static void main(String[] args) {
		int arr[] = {9,9,9};
		int ar[] = new int[3];
		ar[0]=1;
		plusOne(arr);
	}
	public static int[] plusOne(int[] digits) {
		for(int i = digits.length-1; i>=0; i--){
			if(digits[i]!=9){
				digits[i]++;
				return digits;
			}
			else{
				digits[i]=0;
			}
		}
		int[] res = new int[digits.length+1];
	        res[0] = 1;
		return res;
	}
}
