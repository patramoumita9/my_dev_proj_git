package com.java.dev.LinkedList;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		ListNode node1 = new ListNode(1);
		node.next=node1;
		ListNode node2 = new ListNode(1);
		node1.next=node2;
		deleteDuplicates(node);
	}
	public static ListNode deleteDuplicates(ListNode l) {
		if(l==null)
			return l;
		else if(l.next != null && l.val!=l.next.val)
			deleteDuplicates(l.next);
		else if(l.next != null && l.val==l.next.val){
			if(l.next.next!=null){
				l.next=l.next.next;
				deleteDuplicates(l);
			}
				else{
					l.next=null;
					return l;
				}
		}
		return l;
	}
}
