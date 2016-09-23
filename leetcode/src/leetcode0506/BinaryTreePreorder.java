package leetcode0506;
import java.util.*;
/*
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?

Subscribe to see which companies asked this question
 */
public class BinaryTreePreorder {

	 public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer> l =new ArrayList<Integer>();
	        preOrder(root,l);
	        return l;
	    }
	 public void preOrder(TreeNode root,List<Integer> l){
		 if(root==null){
			 return;
		 }else{
			 l.add(root.val);
			 preOrder(root.left,l);
			 preOrder(root.right,l);
		 }
	 }
}
