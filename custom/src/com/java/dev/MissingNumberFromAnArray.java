package com.java.dev;

public class MissingNumberFromAnArray {

	public static void main(String[] args) {
		//array elements should not be 0
		int arr[] = {1,2,3,4,6,7,8};
		int count=8;
		System.out.println(findMissingNumber(arr, count));
		int num[] = {1,2,3,4,5,6,7,8,8,9,10};
		int n= 10;
		System.out.println(findDuplicateNumber(num, n));
	}

	private static int findMissingNumber(int[] arr, int count) {
		int sum = (count*(count+1))/2;
		int actualSum=0;
		for(int i : arr) {
			actualSum += i;
		}
		return sum - actualSum;
	}
	
	private static int findDuplicateNumber(int[] arr, int count) {
		int sum = (count*(count+1))/2;
		int actualSum=0;
		for(int i : arr) {
			actualSum += i;
		}
		return actualSum - sum;
	}

}
