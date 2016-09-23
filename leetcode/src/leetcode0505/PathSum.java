package leetcode0505;
import java.util.*;
/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class PathSum {
//深度优先遍历的非递归实现  类似二叉树的前序遍历
public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
        	return false;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        TreeNode current =new TreeNode(0);
        int currentval =0;
        while(!s.isEmpty()){
        	current=s.pop();
        	currentval=current.val;
        	if(current.left==null&&current.right==null){
        		if(current.val==sum){
        			return true;
        		}
        	}else{
        	if(current.right!=null){
        		current.right.val+=currentval;//记录上一层节点到它的值
        		s.push(current.right);
        	}
        	if(current.left!=null){
        		current.left.val+=currentval;
        		s.push(current.left);
        	}
        	}
        }
        return false;
    }
//递归实现
public boolean dfs(TreeNode root, int sum, int cur) {
	
	if(root==null){
		return false;
	}
	if(root.left==null&root.right==null){
		return cur+root.val==sum;
	}else{
		return dfs(root.left, sum, cur+root.val)||dfs(root.right,sum,cur+root.val);
	}
}
}




class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
