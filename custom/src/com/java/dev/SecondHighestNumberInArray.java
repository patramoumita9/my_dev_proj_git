package com.java.dev;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int nums[] = {1,5,9,3,7,8,11};
		findSecondHighestNumber(nums);
	}

	private static void findSecondHighestNumber(int[] nums) {
		 int maxOne = 0;
	        int maxTwo = 0;
	        for(int n:nums){
	            if(maxOne < n){
	                maxTwo = maxOne;
	                maxOne =n;
	            } else if(maxTwo < n){
	                maxTwo = n;
	            }
	        }
		System.out.println(maxOne);
		System.out.println(maxTwo);
	}

}
