package com.java.dev;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
		if(!set.contains(nums[i])){
			set.add(nums[i]);
		}
		}
        return set.size();
    }
	
}
