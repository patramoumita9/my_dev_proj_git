package com.java.dev.LinkedList;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(135);
		ListNode l2 = new ListNode(247);
		mergeTwoLists(l1,l2);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1 == null) 
			 return l2;
	        if(l2 == null) 
	        	return l1;
	        
	        if(l1.val < l2.val) {
	            l1.next = mergeTwoLists(l1.next, l2);
	            return l1;
	        } else {
	            l2.next = mergeTwoLists(l2.next, l1);
	            return l2;
	        }
    }
}
