package com.java.dev;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int num[] = {3,2,5,1};
    	int target = 7;
    	int arry[] = twoSum(num, target);
    	for(int n : arry)
    		System.out.println(n);
	}
	
	//another way
//	public static int[] twoSum(int[] nums, int target) {
//        int arr[] = new int[2];
//        for(int i=0; i<nums.length; i++){
//        	for(int j = i+1; j<nums.length; j++) {
//            if(nums[i]+nums[j]==target) {
//                arr[0] = i;
//                arr[1] = j;
//                return arr;
//            }
//        	}
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
