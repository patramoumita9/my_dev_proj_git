package com.java.dev.LinkedList;

public class OperationOnLinkedList {

	static ListNode head = new ListNode(0);
	public static void main(String[] args) {
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		remove(5);
	}

	private static void insert(int i) {
		ListNode currNode = new ListNode(i);
		currNode.next = head;
		head = currNode;
	}
	private static void remove(int position) {
		ListNode temp = head;
		if(head==null)
			return;
		else if (position==0){
			head=temp.next;
			return;
		}
			else{
				for(int i=0;i<position-1;i++){
					temp=temp.next;
					if(temp==null || temp.next==null){
						System.out.println("position does not exist");
						return;
					}
					else{
						ListNode next = temp.next.next;
						temp.next=next;
					}
				}
			}
	}
}
