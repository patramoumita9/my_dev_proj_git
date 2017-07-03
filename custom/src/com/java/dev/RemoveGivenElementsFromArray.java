package com.java.dev;

import java.util.Arrays;

public class RemoveGivenElementsFromArray {

	public static void main(String[] args) {
		int nums[]={2,2,3};
		int val=2;
		System.out.println(removeElements(nums, val));
		System.out.println(removeElement(nums, val));
	}
	private static int removeElements(int[] nums, int val) {
		 int i=0;
			for(int j=0; j<nums.length; j++) {
				if(nums[j]!=val){
	                nums[i]=nums[j];
					i++;
	        }
			}
			return i;
	}
	public static int removeElement(int[] nums, int val) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(nums.length>2 && i==0 && nums[i]==val && nums[i+1]==val){
				count=i;
				for(int j=count;j<nums.length-1;j++){
					nums[count]=nums[j+1];
					count++;
				}
				nums = Arrays.copyOf(nums, nums.length-1);
				nums[i]=nums[i+1];
				nums = Arrays.copyOf(nums, nums.length-1);
			}
		else if(nums[i]==val){
				count=i;
				for(int j=count;j<nums.length-1;j++){
					nums[count]=nums[j+1];
					count++;
				}
				nums = Arrays.copyOf(nums, nums.length-1);
				}
		}
		if(nums.length==1 && nums[0]==val){
			nums = Arrays.copyOf(nums, nums.length-1);
		}
		return nums.length;
	}
}
