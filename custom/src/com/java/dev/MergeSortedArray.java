package com.java.dev;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,0,0,0};
		int[] num2 = {2,5,6};
		int m=3, n=3;
		merge(num1, m, num2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	      for(int i=m, j=0; i<m+n && j<n; i++, j++) {
	    	  nums1[i] = nums2[j];
	      }
	      Arrays.sort(nums1);
	}
}
