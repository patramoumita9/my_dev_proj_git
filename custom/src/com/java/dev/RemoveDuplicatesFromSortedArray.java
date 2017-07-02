package com.java.dev;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = {};
		System.out.println(removeDuplicates(nums));
	}

	/* First way */
//	public static int removeDuplicates(int[] nums) {
//		Set<Integer> set = new HashSet<Integer>();
//		for(int i=0; i<nums.length; i++) {
//		if(!set.contains(nums[i])){
//			set.add(nums[i]);
//		}
//		}
//        return set.size();
//    }
	
	/* Second way */
	public static int removeDuplicates(int[] nums) {
		int count=0;
		if(nums.length==0)
			return count;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1])
				count++;
		}
		return count+1;
    }

}
