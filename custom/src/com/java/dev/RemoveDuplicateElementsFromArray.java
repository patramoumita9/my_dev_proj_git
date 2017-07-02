package com.java.dev;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		int nums[]={2,3,3,4};
		int val=3;
		System.out.println(removeElement(nums, val));
	}
	public static int removeElement(int[] nums, int val) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val){
				count++;
			}
		}
		return count;
	}
}
