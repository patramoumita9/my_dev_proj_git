package com.java.dev;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int nums[] = {1,3,5,7};
		int target = 8;
		System.out.println(searchInsert(nums, target));
	}
	
	 public static int searchInsert(int[] nums, int target) {
		 int left=0, right=nums.length-1;
		 int mid = 0;
		 while(left<=right){
	             mid = (left+right)/2;
	            if(nums[mid] == target)
	            	return mid;
	            else if(nums[mid] > target)
	            	right = mid-1;
	            else if(nums[mid] < target)
	            	left = mid+1;
	        }
		return left;
	    }
}
