package com.java.dev.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumInLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		ListNode l1 = new ListNode(123);
		ListNode l2 = new ListNode(456);
		ListNode n = addTwoNumbers(l1,l2);
		System.out.println(n.next.val+""+n.val);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) 
	        	p = p.next;
	        if (q != null) 
	        	q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}
	
}
