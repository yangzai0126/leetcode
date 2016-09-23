package dfs0811;

import java.util.*;

/*
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Subscribe to see which companies asked this question
 */

//第二种方式虽然采用了HashMap但是效率不高
public class BalancedBinaryTree {
public boolean isBalanced(TreeNode root) {
	    if(root==null||(root.left==null&&root.right==null))
        return true;
	    else if(root.left!=null&&root.right!=null){
	    	if(Math.abs(depth(root.left)-depth(root.right))>1||!isBalanced(root.left)||!isBalanced(root.right))
	    		return false;//时间复杂度偏高 原因是depth重复计算
	    }else if(root.left==null&&depth(root.right)>1)
	    	return false;
	    else if(depth(root.left)>1) 
	    	return false;
	    return true;
        
    }
public int depth(TreeNode root){
	if(root==null)
		return 0;
	else
		return Math.max(depth(root.left), depth(root.right))+1;
	
}
public boolean isBalanced1(TreeNode root){
	Map<TreeNode,Integer> map =new HashMap<TreeNode,Integer>();
	depth(root,map);//只计算一次
	map.put(null, 0);
	return isBalanced2(root,map);
}
public boolean isBalanced2(TreeNode root,Map<TreeNode,Integer> map){
	if(root==null||(root.left==null&&root.right==null))
        return true;
	    else{ 
	    	if(root.left!=null&&root.right!=null){
	    	if(Math.abs(map.get(root.left)-map.get(root.right))>1||!isBalanced2(root.left,map)||!isBalanced2(root.right,map))
	    		return false;//时间复杂度偏高 原因是depth重复计算
	    }else if(root.left==null&&map.get(root.right)>1)
	    	return false;
	    else if(map.get(root.left)>1) 
	    	return false;
	    }
	    return true;
}
//将每一个节点的深度用HashMap存储起来
public int depth(TreeNode root, Map<TreeNode,Integer> map){
	int max=0;
	if(root==null)
		return 0;
	else
		max= Math.max(depth(root.left,map), depth(root.right,map))+1;
	    map.put(root, max);
	    return max;
}
}
