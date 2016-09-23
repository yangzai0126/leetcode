package leetcode0505;
/*
 * Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,

此题简单是因为  树perfect;
 */
public class PopulationNextRight {

public void connect(TreeLinkNode root) {
        if(root==null){
        	return;
        }else{
        	root.next=null;
        	connectr(root,null);
        }
    }
public void connectr(TreeLinkNode root,TreeLinkNode right){
	if(root==null){
		return;
	}
	if(root.left==null){
		return;
	}
	else{
		root.left.next=root.right;
		if(right!=null){
		root.right.next=right.left;
		}else{
			root.right.next=null;
		}
		connectr(root.left,root.left.next);
		connectr(root.right,root.right.next);
	}
	
}
}
class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }