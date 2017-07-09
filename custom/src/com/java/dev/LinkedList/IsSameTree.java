package com.java.dev.LinkedList;

public class IsSameTree {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(10);
		TreeNode q = new TreeNode(10);
		System.out.println(isSameTree(p, q));
	}
	
	private static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
	    if(p == null || q == null) return false;
	    if(p.val == q.val)
	        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	    return false;
    }

}
